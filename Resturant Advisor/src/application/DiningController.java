package application;

import java.io.IOException;
import javafx.event.ActionEvent;

public class DiningController extends Main {

	public void fineDining(ActionEvent event) throws IOException {
		String fxmlName = "/application/FineDining.fxml";
		loadNewStage(event, fxmlName);
	}

	public void casualDining(ActionEvent event) throws IOException {
		String fxmlName = "/application/CasualDining.fxml";
		loadNewStage(event, fxmlName);
	}

	public void fastFood(ActionEvent event) throws IOException {
		String fxmlName = "/application/FastFood.fxml";
		loadNewStage(event, fxmlName);
	}

	public void fastCasual(ActionEvent event) throws IOException {
		String fxmlName = "/application/FastCasual.fxml";
		loadNewStage(event, fxmlName);
	}

	public void familyStyle(ActionEvent event) throws IOException {
		String fxmlName = "/application/FamilyStyle.fxml";
		loadNewStage(event, fxmlName);
	}
	
	public void logOut(ActionEvent event) throws IOException {
		String fxmlName = "/application/UserLogin.fxml";
		loadNewStage(event, fxmlName);
	}

}
