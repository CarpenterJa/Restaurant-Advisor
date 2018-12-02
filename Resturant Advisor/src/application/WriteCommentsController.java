package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class WriteCommentsController extends Main{
	static String fileName;
	
	@FXML
	private TextArea newComment;
	
	public void setCommentFile(String f)
	{
		fileName=f;
	}
	
	public void addComment(ActionEvent event) throws IOException {
		String userComment = newComment.getText();
		Writer output;
		output = new BufferedWriter(new FileWriter(fileName, true));
		output.append(System.lineSeparator() + System.lineSeparator() + userComment);
		output.close();
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}
	
	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}

}
