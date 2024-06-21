package Interfaces;


import Modelo.TblUsuariocl2;
import java.util.List;

public interface IUsuario {
	
	public void RegistrarUsuario (TblUsuariocl2 usuario);
	public void ActualizarUsuario (TblUsuariocl2 usuario);
	public void EliminarUsuario (TblUsuariocl2 usuario);
	public  TblUsuariocl2 BuscarUsuario (TblUsuariocl2 usuario);
	public List<TblUsuariocl2> ListarUsuario();

}//FIN DE INTERFACE
