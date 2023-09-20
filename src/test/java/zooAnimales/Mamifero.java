package zooAnimales;

import java.util.List;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static List<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero () {listado.add(this);}
    public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }
    public static Mamifero crearCaballo (String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }
    public static Mamifero crearLeon (String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
    public static List<Mamifero> getListado () {
        return Mamifero.listado;
    }
    public static void setListado (List<Mamifero> listado) {
        Mamifero.listado = listado;
    }
    public static int getCaballos () {
        return Mamifero.caballos;
    }
    public static void setCaballos (int caballos) {
        Mamifero.caballos = caballos;
    }
    public static int getLeones () {
        return Mamifero.leones;
    }
    public static void setLeones (int leones) {
        Mamifero.leones = leones;
    }
    public boolean isPelaje () {
        return this.pelaje;
    }
    public void setPelaje (boolean pelaje) {
        this.pelaje = pelaje;
    }
    public int getPatas () {
        return this.patas;
    }
    public void setPatas (int patas) {
        this.patas = patas;
    }
}
