package ej4bi_cristiang;

import fecha.Fecha;

public class Hijo {

    private Fecha fechaNacimeinto;
    private boolean ingresos;

    public Hijo() {//Te voy a dar yo la info de los hijos es decir los creo vacios
    }

    public void grabarInfoHijo(Fecha fn, boolean mas25) {/*Aqui le pasas los datos,pero podrias 
                                                pasar los datos directamente al constructor*/
        fn = fechaNacimeinto;
        mas25 = ingresos;
    }

    public Fecha getFechaNacimeinto() {
        return fechaNacimeinto;
    }

    public boolean isIngresos() {
        return ingresos;
    }

    public boolean hijoValido() {
        boolean computable = false;
        if (!ingresos && fechaNacimeinto.calculoAnnos() < 25) {
            computable = true;
        }
        return computable;
    }

}
