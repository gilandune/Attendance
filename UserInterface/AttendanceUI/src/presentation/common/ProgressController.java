package presentation.common;
import java.io.IOException;

import presentation.common.entities.TaskResponse;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ProgressController extends AnchorPane
{
	private Stage ParentStage;
	private final Stage stage = new Stage();
	private final Scene nscene;
	@FXML public ProgressIndicator progressCircle = new ProgressIndicator();
	public ProgressController(Stage parentStage)
	{
		this.ParentStage = parentStage;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/presentation/common/Progress.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try
		{
			Parent root = (Parent)fxmlLoader.load();
			root.getStylesheets().add(this.getClass().getResource("/presentation/common/Images/JMetroLightTheme.css").toExternalForm());
			nscene = new Scene(root);
			nscene.setFill(Color.TRANSPARENT);
			this.setStyle("-fx-background-color : transparent");
		}
		catch (IOException exception)
		{
			throw new RuntimeException(exception);
		}
	}
	/**
	 * Método que muestra el progress sobre una tarea determinada.
	 * @param task : Tarea que encerrará en progress
	 * @author Lázaro Adrián González Montoya
	 */
	public void showProgess(final Task <TaskResponse> task)
	{
		stage.initModality(Modality.APPLICATION_MODAL);		
		stage.setScene(nscene);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setWidth(190);
		stage.setHeight(150);
		stage.setResizable(false);
		stage.setX(ParentStage.getX() + ParentStage.getWidth() / 2 - stage.getWidth() / 2);
		stage.setY(ParentStage.getY() + ParentStage.getHeight() / 2 - stage.getHeight() / 2);
		setTask(task);
		stage.show();
	}
	/**
	 * Método que cierra y el progress
	 * @author Lázaro Adrián González Montoya
	 */
	public void closeProgress()
	{
		this.stage.close();
	}
	private void setTask(Task <TaskResponse> task)
	{
		progressCircle.progressProperty().bind(task.progressProperty());
	}
}
