package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RateController extends Main {
	static int num;

	@FXML
	private Label name, submitted;

	@FXML
	private RadioButton one, two, three, four, five;

	public void initialize() {
		name.setText("How would you like to rate " + restaurants.get(num).getName() + "?");
	}

	public void restaurant(int i) {
		num = i;
	}

	public void rate(ActionEvent event) throws NumberFormatException, FileNotFoundException {
		double newRating = 0;
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		if (one.isSelected()) {
			newRating = ((Double.parseDouble(ratings.get(num).getValue())
					* Integer.parseInt(ratings.get(num).getAmount())) + 1)
					/ (Integer.parseInt(ratings.get(num).getAmount()) + 1);
		} else if (two.isSelected()) {
			newRating = ((Double.parseDouble(ratings.get(num).getValue())
					* Integer.parseInt(ratings.get(num).getAmount())) + 2)
					/ (Integer.parseInt(ratings.get(num).getAmount()) + 1);
		} else if (three.isSelected()) {
			newRating = ((Double.parseDouble(ratings.get(num).getValue())
					* Integer.parseInt(ratings.get(num).getAmount())) + 3)
					/ (Integer.parseInt(ratings.get(num).getAmount()) + 1);
		} else if (four.isSelected()) {
			newRating = ((Double.parseDouble(ratings.get(num).getValue())
					* Integer.parseInt(ratings.get(num).getAmount())) + 4)
					/ (Integer.parseInt(ratings.get(num).getAmount()) + 1);
		} else {
			newRating = ((Double.parseDouble(ratings.get(num).getValue())
					* Integer.parseInt(ratings.get(num).getAmount())) + 5)
					/ (Integer.parseInt(ratings.get(num).getAmount()) + 1);
		}

		
		ratings.put(num, new Rating(String.valueOf(twoDForm.format(newRating)),
				String.valueOf(Integer.parseInt(ratings.get(num).getAmount()) + 1)));	
		modifyRatings();
		submitted.setVisible(true);

	}

	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}

	public void modifyRatings() throws FileNotFoundException {
		PrintWriter outputStream = null;
		String line = "";
		for(int i=1; i<=ratings.size(); i++)
		{
			line=line + i + ";" + ratings.get(i).getValue() + ";" + ratings.get(i).getAmount() + System.lineSeparator();
		}
		outputStream = new PrintWriter(new FileOutputStream("ratings.txt"));
		outputStream.print(line);
		outputStream.close();
	
	}
}
