package org.ABMGenerator.Dominio;
/**
 * 
 * @author matias nahuel heredia
 * clase ejemplo
 */
public class Alumno {

	private int Legajo;
	private String nombre;
	private String Apellido;
	public int getLegajo() {
		return Legajo;
	}
	public void setLegajo(int legajo) {
		Legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
}
