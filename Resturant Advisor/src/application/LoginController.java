package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController extends Main {

	@FXML
	private Label labelStatus;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private Button button;

	public void initialize() {
		button.setDefaultButton(true);
	}

	public void Login(ActionEvent event) throws IOException {

		if (userData.containsKey(username.getText()) && userData.get(username.getText()).equals(password.getText())) {
			String fxmlName = "/application/TypesOfDining.fxml";
			loadNewStage(event, fxmlName);
		} else {
			labelStatus.setTextFill(Color.RED);
			labelStatus.setText("Login Failed");
		}
	}

	public void newUser(ActionEvent event) throws IOException {
		String fxmlName = "/application/UserSignUp.fxml";
		loadNewStage(event, fxmlName);
	}

}
