/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton_Java;
import patronsingleton_Java.Conexion;
/**
 *
 * @author Desktop x64
 */
public class App {

	public static void main(String[] args) {

		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
	

}
