package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NewUserController extends LoginController {
	@FXML
	private TextField newUsername;

	@FXML
	private TextField newPassword;

	@FXML
	private Button button;
	
	@FXML
	private Label errorMessage;

	public void initialize() {
		button.setDefaultButton(true);
	}

	public void createAccount(ActionEvent event) throws IOException {
		String user=newUsername.getText();
		String pass=newPassword.getText();
		if(user.equals("") || pass.equals(""))
		{
			errorMessage.setText("Your username and/or password cannot be blank");
		}
		else if(userData.containsKey(user))
		{
			errorMessage.setText("The username you have entered has already been taken" + System.lineSeparator() + "Please enter another username");
		}
		else if(user.contains(" ") || pass.contains(" "))
		{
			errorMessage.setText("Your username and/or password cannot contain spaces");
		}
		else if(user.length()<6 || pass.length()<6)
		{
			errorMessage.setText("Your username and/or password must have a minimum length of 6 characters");
		}
		else
		{
			Writer output;
			output = new BufferedWriter(new FileWriter("userDatabase.txt", true));
			output.append(System.lineSeparator() + user + " " + pass);
			output.close();
			userData.put(user, pass);
			String fxmlName = "/application/UserLogin.fxml";
			loadNewStage(event, fxmlName);
		}
		
	}

}
