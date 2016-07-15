package presentation;
import java.io.IOException;

import org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario;

import presentation.Incidencias.Incidencias;
import presentation.comedor.Comedor;
import presentation.empleados.Empleados;
import presentation.horarios.Horarios;
import presentation.usuarios.UsuariosAdmin;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.*;
public class Attendance extends AnchorPane{
	private Usuario Usuario;
	public Attendance(Stage stage, Usuario usuario){
		this.Usuario = usuario;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/presentation/Attendance.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try{
			Parent root = (Parent)fxmlLoader.load();
			root.getStylesheets().add(this.getClass().getResource("/presentation/common/Images/JMetroLightTheme.css").toExternalForm());
		}
		catch (IOException exception){
			throw new RuntimeException(exception);
		}
	}
	private final Stage stage = new Stage();
	public void show(){
		stage.setScene(new Scene(this));
		stage.centerOnScreen();
		stage.setTitle("Attendance");
		stage.setResizable(true);
		IncrustaPanelEmpleados();
		IncrustaPanelHorarios();
		IncrustaPanelReporteComedor();
		IncrustaPanelIncidencias();
		IncrustaPanelUsuariosAdministradores();
		stage.show();
	}
	private void IncrustaPanelEmpleados(){
		Empleados PanelEmpleados = new Empleados(stage, Usuario);
		spEmpleados.getChildren().add(PanelEmpleados);
		//PanelEmpleados.FillGridEmpleados("");
	}
	private void IncrustaPanelHorarios(){
		Horarios PanelHorarios = new Horarios(stage, Usuario);
		spHorarios.getChildren().add(PanelHorarios);
		PanelHorarios.FillGridHorarios();
	}
	private void IncrustaPanelReporteComedor(){
		Comedor PanelComedor = new Comedor(stage, Usuario);
		spReporteComedor.getChildren().add(PanelComedor);
	}
	private void IncrustaPanelIncidencias(){
		Incidencias PanelIncidencias = new Incidencias(stage, Usuario);
		spIncidencias.getChildren().add(PanelIncidencias);
	}
	private void IncrustaPanelUsuariosAdministradores(){
		UsuariosAdmin PanelUsuariosAdmin = new UsuariosAdmin(stage, Usuario);
		spUsuariosAdministradores.getChildren().add(PanelUsuariosAdmin);
	}
	@FXML private Tab TabEmpleados;
	@FXML private StackPane spEmpleados;
	@FXML private StackPane spHorarios;
	@FXML private StackPane spReporteComedor;
	@FXML private StackPane spIncidencias;
	@FXML private StackPane spUsuariosAdministradores;
}
