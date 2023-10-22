package TP5;

/** Permite crear y manipular objetos de tipo Renglon
 * @author Wolkowyski, Micaela
 * @version 14/10/2023
 */

public class Renglon {
    //Atributos
    private int cantidad;
    private double importe;
    private Etiqueta item;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Renglon
     * @param p_cantidad de tipo int, utilizado para asignar el estado de cantidad
     * @param p_importe de tipo double, utilizado para asignar el estado de importe
     * @param p_item de tipo Etiqueta, utilizado para asignar el estado de item.
     */
    public Renglon(int p_cantidad, double p_importe, Etiqueta p_item) {
        this.setCantidad(p_cantidad);
        this.setImporte(p_importe);
        this.setItem(p_item);
    }

    //Setters y Getters
    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }

    private void setImporte(double p_importe) {
        this.importe = p_importe;
    }

    private void setItem(Etiqueta p_item) {
        this.item = p_item;
    }

    /** Permite obtener la cantidad
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getCantidad() {
        return this.cantidad;
    }

    /** Permite obtener el importe
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double getImporte() {
        return this.importe;
    }

    /** Permite obtener el item
     * @param No utiliza parametros
     * @return Retorna un objeto de tipo Etiqueta
     * @exception No dispara excepciones
     */
    public Etiqueta getItem() {
        return this.item;
    }

    //Metodos
    /** Imprime por pantalla los datos del item
     * @param No utiliza parametros
     * @return No retorna ningun valor
     * @exception No dispara excepeciones
     */
    public void mostrar() {
        System.out.println(this.getCantidad() + " Etiquetas de tipo " + this.getItem().toString());
    }
}