package presentation.common.entities;

public class Usuario {
	public Usuario()
	{
		Nombre = "";
		Password = "";
		idUsuario = 0;
	}
	private String Nombre;
	private String Password;
	private int idUsuario;
	
	public void setNombre(String Nombre){
		this.Nombre = Nombre;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setPassword(String Password){
		this.Password = Password;
	}
	public String getPassword(){
		return Password;
	}
	public void setIdUsuario(int idUsuario){
		this.idUsuario = idUsuario;
	}
	public int getIdUsuario(){
		return idUsuario;
	}
}
