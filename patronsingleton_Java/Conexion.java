/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton_Java;

/**
 *
 * @author Desktop x64
 */
public class Conexion {
	

	private static Conexion instancia;

	

	private Conexion() {
		
	}
	

	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}
	

	public void conectar() {
		System.out.println("Me conecté a la BD");
	}
	

	public void desconectar() {
		System.out.println("Me desconecté de la BD");
	}

}