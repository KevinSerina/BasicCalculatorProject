import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application
{
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Parent prnt = FXMLLoader.load(getClass().getResource("CalcLayout.fxml"));
		Scene scene = new Scene(prnt);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);

	}

}
