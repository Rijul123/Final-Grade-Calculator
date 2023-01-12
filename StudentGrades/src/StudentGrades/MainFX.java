package StudentGrades;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class MainFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	   public static void main(String args[]){ 
		      launch(args); 
		   } 

}
