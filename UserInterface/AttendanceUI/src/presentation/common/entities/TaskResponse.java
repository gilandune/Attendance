package presentation.common.entities;

public class TaskResponse {
	public TaskResponse()
	{
		
	}
	//propiedades
	private int TipoMensaje;
	private String Mensaje;
	private Object nodo;
	
	public Object getNodo()
	{
		return nodo;
	}
	public void setNodo(Object nodo)
	{
		this.nodo = nodo;
	}
	//getters y setters
	public int getTipoMensaje()
	{
		return TipoMensaje;
	}
	public void setTipoMensaje(int TipoMensaje)
	{
		this.TipoMensaje = TipoMensaje;
	}
	public String getMensaje()
	{
		return Mensaje;
	}
	public void setMensaje(String Mensaje)
	{
		this.Mensaje = Mensaje;
	}
}
