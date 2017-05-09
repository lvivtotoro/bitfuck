package org.midnightas.bitfuck;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// does not work yet
public class bitfuck$assistant extends Application {
	
	public Menu fileMenu = new Menu("File");
	
	public MenuBar menuBar = new MenuBar();
	{
		menuBar.getMenus().add(fileMenu);
	}
	
	public VBox menuContainer = new VBox(menuBar);
	
	public TextArea textArea = new TextArea();
	{
		textArea.setPrefColumnCount(30);
		textArea.setPrefRowCount(10);
		textArea.setWrapText(true);
		textArea.setOnKeyTyped(kE -> {
			if(kE.getCharacter().equals(" ")) {
				Platform.runLater(textArea::deleteNextChar);
			}
		});
		textArea.textProperty().addListener((obs, o, n) -> {
			if(n.matches(".*[^0-9 ].*")) {
				textArea.setText(n.replaceAll("[^0-9 ]", ""));
				textArea.requestFocus();
			}
		});
	}
	
	public BorderPane borders = new BorderPane();
	{
		borders.setTop(menuContainer);
		borders.setCenter(textArea);
	}
	
	public Scene scene = new Scene(borders);
	
	public void start(Stage stage) {
		stage.setScene(scene);
		stage.show();
	}
	
	public static final void main(String[] args) {
		launch(args);
	}
	
}
