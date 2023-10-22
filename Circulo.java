package TP5;

/** Permite crear y manipular objetos de tipo Circulo
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */

public class Circulo extends Elipse {
    //Metodo Constructor
    /** Permite instanciar objetos de tipo Circulo
     * @param p_radio de tipo double, utilizado para asignar el valor de radio
     * @param p_centro de tipo Punto, utilizadp para asignar el valor de centro
     * @return No devuelve ningun valor
     * @exception No dispara ninguna excepcion
     */
    public Circulo(double p_radio, Punto p_centro) {
        super(p_radio, p_radio, p_centro);
    }

    /** Permite instanciar objetos de tipo Circulo
     * @return No devuelve ningun valor
     * @exception No dispara ninguna excepcion
     * @param No utiliza parámetros
     */
    public Circulo() {
        super();
    }

    //Metodos
    /** Retorna el nombre de la figura
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara ninguna excepción
     */
    public String nombreFigura() {
        return ("****** Círculo ******");
    }
    /** Imprime por pantalla los datos del circulo, tales como centro, radio, superficie y perimetro
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return No devuelve ningun valor
     */
    public void caracteristicas() {
        System.out.println("\n" + this.nombreFigura());
        System.out.println("Centro: " + this.getOrigen().coordenadas() + " " + "-" + " " + "Radio: " + this.getEjeMenor());
        System.out.println("Superficie: " + this.superficie() + " " + "-" + " " + "Perimetro: " + this.perimetro());
    }

    /** Devuelve el perimetro del circulo
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return Devuelve un double
     */
    public double perimetro() {
        return (2 * this.getEjeMenor() * Math.PI);
    }

}
