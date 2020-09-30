package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Ave extends Animal {
	private static List<Ave> listado = new ArrayList();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		super();
		listado.add(this);
		
	}
	
	public Ave(String nombre, int edad, String habitat, String genero,
			String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public static int cantidadAves() {
		
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		listado.add(halcon);
		halcones++;
		return halcon;
		
	}
	

	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		listado.add(aguila);
		aguilas++;
		return aguila;
	}
	
	
	

	public List<Ave> getListado() {
		return listado;
	}

	public void setListado(List<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	

}
