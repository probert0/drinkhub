package logic.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NewCocktailView extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/logic/sample/SampleNewCocktail.fxml"));
		FXMLLoader loader = new FXMLLoader();
		loader.setController(new NewCocktailViewController());
	    stage.setScene(new Scene(root));
	    stage.show();
		
	}

}
