package TP5;

import java.util.ArrayList;

/** Permite crear y manipular objetos de tipo Cabaña
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */

public class Cabaña extends Alojamiento{
    //Atributos
    private int nroHabitaciones;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Cabaña
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_precioBase de tipo double, utilizado para asignar el estado de precioBase
     * @param p_diasAlquiler de tipo int, utilizado para asignar el estado de dias de alquiler
     * @param p_servicios de tipo ArrayList<Servicio>, utilizado para asignar el estado de servicios
     * @param p_nroHabitaciones de tipo String, utilizado para asignar el estado de nroHabitacion
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios, int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    /** Permite instanciar objetos de tipo Cabaña
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_precioBase de tipo double, utilizado para asignar el estado de precioBase
     * @param p_diasAlquiler de tipo int, utilizado para asignar el estado de dias de alquiler
     * @param p_nroHabitaciones de tipo String, utilizado para asignar el estado de nroHabitacion
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler, int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    //Setters y Getters
    private void setNroHabitaciones(int p_nroHabitaciones) {
        this.nroHabitaciones = p_nroHabitaciones;
    }

    /** Permite obtener la cantidad de habitaciones
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getNroHabitaciones() {
        return this.nroHabitaciones;
    }

    //Métodos
    /** Calcula el costo por cantidad de días en la cabaña
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No disapra excepciones
     */
    public double costo() {
        return super.costo() + (30 * this.getNroHabitaciones());
    }

    /** Cuenta la cantidad de cabañas
     * @param p_alojamiento de tipo String, para identificar el tipo de alojamiento
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int contar(String p_alojamiento) {
        int contar = 0;
        if(p_alojamiento.equalsIgnoreCase("Cabaña")) {
            contar = 1;
        }
        return contar;
    }

    /** Imprime por pantalla los datos del alojamiento
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void liquidar() {
        super.liquidar();
        System.out.println("\t" + "Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: ------> " + (this.costo() + this.costoServicios()));
    }
}
