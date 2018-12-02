package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FamilyStyleController extends Main{
	@FXML
	private Label name1, cuisineType1, priceRange1, hours1, rating1, name2, cuisineType2, priceRange2, hours2, rating2;

	public void initialize() {
		name1.setText(restaurants.get(4).getName());
		cuisineType1.setText(restaurants.get(4).getCuisineType().get(0));
		priceRange1.setText("Price: " + restaurants.get(4).getPriceRange());
		hours1.setText("Open: " + restaurants.get(4).getHoursOfOperation());
		rating1.setText("Rating: " + ratings.get(4).getValue() + "/5 (" + ratings.get(4).getAmount() + ")");
		name2.setText(restaurants.get(9).getName());
		cuisineType2.setText(restaurants.get(9).getCuisineType().get(0) + " and " + restaurants.get(9).getCuisineType().get(1));
		priceRange2.setText("Price: " + restaurants.get(9).getPriceRange());
		hours2.setText("Open: " + restaurants.get(9).getHoursOfOperation());
		rating2.setText("Rating: " + ratings.get(9).getValue() + "/5 (" + ratings.get(9).getAmount() + ")");
	}

	public void bollywood(ActionEvent event) throws IOException {
		String fxmlName = "/application/Bollywood.fxml";
		loadNewStage(event, fxmlName);
	}

	public void potbelly(ActionEvent event) throws IOException {
		String fxmlName = "/application/Potbelly.fxml";
		loadNewStage(event, fxmlName);
	}

	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}

}
