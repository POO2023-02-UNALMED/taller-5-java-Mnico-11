package zooAnimales;
import java.util.List;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static List<Anfibio> anfibios = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre,int edad,String habitat,String  genero, String colorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.colorPiel=colorPiel;
		this.setVenenoso(venenoso);
		anfibios.add(this);
	}
	public Anfibio(){
		super();
		anfibios.add(this);
	}	
	public static Anfibio crearRana(String nombre,int edad, String  genero){
		ranas++;
		return new Anfibio(nombre,edad,"selva",genero, "rojo", true);

	}
	public static Anfibio crearSalamandra(String nombre,int edad, String  genero){
		salamandras++;
		return new Anfibio(nombre,edad,"selva", genero, "negro y amarillo", false);
	}
	
	public static int cantidadAnfibios(){
		return (anfibios.size()) ;
	}
	
	public String movimiento(){
		return "saltar";
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public List<Anfibio> getAnfibios() {
		return anfibios;
	}

	public void setAnfibios(List<Anfibio> anfibios) {
		Anfibio.anfibios = anfibios;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
}