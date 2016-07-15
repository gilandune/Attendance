package org.tempuri;

public class AttendanceServiceProxy implements org.tempuri.AttendanceService_PortType {
  private String _endpoint = null;
  private org.tempuri.AttendanceService_PortType attendanceService_PortType = null;
  
  public AttendanceServiceProxy() {
    _initAttendanceServiceProxy();
  }
  
  public AttendanceServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAttendanceServiceProxy();
  }
  
  private void _initAttendanceServiceProxy() {
    try {
      attendanceService_PortType = (new org.tempuri.AttendanceService_ServiceLocator()).getBasicHttpBinding_AttendanceService();
      if (attendanceService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)attendanceService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)attendanceService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (attendanceService_PortType != null)
      ((javax.xml.rpc.Stub)attendanceService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.AttendanceService_PortType getAttendanceService_PortType() {
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType;
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] catalogoManagers() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.catalogoManagers();
  }
  
  public java.lang.Boolean altaUsuario(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario request) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.altaUsuario(request);
  }
  
  public java.lang.Boolean bajaUsuario(java.lang.Integer usuarioId) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.bajaUsuario(usuarioId);
  }
  
  public java.lang.Boolean cambioUsuario(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario request) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.cambioUsuario(request);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario[] consultaUsuarios(java.lang.String request) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.consultaUsuarios(request);
  }
  
  public ResponseContracts.AttendanceService.UsuarioResponse validaUsuario(RequestContracts.AttendanceService.UsuarioRequest request) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.validaUsuario(request);
  }
  
  public ResponseContracts.AttendanceService.EmpleadosAttendance obtenerListaEmpleados(java.lang.String nombreEmpleado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerListaEmpleados(nombreEmpleado);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoHorarios() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerCatalogoHorarios();
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoEmpleados() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerCatalogoEmpleados();
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoNomina() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerCatalogoNomina();
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoCompanias() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerCatalogoCompanias();
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Horario[] obtenerListaHorarios() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerListaHorarios();
  }
  
  public java.lang.Boolean insertaHorario(RequestContracts.AttendanceService.AltaHorarioRequest request) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.insertaHorario(request);
  }
  
  public java.lang.Boolean actualizaHorario(RequestContracts.AttendanceService.AltaHorarioRequest request) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizaHorario(request);
  }
  
  public ResponseContracts.AttendanceService.EliminaHorarioResponse eliminaHorario(java.lang.Integer horarioId) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.eliminaHorario(horarioId);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer consultaEmpleadoEnReloj(java.lang.Integer idEmpleado, java.lang.Integer dispositivo) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.consultaEmpleadoEnReloj(idEmpleado, dispositivo);
  }
  
  public java.lang.Boolean altaEmpleadoReloj(org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer empleado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.altaEmpleadoReloj(empleado);
  }
  
  public java.lang.Boolean altaEmpleadosReloj(org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer[] empleados) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.altaEmpleadosReloj(empleados);
  }
  
  public java.lang.Boolean borraEmpleadoReloj(java.lang.Integer empleado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.borraEmpleadoReloj(empleado);
  }
  
  public java.lang.Boolean borraEmpleados(int[] idEmpleados, java.lang.Integer dispositivo) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.borraEmpleados(idEmpleados, dispositivo);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer[] consultaEmpleadosReloj(java.lang.Integer dispositivo) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.consultaEmpleadosReloj(dispositivo);
  }
  
  public java.lang.Boolean actualizaEmpleadoBaseDatos(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizaEmpleadoBaseDatos(empleado);
  }
  
  public ResponseContracts.AttendanceService.ServiceMessage altaEmpleado(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.altaEmpleado(empleado);
  }
  
  public java.lang.Boolean actualizaEmpleado(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizaEmpleado(empleado);
  }
  
  public java.lang.Boolean sincronizaEmpleado(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado, java.lang.Integer relojChecadorOrigen) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.sincronizaEmpleado(empleado, relojChecadorOrigen);
  }
  
  public java.lang.Boolean borraEmpleado(java.lang.Integer empleadoId) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.borraEmpleado(empleadoId);
  }
  
  public java.lang.Boolean setTime() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.setTime();
  }
  
  public ResponseContracts.AttendanceService.ServiceMessage altaEmpleadoExterno(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.altaEmpleadoExterno(empleado);
  }
  
  public ResponseContracts.AttendanceService.ServiceMessage actualizarRegistrosComedor() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizarRegistrosComedor();
  }
  
  public ResponseContracts.AttendanceService.ServiceMessage actualizarRegistrosEntrada() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizarRegistrosEntrada();
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.EmpleadoComidas[] obtenerEmpleadosComidas(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerEmpleadosComidas(numeroEmpleado, nombreEmpleado, compania, nomina, fechaInicio, fechaFin);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.DetalleComida[] obtenerDetalleComidas(java.lang.Integer empleado, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerDetalleComidas(empleado, fechaInicio, fechaFin);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.RegistroReporteComedor[] obtenerLayoutComedor(java.util.Calendar fechaInicio, java.util.Calendar fechaFin, java.lang.String nomina, java.lang.String compania) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerLayoutComedor(fechaInicio, fechaFin, nomina, compania);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Configuracion[] obtenerConfiguraciones() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerConfiguraciones();
  }
  
  public java.lang.Boolean actualizarConfiguracion(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Configuracion request) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizarConfiguracion(request);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.ComedorExcel[] obtenerReporteComedorExcel(java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerReporteComedorExcel(fechaInicio, fechaFin);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.EmpleadoFaltas[] obtenerFaltas(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerFaltas(numeroEmpleado, nombreEmpleado, compania, nomina, fechaInicio, fechaFin);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.DetalleFaltas[] obtenerDetalleFaltas(java.lang.Integer empleadoId, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerDetalleFaltas(empleadoId, fechaInicio, fechaFin);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Retardo[] obtenerDetalleRetardos(java.lang.Integer empleadoId, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerDetalleRetardos(empleadoId, fechaInicio, fechaFin);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.DiaFeriado[] obtenerDiasFeriados() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerDiasFeriados();
  }
  
  public java.lang.Boolean insertarDiaFeriado(java.lang.String descripcion, java.util.Calendar fecha) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.insertarDiaFeriado(descripcion, fecha);
  }
  
  public java.lang.Boolean actualizaDiaFeriado(java.lang.Integer diaFeriadoId, java.lang.String descripcion, java.util.Calendar fecha) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizaDiaFeriado(diaFeriadoId, descripcion, fecha);
  }
  
  public java.lang.String obtenerDiasRetardo() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerDiasRetardo();
  }
  
  public java.lang.Boolean actualizaDiasRetardo(java.lang.Integer dias) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizaDiasRetardo(dias);
  }
  
  public java.lang.String obtenerTiempoTolerancia() throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerTiempoTolerancia();
  }
  
  public java.lang.Boolean actualizaTiempoTolerancia(java.lang.String tiempoTolerancia) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.actualizaTiempoTolerancia(tiempoTolerancia);
  }
  
  public java.lang.Boolean borrarDiaFeriado(java.lang.Integer diaFeriado) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.borrarDiaFeriado(diaFeriado);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.ReporteIncidencia[] obtenerReporteIncidencias(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerReporteIncidencias(numeroEmpleado, nombreEmpleado, compania, nomina, fechaInicio, fechaFin);
  }
  
  public org.datacontract.schemas._2004._07.AttendanceCore_Entities.RegistroLayoutIncidencias[] obtenerLayoutIncidencias(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException{
    if (attendanceService_PortType == null)
      _initAttendanceServiceProxy();
    return attendanceService_PortType.obtenerLayoutIncidencias(numeroEmpleado, nombreEmpleado, compania, nomina, fechaInicio, fechaFin);
  }
  
  
}