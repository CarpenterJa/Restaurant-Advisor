package application;

/**
 * <This is a Restaurant Advisor program using javafx scene builder.> 
 *
 * @author <Jimmy Carpenter, Mark Ward, Vibin Dominic>
 * @version <Created: 10/22/2018>
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	static Map<Integer, Restaurant> restaurants;
	static Map<Integer, Rating> ratings;
	static Map<String, String> userData;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/UserLogin.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// primaryStage.setOpacity(.9);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Resturant Advisor Login");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadNewStage(ActionEvent event, String fxmlName) throws IOException {
		Parent newParent = FXMLLoader.load(getClass().getResource(fxmlName));
		Scene newScene = new Scene(newParent);
		Stage newStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		newScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		newStage.hide();
		newStage.setScene(newScene);
		newStage.setTitle("Restaurant Advisor");
		newStage.show();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Main m = new Main();
		m.readUserDataFile();
		m.readRestaurantFile();
		m.readRatingsFile();
		launch(args);
	}

	public void readRatingsFile() throws FileNotFoundException {
		ratings = new HashMap<Integer, Rating>();
		Scanner ratingsFile = new Scanner(new File("ratings.txt"));
		String temp;
		int key;
		String value;
		String amount;
		String[] tempArray;
		while (ratingsFile.hasNextLine()) {
			temp = ratingsFile.nextLine();
			tempArray = temp.split(";");
			key = Integer.parseInt(tempArray[0]);
			value = tempArray[1];
			amount = tempArray[2];
			ratings.put(key, new Rating(value, amount));
		}
		ratingsFile.close();
		// System.out.println(ratings);
	}

	public void readRestaurantFile() throws FileNotFoundException {
		restaurants = new HashMap<Integer, Restaurant>();
		Scanner restaurantFile = new Scanner(new File("restaurants.txt"));
		String temp;
		String[] tempArray;
		String[] tempArray2;
		String[] parts;
		int id;
		String name;
		String address;
		String phoneNumber;
		String hoursOfOperation;
		String email;
		String cuisines;
		String diningType;
		String priceRange;
		String food;
		String price;
		while (restaurantFile.hasNextLine()) {
			ArrayList<String> cuisineTypes = new ArrayList<String>();
			ArrayList<Food> menu = new ArrayList<Food>();
			temp = restaurantFile.nextLine();
			parts = temp.split(";");
			id = Integer.parseInt(parts[0]);
			name = parts[1];
			address = parts[2];
			phoneNumber = parts[3];
			hoursOfOperation = parts[4];
			email = parts[5];
			cuisines = parts[6];
			tempArray = cuisines.split(",");
			for (int i = 0; i < tempArray.length; i++) {
				cuisineTypes.add(tempArray[i]);
			}
			diningType = parts[7];
			priceRange = parts[8];
			food = parts[9];
			price = parts[10];
			tempArray = food.split(",");
			tempArray2 = price.split(",");
			for (int i = 0; i < tempArray.length; i++) {
				menu.add(new Food(tempArray[i], tempArray2[i]));
			}

			restaurants.put(id, new Restaurant(name, address, phoneNumber, hoursOfOperation, email, cuisineTypes,
					diningType, priceRange, menu));
		}
		restaurantFile.close();
		// System.out.println(restaurants);
	}

	public void readUserDataFile() throws FileNotFoundException {
		userData = new HashMap<String, String>();
		String user;
		String pass;
		String temp;
		String tempArray[];
		Scanner userFile = new Scanner(new File("userDatabase.txt"));
		while (userFile.hasNextLine()) {
			temp = userFile.nextLine();
			tempArray = temp.split(" ");
			user = tempArray[0];
			pass = tempArray[1];
			userData.put(user, pass);
		}
		userFile.close();
	}

}
