package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BuffaloWildWingsController extends Main {
	@FXML
	private Label name, address, phone, email, foodItem1, foodItem2, foodItem3;

	public void initialize() {
		name.setText(restaurants.get(6).getName());
		address.setText("Address: " + restaurants.get(6).getAddress());
		phone.setText("Phone: " + restaurants.get(6).getPhoneNumber());
		email.setText("Email: " + restaurants.get(6).getEmail());
		foodItem1.setText(
				restaurants.get(6).getMenu().get(0).getName() + " $" + restaurants.get(6).getMenu().get(0).getPrice());
		foodItem2.setText(
				restaurants.get(6).getMenu().get(1).getName() + " $" + restaurants.get(6).getMenu().get(1).getPrice());
		foodItem3.setText(
				restaurants.get(6).getMenu().get(2).getName() + " $" + restaurants.get(6).getMenu().get(2).getPrice());
	}

	public void rateBuffaloWildWings(ActionEvent event) throws IOException {
		String fxmlName = "/application/Rate.fxml";
		RateController r = new RateController();
		r.restaurant(6);
		loadNewStage(event, fxmlName);
	}
	
	public void commentBuffaloWildWings(ActionEvent event) throws IOException {
		String fxmlName = "/application/Comments.fxml";
		String file = "BuffaloWildWingsComments.txt";
		CommentsController c = new CommentsController();
		c.setFileName(file);
		loadNewStage(event, fxmlName);
	}

	public void returnToCasualDining(ActionEvent event) throws IOException {
		String fxmlName = "/application/CasualDining.fxml";
		loadNewStage(event, fxmlName);
	}
}
