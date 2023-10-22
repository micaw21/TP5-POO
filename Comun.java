package TP5;

/** Permite crear y manipular objetos de tipo Comun
 * @author Wolkowyski, Micaela
 * @version 14/10/2023
 */

public class Comun extends Etiqueta {
    //Atributos
    private double plus;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Comun
     * @param p_plus de tipo double, utilizado para asignar el estado de plus
     */
    public Comun(double p_plus) {
        super(100);
        this.setPlus(p_plus);
    }

    //Setter y Getter
    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    /** Permite obtener el valor del plus
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double getPlus() {
        return this.plus;
    }

    //Metodos
    /** Calcula el precio por etiqueta comun
     * @param q de tipo int, utilizado como cantidad de etiquetas
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double precio(int q) {
        return ((this.getCosto() * q) + this.getPlus()) - this.descuento(q);  
    }

    /** Calcula el descuento por cantidad de etiquetas comunes
     * @exception No dispara excepciones
     * @param q de tipo int, utilizado como cantidad de etiquetas comunes
     * @return Retorna un double
     */
    private double descuento(int q) {
        if(q >= 1 && q <= 10) {
            return 0;
        } else if (q >= 11 && q <= 50) {
            return (this.getCosto() * q + 100) * 0.02;
        } else if (q >= 51 && q <= 100) {
            return (this.getCosto() * q + 100) * 0.05;
        } else {
            return (this.getCosto() * q + 100) * (q / 10);
        }
    }

    /** Retorna el tipo de etiqueta, en este caso comun
     * @param No utiliza parametros
     * @exception No dispara excepciones
     * @return Retorna un String
     */
    protected String tipo() {
        return "Comun";
    }

    /** Retorna una cadena de caracteres con el tipo de etiqueta y el costo más el plus del diseño
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String toString() {
        return super.toString() + " - Diseño: " + this.getPlus();
    }
}
