package gestion;

import java.util.ArrayList;
import java.util.List; 

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas = new ArrayList<>();;;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico() {
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
        return this.zonas;
    }

    public void setZona(ArrayList<Zona> zonas) {
        this.zonas=zonas;
    }

    public int cantidadTotalAnimales() {
    	int totalAnimales = 0;
		for(int i=0; i<zonas.size();i++){
			totalAnimales+= zonas.get(i).cantidadAnimales();
		}
		return totalAnimales;
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }
}
