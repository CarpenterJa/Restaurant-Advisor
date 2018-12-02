package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FastFoodController extends Main {
	@FXML
	private Label name1, cuisineType1, priceRange1, hours1, rating1, name2, cuisineType2, priceRange2, hours2, rating2;

	public void initialize() {
		name1.setText(restaurants.get(1).getName());
		cuisineType1.setText(restaurants.get(1).getCuisineType().get(0));
		priceRange1.setText("Price: " + restaurants.get(1).getPriceRange());
		hours1.setText("Open: " + restaurants.get(1).getHoursOfOperation());
		rating1.setText("Rating: " + ratings.get(1).getValue() + "/5 (" + ratings.get(1).getAmount() + ")");
		name2.setText(restaurants.get(10).getName());
		cuisineType2.setText(restaurants.get(10).getCuisineType().get(0));
		priceRange2.setText("Price: " + restaurants.get(10).getPriceRange());
		hours2.setText("Open: " + restaurants.get(10).getHoursOfOperation());
		rating2.setText("Rating: " + ratings.get(10).getValue() + "/5 (" + ratings.get(10).getAmount() + ")");
	}

	public void mcdonalds(ActionEvent event) throws IOException {
		String fxmlName = "/application/McDonalds.fxml";
		loadNewStage(event, fxmlName);
	}

	public void pandaExpress(ActionEvent event) throws IOException {
		String fxmlName = "/application/PandaExpress.fxml";
		loadNewStage(event, fxmlName);
	}

	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}

}
