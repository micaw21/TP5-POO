package TP5;

/** Permite crear y manipular objetos de tipo Hotel
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */
import java.util.ArrayList;

public class Hotel extends Alojamiento{
    //Atributos
    private String tipoHabitacion;

    //Metodos Constructores
    /** Permite instanciar objetos de tipo Hotel
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_precioBase de tipo double, utilizado para asignar el estado de precioBase
     * @param p_diasAlquiler de tipo int, utilizado para asignar el estado de dias de alquiler
     * @param p_tipoHabitacion de tipo String, utilizado para asignar el estado de tipoHabitacion
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, String p_tipoHabitacion) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    /** Permite instanciar objetos de tipo Hotel
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_precioBase de tipo double, utilizado para asignar el estado de precioBase
     * @param p_diasAlquiler de tipo int, utilizado para asignar el estado de dias de alquiler
     * @param p_servicios de tipo ArrayList<Servicio>, utilizado para asignar el estado de servicios
     * @param p_tipoHabitacion de tipo String, utilizado para asignar el estado de tipoHabitacion
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios, String p_tipoHabitacion) {
        super(p_tipoHabitacion, p_precioBase, p_diasAlquiler, p_servicios);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    //Setters y Getters
    private void setTipoHabitacion(String p_tipoHabitacion) {
        this.tipoHabitacion = p_tipoHabitacion;
    }

    /** Permite obtener el tipo de habitación
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    //Métodos
    /** Calcula el costo por cantidad de días en el hotel
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No disapra excepciones
     */
    public double costo() {
        if(this.getTipoHabitacion().equalsIgnoreCase("Single")) {
            return super.costo() + 20; 
        } else {
            return super.costo() + 35;
        }
    }

    /** Cuenta la cantidad de hoteles
     * @param p_alojamiento de tipo String, para identificar el tipo de alojamiento
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int contar(String p_alojamiento) {
        int contar = 0;
        if(p_alojamiento.equalsIgnoreCase("Hotel")) {
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
        System.out.println("\t" + "Habitación " + this.getTipoHabitacion());
        System.out.println("Total: ------> " + (this.costo() + this.costoServicios()));
    }
}
