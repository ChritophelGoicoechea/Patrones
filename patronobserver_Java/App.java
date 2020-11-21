/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver_Java;

import patronobserver_Java.PesoDomObservador;
import patronobserver_Java.PesoVnlObserver;
import patronobserver_Java.PesoEuObserver;
import patronobserver_Java.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new PesoDomObservador(subject);
		new PesoVnlObserver(subject);
		new PesoEuObserver(subject);
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setEstado(100);
	}
}