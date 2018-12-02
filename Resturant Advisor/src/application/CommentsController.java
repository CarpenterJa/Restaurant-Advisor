package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class CommentsController extends Main{
	static String fileName;
	
	@FXML
	private TextArea commentsArea;
	
	public void initialize() throws FileNotFoundException {
		String comments="";
		Scanner commentsFile = new Scanner(new File(fileName));
		while (commentsFile.hasNextLine()) {
			comments = comments + commentsFile.nextLine() + System.lineSeparator();
		}
		commentsFile.close();
		commentsArea.appendText(comments);
	}
	
	public void setFileName(String f) {
		fileName=f;
	}
	
	public void backToHomeScreen(ActionEvent event) throws IOException {
		String fxmlName = "/application/TypesOfDining.fxml";
		loadNewStage(event, fxmlName);
	}
	
	public void wrtieComment(ActionEvent event) throws IOException {
		WriteCommentsController w = new WriteCommentsController();
		w.setCommentFile(fileName);
		String fxmlName = "/application/WriteComment.fxml";
		loadNewStage(event, fxmlName);
	}
	
	

}
