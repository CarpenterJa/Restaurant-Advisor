package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FineDiningController extends Main{
	@FXML
	private Label name1, cuisineType1, priceRange1, hours1, rating1, name2, cuisineType2, priceRange2, hours2, rating2;

	public void initialize() {
		name1.setText(restaurants.get(5).getName());
		cuisineType1.setText(restaurants.get(5).getCuisineType().get(0));
		priceRange1.setText("Price: " + restaurants.get(5).getPriceRange());
		hours1.setText("Open: " + restaurants.get(5).getHoursOfOperation());
		rating1.setText("Rating: " + ratings.get(5).getValue() + "/5 (" + ratings.get(5).getAmount() + ")");
		name2.setText(restaurants.get(8).getName());
		cuisineType2.setText(restaurants.get(8).getCuisineType().get(0));
		priceRange2.setText("Price: " + restaurants.get(8).getPriceRange());
		hours2.setText("Open: " + restaurants.get(8).getHoursOfOperation());
		rating2.setText("Rating: " + ratings.get(8).getValue() + "/5 (" + ratings.get(8).getAmount() + ")");
	}

	public void chopHouse(ActionEvent event) throws IOException {
		String fxmlName = "/application/ChopHouse.fxml";
		loadNewStage(event, fxmlName);
	}

	public void zarletti(ActionEvent event) throws IOException {
		String fxmlName = "/application/Zarletti.fxml";
		loadNewStage(event, fxmlName);
	}

	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}

}
