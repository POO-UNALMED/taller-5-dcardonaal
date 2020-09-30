package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Mamifero extends Animal {
	private List<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private static int conteo;
	
	
	public Mamifero() {
		super();
		
	}
	
	public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona,
			int caballos, int leones, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return leones+caballos;
	}
	
	public void crearCaballo(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		Mamifero caballo = new Mamifero(totalAnimales, nombre, edad, "pradera", genero, zona, caballos, leones, true, 4);
		listado.add(caballo);
		caballos++;

		
	}
	public void crearLeon(int totalAnimales, String nombre, int edad, String genero, Zona zona) {
		Mamifero leon = new Mamifero(totalAnimales, nombre, edad, "selva", genero, zona, caballos, leones, true, 4);
		listado.add(leon);
		leones++;

	}
	
	
	
	
	
	
	
	
	

	public List<Mamifero> getListado() {
		return listado;
	}

	public void setListado(List<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static int getConteo() {
		return conteo;
	}

	public static void setConteo(int conteo) {
		Mamifero.conteo = conteo;
	}
	
	

}