/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver_Java;



/**
 *
 * @author Desktop x64
 */
public class PesoDomObservador extends Observador {

	private double valorCambio = 58.39;
	
	public PesoDomObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	
        @Override
	public void actualizar() {		
		System.out.println("Dom: " + (sujeto.getEstado() * valorCambio));
	}
}