package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FastCasualController extends Main {
	@FXML
	private Label name1, cuisineType1, priceRange1, hours1, rating1, name2, cuisineType2, priceRange2, hours2, rating2;

	public void initialize() {
		name1.setText(restaurants.get(2).getName());
		cuisineType1.setText(restaurants.get(2).getCuisineType().get(0));
		priceRange1.setText("Price: " + restaurants.get(2).getPriceRange());
		hours1.setText("Open: " + restaurants.get(2).getHoursOfOperation());
		rating1.setText("Rating: " + ratings.get(2).getValue() + "/5 (" + ratings.get(2).getAmount() + ")");
		name2.setText(restaurants.get(3).getName());
		cuisineType2.setText(restaurants.get(3).getCuisineType().get(0));
		priceRange2.setText("Price: " + restaurants.get(3).getPriceRange());
		hours2.setText("Open: " + restaurants.get(3).getHoursOfOperation());
		rating2.setText("Rating: " + ratings.get(3).getValue() + "/5 (" + ratings.get(3).getAmount() + ")");
	}

	public void qdoba(ActionEvent event) throws IOException {
		String fxmlName = "/application/Qdoba.fxml";
		loadNewStage(event, fxmlName);
	}

	public void subway(ActionEvent event) throws IOException {
		String fxmlName = "/application/Subway.fxml";
		loadNewStage(event, fxmlName);
	}

	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}

}
