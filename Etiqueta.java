package TP5;

/** Permite crear y manipular objetos de tipo Etiqueta
 * @author Wolkowyski, Micaela
 * @version 14/10/2023
 */

public abstract class Etiqueta {
    //Atributos
    private double costo;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Etiqueta
     * @param p_costo de tipo double, utilizado para asignar el estado del costo
     */
    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }

    //Setter y Getter
    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    /** Permite obtener el costo
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double getCosto() {
        return this.costo;
    }

    //Metodos
    /** Metodo abstracto, calcula el precio de la etiqueta
     * @exception No dispara excepciones
     * @param q de tipo int, utilizado para el calculo
     * @return Retorna un double
     */
    public abstract double precio(int q);

    /** Retorna una cadena de caracteres con el tipo de etiqueta y el costo
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String toString() {
        return "tipo " + this.tipo() + " - Costo: " + this.getCosto();
    }

    /** Retorna el tipo de etiqueta
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    protected abstract String tipo();
}
