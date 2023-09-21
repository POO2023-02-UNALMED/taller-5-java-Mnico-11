package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> aves = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    
    public Ave(){
		aves.add(this);
	}

    public Ave(String nombre,int edad,String habitat,String  genero, String colorPlumas){
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		aves.add(this);
	}
	
	public static Ave crearHalcon(String nombre,int edad, String genero){
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso" );
	}
	public static Ave crearAguila(String nombre,int edad, String genero){
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo" );
	}
	public String movimiento(){
		return "volar";
	}
	public static int cantidadAves(){
		return (aves.size()) ;
	}
	public String getColorPlumas(){
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
