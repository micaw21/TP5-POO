package TP5;

/** Permite crear y manipular objetos de tipo Alojamiento
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */

import java.util.*;

public abstract class Alojamiento {
    //Atributos
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Alojamiento
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_precioBase de tipo double, utilizado para asignar el estado de precioBase
     * @param p_diasAlquiler de tipo int, utilizado para asignar el estado de dias de alquiler
     * @param p_servicios de tipo ArrayList<Servicio>, utilizado para asignar el estado de servicios
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(p_servicios);
    }

    /** Permite instanciar objetos de tipo Alojamiento
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_precioBase de tipo double, utilizado para asignar el estado de precioBase
     * @param p_diasAlquiler de tipo int, utilizado para asignar el estado de dias de alquiler
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<Servicio>());
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setPrecioBase(double p_precioBase) {
        this.precioBase = p_precioBase;
    }

    private void setDiasAlquiler(int p_diasAlquiler) {
        this.diasAlquiler = p_diasAlquiler;
    }

    private void setServicios(ArrayList<Servicio> p_servicios) {
        this.servicios = p_servicios;
    }

    /** Permite obtener el nombre
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Permite obtener el precio base
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double getPrecioBase() {
        return this.precioBase;
    }

    /** Permite obtener la cantidad de días de alquiler
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getDiasAlquiler() {
        return this.diasAlquiler;
    }

    /** Permite obtener los servicios
     * @param No utiliza parámetros
     * @return Retorna un ArrayList<Servicio>
     * @exception No dispara excepciones
     */
    public ArrayList<Servicio> getServicios() {
        return this.servicios;
    }

    //Métodos
    /** Permite agregar servicios a la lista
     * @exception No dispara excepciones
     * @param p_servicio de tipo Servicio, utilizado para agregarlo a la lista
     * @return Retorna un boolean
     */
    public boolean agregarServicio(Servicio p_servicio) {
        return this.getServicios().add(p_servicio);
    }

    /** Permite remover servicios a la lista
     * @exception No dispara excepciones
     * @param p_servicio de tipo Servicio, utilizado para removerlo a la lista
     * @return Retorna un boolean
     */
    public boolean quitarServicio(Servicio p_servicio) {
        return this.getServicios().remove(p_servicio);
    }

    /** Cuenta la cantidad de alojamientos es de un tipo determinado
     * @exception No dispara excepciones
     * @param p_alojamiento de tipo String, utilizado para contar la cantidad de alquileres de dicho alojamiento
     * @return Retorna un int
     */
    public abstract int contar(String p_alojamiento);

    /** Calcula el costo por cantidad de días
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No disapra excepciones
     */
    public double costo() {
        return (this.getPrecioBase() * this.getDiasAlquiler());
    }

    /** Imprime por pantalla los servicios 
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void listarServicios() {
        for(Servicio servicios: this.getServicios()) {
            System.out.println("\t" + servicios.getDescripcion() + ": $" + servicios.getPrecio());
        }
    }

    /** Calcula el costo de todos los servicios
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double costoServicios() {
        double total = 0;
        for(Servicio servicios: this.getServicios()) {
            total += servicios.getPrecio();
        }
        return total;
    }

    /** Imprime por pantalla los datos del alojamiento
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " días: $" + this.costo());
        this.listarServicios();
    }
}
