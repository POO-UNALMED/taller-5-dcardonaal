package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList();
	private int total=0;
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public int cantidadTotalAnimales() {
		for(int indice = 0;indice<zonas.size(); indice++) {
			total = total + zonas.get(indice).cantidadAnimales();
		}
		return total;
		

	}
	

	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Zona> getZona() {
		return zonas;
		
	}

	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
	
	
	
	

}
