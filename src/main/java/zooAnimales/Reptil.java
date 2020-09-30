package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Reptil extends Animal{
	private static List<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero,
			String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		int cantidad = serpientes+iguanas;
		return cantidad;
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero,
				"verde", 3);
		listado.add(iguana);
		iguanas++;
		return iguana;
		
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero,
				"blanco", 1);
		listado.add(serpiente);
		serpientes++;
		return serpiente;
		
	}

	public List<Reptil> getListado() {
		return listado;
	}

	public void setListado(List<Reptil> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
	
	
	
}
