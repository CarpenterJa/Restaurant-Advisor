package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PandaExpressController extends Main {
	@FXML
	private Label name, address, phone, email, foodItem1, foodItem2, foodItem3;

	public void initialize() {
		name.setText(restaurants.get(10).getName());
		address.setText("Address: " + restaurants.get(10).getAddress());
		phone.setText("Phone: " + restaurants.get(10).getPhoneNumber());
		email.setText("Email: " + restaurants.get(10).getEmail());
		foodItem1.setText(restaurants.get(10).getMenu().get(0).getName() + " $"
				+ restaurants.get(10).getMenu().get(0).getPrice());
		foodItem2.setText(restaurants.get(10).getMenu().get(1).getName() + " $"
				+ restaurants.get(10).getMenu().get(1).getPrice());
		foodItem3.setText(restaurants.get(10).getMenu().get(2).getName() + " $"
				+ restaurants.get(10).getMenu().get(2).getPrice());
	}

	public void ratePandaExpress(ActionEvent event) throws IOException {
		String fxmlName = "/application/Rate.fxml";
		RateController r = new RateController();
		r.restaurant(10);
		loadNewStage(event, fxmlName);
	}
	
	public void commentPandaExpress(ActionEvent event) throws IOException {
		String fxmlName = "/application/Comments.fxml";
		String file = "PandaExpressComments.txt";
		CommentsController c = new CommentsController();
		c.setFileName(file);
		loadNewStage(event, fxmlName);
	}


	public void returnToFastFood(ActionEvent event) throws IOException {
		String fxmlName = "/application/FastFood.fxml";
		loadNewStage(event, fxmlName);
	}
}
