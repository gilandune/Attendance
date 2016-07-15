package presentation.comedor;

import java.io.IOException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.datacontract.schemas._2004._07.AttendanceCore_Entities.EmpleadoComidas;
import org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario;
import org.tempuri.AttendanceServiceProxy;

import ResponseContracts.AttendanceService.ServiceMessage;
import presentation.common.Layout;
import presentation.common.MessageController;
import presentation.common.ProgressController;
import presentation.common.entities.Catalogo;
import presentation.common.entities.TaskResponse;
import eu.schudt.javafx.controls.calendar.DatePicker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Comedor extends AnchorPane{
	private Usuario usuario;
	public Usuario getUsuario(){
		return usuario;
	}
	private Stage stage;
	public Comedor(Stage ParentStage, Usuario usuario)
	{
		this.usuario = usuario;
		stage = ParentStage;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/presentation/comedor/Comedor.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try{
			Parent root = (Parent)fxmlLoader.load();
			root.getStylesheets().add(this.getClass().getResource("/presentation/common/Images/JMetroLightTheme.css").toExternalForm());
			LoadControls();
		}
		catch (IOException exception){
			throw new RuntimeException(exception);
		}
	}
	private String Compania;
	public void setCompania(String Compania){
		this.Compania = Compania;
	}
	public String getCompania(){
		return Compania;
	}
	private String Nomina;
	public void setNomina(String Nomina){
		this.Nomina = Nomina;
	}
	public String getNomina(){
		return Nomina;
	}
	@FXML GridPane datePane_ini = new GridPane();
	private DatePicker dtpkFecInicio;
	@FXML GridPane datePane_fin = new GridPane();
	private DatePicker dtpkFecFinal;
	@FXML TextField txtNumEmpleadoComedor = new TextField();
	@FXML protected void txtNumEmpleadoComedor_OnAction()
	{
		final ProgressController progress = new ProgressController(stage);
		final MessageController Mensaje = new MessageController(stage);
		final Task<TaskResponse> task = new Task<TaskResponse>() {
			@Override
			protected TaskResponse call() throws Exception {
				TaskResponse Response = new TaskResponse();
				try
				{
					Response = FillGrid();
				}
				catch(Exception exc)
				{
					Response.setMensaje("Excepción: " + exc.getMessage());
					Response.setTipoMensaje(2);
				}
				updateProgress(10, 10);
				return Response;
			}
		};
		task.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				progress.closeProgress();
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2)
				{
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		task.setOnFailed(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				progress.closeProgress();
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2){
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		progress.showProgess(task);
		new Thread(task).start();
	}
	@FXML Button Configuracion = new Button();
	@FXML protected void Configuracion_OnAction()
	{
		ConfiguracionComedor VentanaConfiguracion = new ConfiguracionComedor();
		VentanaConfiguracion.show();
	}
	@FXML Button btnLayout = new Button();
	@FXML protected void btnLayout_OnAction(){
		try
		{
			final ProgressController progress = new ProgressController(stage);
			final MessageController Mensaje = new MessageController(stage);
			FileChooser fileChooser = new FileChooser();
			//Set extension filter
	        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Archivos Texto (*.txt)", "*.pdf");
	        fileChooser.getExtensionFilters().add(extFilter);
	        //Show save file dialog
	        final String path = fileChooser.showSaveDialog(stage).getAbsolutePath();
			final Task<TaskResponse> task = new Task<TaskResponse>() {
				@Override
				protected TaskResponse call() throws Exception {
					TaskResponse Response = new TaskResponse();
					Catalogo entidad_nomina = cmbNomina.getItems().get(cmbNomina.getSelectionModel().getSelectedIndex());
					if(entidad_nomina.id == 1000)
						setNomina("");
					else
						setNomina(entidad_nomina.displayString);
					Catalogo entidad_comapnias = cmbCompanias.getItems().get(cmbCompanias.getSelectionModel().getSelectedIndex());
					if(entidad_comapnias.id == 1000)
						setCompania("");
					else
						setCompania(entidad_comapnias.displayString);
					Layout generadorLayout = new Layout(path);
					try
					{
						Response = generadorLayout.GeneraLayoutComedor(DateToCalendar(dtpkFecInicio.selectedDateProperty().get()), 
								DateToCalendar(dtpkFecFinal.selectedDateProperty().get()),
								getNomina(),
								getCompania()
								);
					}
					catch(Exception exc)
					{
						Response.setMensaje("Excepción: " + exc.getMessage());
						Response.setTipoMensaje(2);
					}
					updateProgress(10, 10);
					return Response;
				}
			};
			task.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
				@Override
				public void handle(WorkerStateEvent event){
					progress.closeProgress();
					TaskResponse response = new TaskResponse();
					response = (TaskResponse)task.getValue();
					if(response.getTipoMensaje() == 2)
					{
						Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
					}
					else
					{
						Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
					}
				}
			});
			task.setOnFailed(new EventHandler<WorkerStateEvent>(){
				@Override
				public void handle(WorkerStateEvent event){
					progress.closeProgress();
					TaskResponse response = new TaskResponse();
					response = (TaskResponse)task.getValue();
					if(response.getTipoMensaje() == 2){
						Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
					}
				}
			});
			progress.showProgess(task);
			new Thread(task).start();
		}
		catch(Exception exc)
		{
			
		}
	}
	@FXML Button btnExcel = new Button();
	@FXML protected void btnExcel_OnAction(){
		try
		{
			final ProgressController progress = new ProgressController(stage);
			final MessageController Mensaje = new MessageController(stage);
			FileChooser fileChooser = new FileChooser();
			//Set extension filter
	        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Archivos Excel (*.xls)", "*.xls");
	        fileChooser.getExtensionFilters().add(extFilter);
	        //Show save file dialog
	        final String path = fileChooser.showSaveDialog(stage).getAbsolutePath();
			final Task<TaskResponse> task = new Task<TaskResponse>() {
				@Override
				protected TaskResponse call() {
					TaskResponse Response = new TaskResponse();
					/*
					Catalogo entidad_nomina = cmbNomina.getItems().get(cmbNomina.getSelectionModel().getSelectedIndex());
					if(entidad_nomina.id == 1000)
						setNomina("");
					else
						setNomina(entidad_nomina.displayString);
					Catalogo entidad_comapnias = cmbCompanias.getItems().get(cmbCompanias.getSelectionModel().getSelectedIndex());
					if(entidad_comapnias.id == 1000)
						setCompania("");
					else
						setCompania(entidad_comapnias.displayString);
					*/
					Layout generadorLayout = new Layout(path);
					try
					{
						Response = generadorLayout.ReporteComedorExcel(DateToCalendar(dtpkFecInicio.selectedDateProperty().get()), 
								DateToCalendar(dtpkFecFinal.selectedDateProperty().get())
								);
					}
					catch(Exception exc)
					{
						Response.setMensaje("Excepción: " + exc.getMessage());
						Response.setTipoMensaje(2);
					}
					updateProgress(10, 10);
					return Response;
				}
			};
			task.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
				@Override
				public void handle(WorkerStateEvent event){
					progress.closeProgress();
					TaskResponse response = new TaskResponse();
					response = (TaskResponse)task.getValue();
					if(response.getTipoMensaje() == 2)
					{
						Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
					}
					else
					{
						Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
					}
				}
			});
			task.setOnFailed(new EventHandler<WorkerStateEvent>(){
				@Override
				public void handle(WorkerStateEvent event){
					progress.closeProgress();
					TaskResponse response = new TaskResponse();
					response = (TaskResponse)task.getValue();
					if(response.getTipoMensaje() == 2){
						Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
					}
				}
			});
			progress.showProgess(task);
			new Thread(task).start();
		}
		catch(Exception exc)
		{
			
		}
	}
	@FXML Button btnBuscar = new Button();
	@FXML protected void btnBuscar_OnAction(){
		final ProgressController progress = new ProgressController(stage);
		final MessageController Mensaje = new MessageController(stage);
		final Task<TaskResponse> task = new Task<TaskResponse>() {
			@Override
			protected TaskResponse call() throws Exception {
				TaskResponse Response = new TaskResponse();
				try
				{
					Response = FillGrid();
				}
				catch(Exception exc)
				{
					Response.setMensaje("Excepción: " + exc.getMessage());
					Response.setTipoMensaje(2);
				}
				updateProgress(10, 10);
				return Response;
			}
		};
		task.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				progress.closeProgress();
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2)
				{
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		task.setOnFailed(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				progress.closeProgress();
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2){
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		progress.showProgess(task);
		new Thread(task).start();
	}
	private static Calendar DateToCalendar(Date date){ 
		  Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		  return cal;
		}
	private TaskResponse FillGrid()
	{
		TaskResponse Response = new TaskResponse();
		if(ValidaFechas())
		{
			AttendanceServiceProxy Servicio = new AttendanceServiceProxy();
			try 
			{
				Catalogo entidad_nomina = cmbNomina.getItems().get(cmbNomina.getSelectionModel().getSelectedIndex());
				if(entidad_nomina.id == 1000)
				{
					setNomina("");
				}
				else
				{
					setNomina(entidad_nomina.displayString);
				}
				Catalogo entidad_comapnias = cmbCompanias.getItems().get(cmbCompanias.getSelectionModel().getSelectedIndex());
				if(entidad_comapnias.id == 1000)
				{
					setCompania("");
				}
				else
				{
					setCompania(entidad_comapnias.displayString);
				}
				EmpleadoComidas[] Empleados = Servicio.obtenerEmpleadosComidas(Integer.parseInt(txtNumEmpleadoComedor.getText().isEmpty() ? "0" : txtNumEmpleadoComedor.getText()), "", getCompania(), getNomina(), DateToCalendar(dtpkFecInicio.selectedDateProperty().get()), DateToCalendar(dtpkFecFinal.selectedDateProperty().get()));
				ObservableList<EmpleadoComidas> lst = FXCollections.observableArrayList(Empleados);
				GridReporteComedor.setItems(lst);
			}
			catch (Exception e) 
			{
				Response.setMensaje("Error de comunicación con el servicio: " + e.getMessage());
				Response.setTipoMensaje(2);
			}
			Response.setMensaje("Busqueda realizada correctamente");
			Response.setTipoMensaje(1);
		}
		else
		{
			Response.setMensaje("Favor de seleccionar las fechas para efectuar la búsqueda");
			Response.setTipoMensaje(2);
		}
		return Response;
	}
	@FXML TableView<EmpleadoComidas> GridReporteComedor = new TableView<EmpleadoComidas>();
	@FXML TableColumn<EmpleadoComidas, Integer> tcNumeroEmpleado = new TableColumn<EmpleadoComidas, Integer>();
	@FXML TableColumn<EmpleadoComidas, String> tcNombreEmpleado = new TableColumn<EmpleadoComidas, String>();
	@FXML TableColumn<EmpleadoComidas, String> tcCompania = new TableColumn<EmpleadoComidas, String>();
	@FXML TableColumn<EmpleadoComidas, String> tcNomina = new TableColumn<EmpleadoComidas, String>();
	@FXML TableColumn<EmpleadoComidas, Integer> tcComidas = new TableColumn<EmpleadoComidas, Integer>();
	@FXML TableColumn<EmpleadoComidas, String> tcDetail = new TableColumn<EmpleadoComidas, String>();
	
	@FXML ChoiceBox<Catalogo> cmbNomina = new ChoiceBox<Catalogo>();
	@FXML ChoiceBox<Catalogo> cmbCompanias = new ChoiceBox<Catalogo>();
	@FXML Button btnActualizaInformacion = new Button();
	@FXML protected void btnActualizaInformacion_OnAction()
	{
		final ProgressController progress = new ProgressController(stage);
		final MessageController Mensaje = new MessageController(stage);
		final Task<TaskResponse> task = new Task<TaskResponse>(){
			@Override public TaskResponse call() throws InterruptedException{
		    	TaskResponse Response = new TaskResponse();
				AttendanceServiceProxy Servicio = new AttendanceServiceProxy();
				try {
					ServiceMessage Mensaje = new ServiceMessage();
					Mensaje = Servicio.actualizarRegistrosComedor();
						Response.setMensaje(Mensaje.getMensajeRespuesta());
						if(Mensaje.getError())
							Response.setTipoMensaje(2);
						else
							Response.setTipoMensaje(1);
					}
				catch (Exception e) {
					Response.setMensaje("Error en la comunicación con el servicio: " + e.getMessage());
					Response.setTipoMensaje(2);
				}
		        updateProgress(10, 10);
				return Response;
		    }
		};
		task.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				progress.closeProgress();
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2)
				{
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
				else{
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		task.setOnFailed(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				progress.closeProgress();
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2){
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
				else{
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		progress.showProgess(task);
		new Thread(task).start();
	}
	private void LoadControls()
	{
		dtpkFecInicio = new DatePicker(Locale.ENGLISH);
		dtpkFecInicio.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		dtpkFecInicio.getCalendarView().todayButtonTextProperty().set("Today");
		dtpkFecInicio.getCalendarView().setShowWeeks(false);
		dtpkFecInicio.getStylesheets().add("/presentation/DatePicker.css");
		datePane_ini.add(dtpkFecInicio, 0, 0);
		
		dtpkFecFinal = new DatePicker(Locale.ENGLISH);
		dtpkFecFinal.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		dtpkFecFinal.getCalendarView().todayButtonTextProperty().set("Today");
		dtpkFecFinal.getCalendarView().setShowWeeks(false);
		dtpkFecFinal.getStylesheets().add("/presentation/DatePicker.css");
		datePane_fin.add(dtpkFecFinal, 0, 0);
		CargaCatalogoNomina();
		CargaCatalogoCompania();
		txtNumEmpleadoComedor.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent arg0) {
				String texto = txtNumEmpleadoComedor.getText();
				if (!texto.matches("[0-9]*")){
					txtNumEmpleadoComedor.setText(texto.substring(0, texto.length() - 1));
				}
			}
		});
		setNomina("");
		setCompania("");
		tcNumeroEmpleado.setCellValueFactory(new PropertyValueFactory<EmpleadoComidas,Integer>("NumeroEmpleado"));
		tcNombreEmpleado.setCellValueFactory(new PropertyValueFactory<EmpleadoComidas,String>("NombreEmpleado"));
		tcCompania.setCellValueFactory(new PropertyValueFactory<EmpleadoComidas,String>("Compania"));
		tcNomina.setCellValueFactory(new PropertyValueFactory<EmpleadoComidas,String>("Nomina"));
		tcComidas.setCellValueFactory(new PropertyValueFactory<EmpleadoComidas, Integer>("NumeroComidas"));
		ColumnaDetalle();
		
	}
	private void CargaCatalogoNomina()
	{
		final Task<TaskResponse> task = new Task<TaskResponse>(){

			@Override
			protected TaskResponse call() throws Exception {
				TaskResponse Response = new TaskResponse();
				AttendanceServiceProxy Servicio = new AttendanceServiceProxy();
				ArrayList<Catalogo> CatalogoNomina = new ArrayList<Catalogo>();
				try {
					org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo [] Nomina  = Servicio.obtenerCatalogoNomina();
					if(Nomina.length > 0){
						for(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo modelo : Nomina){
							Catalogo catalogo = new Catalogo(modelo.getId(), modelo.getDescripcion());
							CatalogoNomina.add(catalogo);
						}
					}
					ObservableList<Catalogo> ListaNomina = FXCollections.observableArrayList(CatalogoNomina);
					cmbNomina.getItems().addAll(ListaNomina);
					Response.setMensaje("Catálogo de nómina obtenido correctamente");
					Response.setTipoMensaje(1);
				}
				catch (RemoteException e) {
					Response.setMensaje("Error al obtener el catálogo de nómina");
					Response.setTipoMensaje(2);
				}
				return Response;
			}
		};
		final MessageController Mensaje = new MessageController(stage);
		task.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2){
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
				else
				{
					for(Catalogo obj : cmbNomina.getItems()){
						if(obj.id.equals(1000)){
							cmbNomina.getSelectionModel().select(obj);
							break;
						}
					}
				}
			}
		});
		task.setOnFailed(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2){
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		javafx.application.Platform.runLater(task);
	}
	private void CargaCatalogoCompania(){
		final Task<TaskResponse> task = new Task<TaskResponse>(){

			@Override
			protected TaskResponse call() throws Exception {
				TaskResponse Response = new TaskResponse();
				AttendanceServiceProxy Servicio = new AttendanceServiceProxy();
				ArrayList<Catalogo> CatalogoCompanias = new ArrayList<Catalogo>();
				try {
					org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo [] Companias  = Servicio.obtenerCatalogoCompanias();
					if(Companias.length > 0){
						for(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo modelo : Companias){
							Catalogo catalogo = new Catalogo(modelo.getId(), modelo.getDescripcion());
							CatalogoCompanias.add(catalogo);
						}
					}
					ObservableList<Catalogo> ListaCompanias = FXCollections.observableArrayList(CatalogoCompanias);
					cmbCompanias.getItems().addAll(ListaCompanias);
					Response.setMensaje("Catálogo de compañías obtenido correctamente");
					Response.setTipoMensaje(1);
				}
				catch (Exception e) {
					Response.setMensaje("Error al obtener el catálogo de compañías");
					Response.setTipoMensaje(2);
				}
				return Response;
			}
		};
		final MessageController Mensaje = new MessageController(stage);
		task.setOnSucceeded(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2){
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
				else
				{
					for(Catalogo obj : cmbCompanias.getItems()){
						if(obj.id.equals(1000)){
							cmbCompanias.getSelectionModel().select(obj);
							break;
						}
					}
				}
			}
		});
		task.setOnFailed(new EventHandler<WorkerStateEvent>(){
			@Override
			public void handle(WorkerStateEvent event){
				TaskResponse response = new TaskResponse();
				response = (TaskResponse)task.getValue();
				if(response.getTipoMensaje() == 2){
					Mensaje.showMessage(response.getMensaje(), response.getTipoMensaje());
				}
			}
		});
		javafx.application.Platform.runLater(task);
	}
	private void ColumnaDetalle()
	{
		tcDetail.setCellValueFactory(new PropertyValueFactory<EmpleadoComidas,String>("NombreEmpleado"));
		tcDetail.setCellFactory(new Callback<TableColumn<EmpleadoComidas, String>,TableCell<EmpleadoComidas, String>>(){
			@Override public TableCell<EmpleadoComidas, String> call(TableColumn<EmpleadoComidas, String> param){                
				TableCell<EmpleadoComidas, String> cell = new TableCell<EmpleadoComidas, String>(){
					ImageView imageview = new ImageView();
					@Override public void updateItem(String item, boolean empty){                        
						if(item!=null){                            
							final HBox box= new HBox();
							box.setSpacing(10);
							imageview.setFitHeight(20);
							imageview.setFitWidth(20);
							imageview.setImage(new Image("/presentation/common/Images/calendar.png")); 
							box.getChildren().addAll(imageview);
							box.setAlignment(Pos.CENTER);
							setGraphic(box);
							setTooltip(new Tooltip("Detalle de registro"));
							box.setOnMouseClicked(new EventHandler<MouseEvent>(){
								@Override public void handle(MouseEvent event){
									MessageController mensaje = new MessageController((Stage)GridReporteComedor.getScene().getWindow());
									try
									{
										DetalleComidas Detalle = new DetalleComidas((EmpleadoComidas)GridReporteComedor.getSelectionModel().getSelectedItem(),  DateToCalendar(dtpkFecInicio.selectedDateProperty().get()), DateToCalendar(dtpkFecFinal.selectedDateProperty().get()));
										Detalle.show();
									}
									catch (Exception e){
										mensaje.showMessage("Ocurrió un problema en la aplicación: "+ e.getMessage(), 2);
									}
								}
							});
						}
						else
							setGraphic(null);
					}
				};
				return cell;
			}
		});
	}
	private boolean ValidaFechas()
	{
		boolean valido = true;
		if (dtpkFecInicio.selectedDateProperty().getValue() == null)
		{
			valido = false;
		}
		if (dtpkFecFinal.selectedDateProperty().getValue() == null)
		{
			valido = false;
		}
		return valido;
	}
}
