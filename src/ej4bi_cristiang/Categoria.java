package ej4bi_cristiang;

public class Categoria {

    private String nombre;
    private float sueldoBase;

    public Categoria(String nombre, float sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

}
