package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Ave extends Animal {
	private List<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona,
			String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
	}
	
	public static int cantidadAves() {
		return aguilas+halcones;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String habitat, String genero, Zona zona,
	String colorPlumas) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
		listado.add(halcon);
		halcones++;
		
	}
	

	public void crearAguila(String nombre, int edad, String genero, Zona zona) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
		listado.add(aguila);
		aguilas++;
		
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
