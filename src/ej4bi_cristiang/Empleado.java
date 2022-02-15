package ej4bi_cristiang;

import fecha.Fecha;

public class Empleado {

    private String nombre;
    private Fecha fechaAlta;
    private int codCategoria;
    private Hijo[] hijos;

    public Empleado(String nombre, Fecha fechaAlta, int codCategoria, int nHijos) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.codCategoria = codCategoria;
        if (nHijos != 0) {
            hijos = new Hijo[nHijos];
        }
    }

    public void setHijos(Hijo[] hijos) {//Guardar informacion de todos los hijos
        this.hijos = hijos;
    }

    public void setUnHijo(Hijo hijo, int pos) {//Guardar informacion de un hijo
        hijos[pos] = hijo;
    }

    /*public void setUnHijo(Fecha fechaNacimiento,boolean ingresos){
        Hijo hijo=new Hijo(fechaNacimiento,ingresos);
        
    }Este metodo se usaria si hubieramos usado el constructor que recibe todos los datos*/
    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public Hijo[] getHijos() {
        return hijos;
    }

    public int numeroHijosComputables() {
        int total = 0;
        if (hijos != null) {
            for (int nHijos = 0; nHijos < hijos.length; nHijos++) {
                if (hijos[nHijos].hijoValido()) {
                    total++;
                }
            }
        }
        return total;
    }

}
