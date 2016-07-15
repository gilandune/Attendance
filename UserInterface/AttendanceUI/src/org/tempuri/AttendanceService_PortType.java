/**
 * AttendanceService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface AttendanceService_PortType extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] catalogoManagers() throws java.rmi.RemoteException;
    public java.lang.Boolean altaUsuario(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario request) throws java.rmi.RemoteException;
    public java.lang.Boolean bajaUsuario(java.lang.Integer usuarioId) throws java.rmi.RemoteException;
    public java.lang.Boolean cambioUsuario(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario request) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario[] consultaUsuarios(java.lang.String request) throws java.rmi.RemoteException;
    public ResponseContracts.AttendanceService.UsuarioResponse validaUsuario(RequestContracts.AttendanceService.UsuarioRequest request) throws java.rmi.RemoteException;
    public ResponseContracts.AttendanceService.EmpleadosAttendance obtenerListaEmpleados(java.lang.String nombreEmpleado) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoHorarios() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoEmpleados() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoNomina() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Catalogo[] obtenerCatalogoCompanias() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Horario[] obtenerListaHorarios() throws java.rmi.RemoteException;
    public java.lang.Boolean insertaHorario(RequestContracts.AttendanceService.AltaHorarioRequest request) throws java.rmi.RemoteException;
    public java.lang.Boolean actualizaHorario(RequestContracts.AttendanceService.AltaHorarioRequest request) throws java.rmi.RemoteException;
    public ResponseContracts.AttendanceService.EliminaHorarioResponse eliminaHorario(java.lang.Integer horarioId) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer consultaEmpleadoEnReloj(java.lang.Integer idEmpleado, java.lang.Integer dispositivo) throws java.rmi.RemoteException;
    public java.lang.Boolean altaEmpleadoReloj(org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer empleado) throws java.rmi.RemoteException;
    public java.lang.Boolean altaEmpleadosReloj(org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer[] empleados) throws java.rmi.RemoteException;
    public java.lang.Boolean borraEmpleadoReloj(java.lang.Integer empleado) throws java.rmi.RemoteException;
    public java.lang.Boolean borraEmpleados(int[] idEmpleados, java.lang.Integer dispositivo) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities.DeviceEmployeer[] consultaEmpleadosReloj(java.lang.Integer dispositivo) throws java.rmi.RemoteException;
    public java.lang.Boolean actualizaEmpleadoBaseDatos(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException;
    public ResponseContracts.AttendanceService.ServiceMessage altaEmpleado(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException;
    public java.lang.Boolean actualizaEmpleado(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException;
    public java.lang.Boolean sincronizaEmpleado(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado, java.lang.Integer relojChecadorOrigen) throws java.rmi.RemoteException;
    public java.lang.Boolean borraEmpleado(java.lang.Integer empleadoId) throws java.rmi.RemoteException;
    public java.lang.Boolean setTime() throws java.rmi.RemoteException;
    public ResponseContracts.AttendanceService.ServiceMessage altaEmpleadoExterno(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Empleado empleado) throws java.rmi.RemoteException;
    public ResponseContracts.AttendanceService.ServiceMessage actualizarRegistrosComedor() throws java.rmi.RemoteException;
    public ResponseContracts.AttendanceService.ServiceMessage actualizarRegistrosEntrada() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.EmpleadoComidas[] obtenerEmpleadosComidas(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.DetalleComida[] obtenerDetalleComidas(java.lang.Integer empleado, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.RegistroReporteComedor[] obtenerLayoutComedor(java.util.Calendar fechaInicio, java.util.Calendar fechaFin, java.lang.String nomina, java.lang.String compania) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Configuracion[] obtenerConfiguraciones() throws java.rmi.RemoteException;
    public java.lang.Boolean actualizarConfiguracion(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Configuracion request) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.ComedorExcel[] obtenerReporteComedorExcel(java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.EmpleadoFaltas[] obtenerFaltas(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.DetalleFaltas[] obtenerDetalleFaltas(java.lang.Integer empleadoId, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Retardo[] obtenerDetalleRetardos(java.lang.Integer empleadoId, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.DiaFeriado[] obtenerDiasFeriados() throws java.rmi.RemoteException;
    public java.lang.Boolean insertarDiaFeriado(java.lang.String descripcion, java.util.Calendar fecha) throws java.rmi.RemoteException;
    public java.lang.Boolean actualizaDiaFeriado(java.lang.Integer diaFeriadoId, java.lang.String descripcion, java.util.Calendar fecha) throws java.rmi.RemoteException;
    public java.lang.String obtenerDiasRetardo() throws java.rmi.RemoteException;
    public java.lang.Boolean actualizaDiasRetardo(java.lang.Integer dias) throws java.rmi.RemoteException;
    public java.lang.String obtenerTiempoTolerancia() throws java.rmi.RemoteException;
    public java.lang.Boolean actualizaTiempoTolerancia(java.lang.String tiempoTolerancia) throws java.rmi.RemoteException;
    public java.lang.Boolean borrarDiaFeriado(java.lang.Integer diaFeriado) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.ReporteIncidencia[] obtenerReporteIncidencias(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.RegistroLayoutIncidencias[] obtenerLayoutIncidencias(java.lang.Integer numeroEmpleado, java.lang.String nombreEmpleado, java.lang.String compania, java.lang.String nomina, java.util.Calendar fechaInicio, java.util.Calendar fechaFin) throws java.rmi.RemoteException;
}
