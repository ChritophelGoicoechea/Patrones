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
public class PesoEuObserver extends Observador {
    
    
    	private double valorCambio = 0.84;
  
	
	public PesoEuObserver(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	public void actualizar() {		
		System.out.println("EU: " + (sujeto.getEstado() * valorCambio));
	}
}
