package zooAnimales;
import java.util.List;
import java.util.ArrayList;

public class Ave extends Animal{
    private static List<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave () {listado.add(this);}
    public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    public static int cantidadAves() {
        return listado.size();
    }
    public String movimiento () {
        return "volar";
    }
    public static Ave crearHalcon (String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }
    public static Ave crearAguila (String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
    public static List<Ave> getListado () {
        return Ave.listado;
    }
    public static void setListado (List<Ave> listado) {
        Ave.listado = listado;
    }
    public static int getHalcones () {
        return Ave.halcones;
    }
    public static void setHalcones (int halcones) {
        Ave.halcones = halcones;
    }
    public static int getAguilas () {
        return Ave.aguilas;
    }
    public static void setAguilas (int aguilas) {
        Ave.aguilas = aguilas;
    }
    public String getColorPlumas () {
        return this.colorPlumas;
    }
    public void setColorPlumas (String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
