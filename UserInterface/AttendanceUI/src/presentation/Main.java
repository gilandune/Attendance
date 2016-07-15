package presentation;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import presentation.security.*;

public class Main extends Application 
{
	@Override
	public void start(Stage stage) throws IOException
	{
		LoginController login = new LoginController(stage);
		login.show();
	}
	public static void main(String[] args) 
	{
		launch(args);
	}
}
