package TP5;

/** Permite crear y manipular objetos de tipo Servicio
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */

public class Servicio {
    //Atributos
    private String descripcion;
    private double precio;    

    //Método Constructor
    /** Permite instanciar objetos de tipo Servicio
     * @param p_descripcion de tipo String, utilizado para asignar el estado de descripcion
     * @param p_precio de tipo double, utilizado para asignar el estado de precio
     */
    public Servicio(String p_descripcion, double p_precio) {
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }

    //Setters y Getters
    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }

    private void setPrecio(double p_precio) {
        this.precio = p_precio;
    }

    /** Permite obtener la descripcion
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /** Permite obtener el precio
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double getPrecio() {
        return this.precio;
    }

}
