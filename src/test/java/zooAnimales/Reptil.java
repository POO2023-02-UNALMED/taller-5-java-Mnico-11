package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private static List<Reptil> reptiles = new ArrayList<>();
	
	public Reptil(String nombre,int edad,String habitat,String  genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);
		this.largoCola=largoCola;
		this.colorEscamas=colorEscamas;
		reptiles.add(this);
	}
	public Reptil(){
		super();
		reptiles.add(this);
	}
	public static Reptil crearIguana(String nombre,int edad,String genero){
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero){
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	public String movimiento(){
		return "reptar";
	}
	public static int cantidadReptiles(){
		return (reptiles.size()) ;
	}
	public int getLargoCola(){
		return largoCola;
	}
	public void setLargoCola(int largoCola){
		this.largoCola=largoCola;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
}
