package ej4bi_cristiang;

import fecha.Fecha;
import textoandnumeros.Utilidad;

public class Empresa {

    Empleado[] empleados;
    final Categoria[] categorias;
    final float[] limites;
    final float[][] irpf;

    public Empresa(int nEmpleados) {
        empleados = new Empleado[nEmpleados];
        categorias = new Categoria[]{
            new Categoria("Administrados", 1000f),
            new Categoria("Programador", 1200f),
            new Categoria("Analista", 1500f),
            new Categoria("Analista Programador", 1800f),
            new Categoria("Jefe Junior", 2100f),
            new Categoria("Jefe Senior", 2200f)
        };

        limites = new float[]{1000f, 1300f, 1600f, 2000f, Float.MAX_VALUE};

        irpf = new float[][]{
            {0.08f, 0.1f, 0.16f, 0.21f, 0.3f},
            {0.06f, 0.08f, 0.14f, 0.25f, 0.3f},
            {0.04f, 0.05f, 0.12f, 0.17f, 0.21f},
            {0.03f, 0.04f, 0.1f, 0.15f, 0.2f},};
    }

    public void pedirDatosEmpleado() {
        
        String nombre;
        Fecha fechaAlta;
        int categoria;
        int numHijos;
        
        for (int nEmpleados = 0; nEmpleados < empleados.length; nEmpleados++) {
            nombre = Utilidad.pedirString("Nombre del trabajador: ");
            
            fechaAlta = Utilidad.pedirFechaMenorHoy("Dime la fecha de alta: ");
           
            mostrarCategorias();
            categoria = Utilidad.pedirNumeroEntero("Categoria: ", 0, categorias.length - 1);
            
            numHijos = (int) Utilidad.pedirNumeroEntero("Numero de hijos: ", 0);
            
            empleados[nEmpleados] = new Empleado(nombre, fechaAlta, categoria, numHijos);
        }
    }

    public void mostrarCategorias() {
        for (int c = 0; c < categorias.length; c++) {
            System.out.println(c + "---->" + categorias[c].getNombre());
        }
    }

    public void pedirDatosHijos() {
       
        int total;
        Fecha fnac;
        boolean ingresos;

        for (int nEmple = 0; nEmple < empleados.length; nEmple++) {
            System.out.println(empleados[nEmple].getNombre());

            if (empleados[nEmple].getHijos() != null) {
                total = empleados[nEmple].getHijos().length;

                for (int numHijos = 0; numHijos < total; numHijos++) {
                    System.out.println("Hijo" + (numHijos + 1)+": ");
                    
                    fnac = Utilidad.pedirFechaMenorHoy("Dime la fecha de nacimeinto:");
                    
                    ingresos = Utilidad.pedirBoolean("¿Tiene ingresos superiores a 8000€?: ");
                    
                    empleados[nEmple].setUnHijo(new Hijo(fnac, ingresos), numHijos);
                    // empleados[nEmple].setUnHijo (fnac,ingresos,numHijos);
                }
            }
        }

    }
}
