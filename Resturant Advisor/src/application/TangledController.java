package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TangledController extends Main {
	@FXML
	private Label name, address, phone, email, foodItem1, foodItem2, foodItem3;

	public void initialize() {
		name.setText(restaurants.get(7).getName());
		address.setText("Address: " + restaurants.get(7).getAddress());
		phone.setText("Phone: " + restaurants.get(7).getPhoneNumber());
		email.setText("Email: " + restaurants.get(7).getEmail());
		foodItem1.setText(
				restaurants.get(7).getMenu().get(0).getName() + " $" + restaurants.get(7).getMenu().get(0).getPrice());
		foodItem2.setText(
				restaurants.get(7).getMenu().get(1).getName() + " $" + restaurants.get(7).getMenu().get(1).getPrice());
		foodItem3.setText(
				restaurants.get(7).getMenu().get(2).getName() + " $" + restaurants.get(7).getMenu().get(2).getPrice());
	}

	public void rateTagnled(ActionEvent event) throws IOException {
		String fxmlName = "/application/Rate.fxml";
		RateController r = new RateController();
		r.restaurant(7);
		loadNewStage(event, fxmlName);
	}
	
	public void commentTangled(ActionEvent event) throws IOException {
		String fxmlName = "/application/Comments.fxml";
		String file = "TangledComments.txt";
		CommentsController c = new CommentsController();
		c.setFileName(file);
		loadNewStage(event, fxmlName);
	}

	public void returnToCasualDining(ActionEvent event) throws IOException {
		String fxmlName = "/application/CasualDining.fxml";
		loadNewStage(event, fxmlName);
	}
}
