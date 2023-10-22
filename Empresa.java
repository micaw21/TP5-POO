package TP5;

/** Clase Ejecutable
 * @version 28/09/2023
 * @author Wolkowyski, Micaela
 */
public class Empresa {
    public static void main(String [] args) {
        Persona unaPersona = new Persona(23059757, "Gloria", "Mendez", 1973);
        Empleado unEmpleado = new Empleado(45649603, "Micaela", "Wolkowyski", 2003, Long.valueOf(args[0]), 120000, 2020);
        unaPersona.mostrar();
        unEmpleado.mostrar();
    }
}
