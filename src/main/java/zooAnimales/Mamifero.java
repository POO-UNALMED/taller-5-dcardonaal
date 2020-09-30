package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Mamifero extends Animal {
	private static List<Mamifero> listado;
	public static int caballos=0;
	public static int leones=0;
	private boolean pelaje;
	private int patas;
	private static int conteo;
	
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero,
			boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return leones+caballos;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero,true, 4);
		listado.add(caballo);
		caballos++;
		return caballo;

		
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero,true, 4);
		listado.add(leon);
		leones++;
		return leon;

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
