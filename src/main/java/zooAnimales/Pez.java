package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Pez extends Animal {
	private List<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez() {
		
	}
	
	public Pez(String nombre, int edad, String habitat, String genero,
			String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPeces() {
		return salmones+bacalaos;
	}
	
	public void crearSalmon(String nombre, int edad, String habitat, String genero, Zona zona) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero,
				"rojo", 6);
		listado.add(salmon);
		salmones++;
	}
	
	public void crearBacalao(String nombre, int edad, String habitat, String genero, Zona zona) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero,
				"gris", 6);
		listado.add(bacalao);
		bacalaos++;
		
	}

	
	

	public List<Pez> getListado() {
		return listado;
	}


	public void setListado(List<Pez> listado) {
		this.listado = listado;
	}


	public String getColorEscamas() {
		return colorEscamas;
	}


	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}


	public int getCantidadAletas() {
		return cantidadAletas;
	}


	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	

}
