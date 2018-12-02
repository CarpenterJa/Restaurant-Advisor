package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CasualDiningController extends Main{
	@FXML
	private Label name1, cuisineType1, priceRange1, hours1, rating1, name2, cuisineType2, priceRange2, hours2, rating2;

	public void initialize() {
		name1.setText(restaurants.get(6).getName());
		cuisineType1.setText(restaurants.get(6).getCuisineType().get(0));
		priceRange1.setText("Price: " + restaurants.get(6).getPriceRange());
		hours1.setText("Open: " + restaurants.get(6).getHoursOfOperation());
		rating1.setText("Rating: " + ratings.get(6).getValue() + "/5 (" + ratings.get(6).getAmount() + ")");
		name2.setText(restaurants.get(7).getName());
		cuisineType2.setText(restaurants.get(7).getCuisineType().get(0));
		priceRange2.setText("Price: " + restaurants.get(7).getPriceRange());
		hours2.setText("Open: " + restaurants.get(7).getHoursOfOperation());
		rating2.setText("Rating: " + ratings.get(7).getValue() + "/5 (" + ratings.get(7).getAmount() + ")");
	}

	public void buffaloWildWings(ActionEvent event) throws IOException {
		String fxmlName = "/application/BuffaloWildWings.fxml";
		loadNewStage(event, fxmlName);
	}

	public void tangled(ActionEvent event) throws IOException {
		String fxmlName = "/application/Tangled.fxml";
		loadNewStage(event, fxmlName);
	}

	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}

}
