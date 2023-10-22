package TP5;

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 28/09/2023
 */
public class Escuela {
    public static void main(String [] args) {
        Persona unaPersona = new Persona(30565002, "Matias", "Wolkowyski",1992);
        Alumno unaAlumna = new Alumno(45649603, "Micaela","Wolkowyski",2003, 57828);
        unaAlumna.setNota1(9.75);
        unaAlumna.setNota2(7.75);
        unaPersona.mostrar();
        unaAlumna.mostrar();

    }
}
