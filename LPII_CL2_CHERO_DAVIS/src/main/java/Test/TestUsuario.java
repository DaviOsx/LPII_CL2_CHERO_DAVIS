package Test;

import java.util.List;
import Dao.TblUsuarioImp;

import Modelo.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		//realizamos las respectiva instancias..
		TblUsuariocl2 usuario=new TblUsuariocl2();
		TblUsuarioImp crud=new TblUsuarioImp();
		
		

		List<TblUsuariocl2> listado=crud.ListarUsuario();


		//APLICAMOS BUCLE
		for (TblUsuariocl2 lis:listado){
			
			//IMPRIMIMOS
			System.out.print("codigo"+lis.getIdusuariocl2() +
					"usuario"+lis.getUsuariocl2() + "descrip"+lis.getPassword());
					
			
			
		} //fin
		
		
		
		
		
		

	}

}
