package ej4bi_cristiang;

import textoandnumeros.Utilidad;

public class Ej4Bi_CristianG {

    public static void main(String[] args) {
        Empresa miEmpresa;
        int nEmpleados;
        nEmpleados = (int) Utilidad.pedirNumeroEntero("Introduce el numero de empleados: ", 0);
        miEmpresa = new Empresa(nEmpleados);
        miEmpresa.pedirDatosEmpleado();
        miEmpresa.pedirDatosHijos();
    }

}
