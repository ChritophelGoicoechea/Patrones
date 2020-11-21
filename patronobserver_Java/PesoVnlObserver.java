/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver_Java;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Desktop x64
 */
public class PesoVnlObserver extends Observador {
    
    	private double valorCambio = 709.824;
	
	public PesoVnlObserver(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	public void actualizar() {		
		System.out.println("VNZ: " + (sujeto.getEstado() * valorCambio));
	}



}

