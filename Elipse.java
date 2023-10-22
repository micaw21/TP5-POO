package TP5;

/** Permite crear y manipular objetos de tipo Elipse
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */

public class Elipse extends FiguraGeometrica{
    //Atributos
    private double sEjeMayor;
    private double sEjeMenor;

    //Método Constructor
    /** Permite instanciar objetos de tipo Elipse
     * @exception No dispara ninguna excepción
     * @param p_sEjeMayor de tipo double, utilizado para asignar el estado de sEjeMayor
     * @param p_sEjeMenor de tipo double, utilizado para asignar el estado de sEjeMenor
     * @param p_centro de tipo Punto, utilizado para asignar el estado de origen
     * @return No retorna ningún valor
     */
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro) {
        super(p_centro);
        this.setEjeMayor(p_sEjeMayor);
        this.setEjeMenor(p_sEjeMenor);
        
    }

    /** Permite instanciar objetos de tipo Elipse 
     * @exception No dispara ninguna excepción
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     */
    public Elipse() {
        super();
        this.setEjeMayor(0);
        this.setEjeMenor(0);
        
    }

    //Setters y Getters
    private void setEjeMayor(double p_sEjeMayor) {
        this.sEjeMayor = p_sEjeMayor;
    }

    private void setEjeMenor(double p_sEjeMenor) {
        this.sEjeMenor = p_sEjeMenor;
    }

    /** Permite obtener el eje mayor
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara ninguna excepción
     */
    public double getEjeMayor() {
        return this.sEjeMayor;
    }

    /** Permmite obtener el eje menor
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara ninguna excepción
     */
    public double getEjeMenor() {
        return this.sEjeMenor;
    }

    //Métodos
    /** Retorna el nombre de la figura
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara ninguna excepción
     */
    public String nombreFigura() {
        return ("****** Elipse ******");
    }

    /** Imprime por pantalla las características de la figura
     * @exception No dispara niguna excepción
     * @return No retorna ningún valor
     * @param No utiliza parámetros
     */
    public void caracteristicas() {
        System.out.println("\n" + this.nombreFigura());
        System.out.println("Centro: " + this.getOrigen().coordenadas() + " - Semieje Mayor: " + this.getEjeMayor() + " - Semieje Menor: " + this.getEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }

    /** Calcula la superficie de la figura
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara ninguna excepción
     */
    public double superficie() {
        return (Math.PI * this.getEjeMayor() * this.getEjeMenor());
    }

    /** Traslada el centro de la elipse a otra posición pasada por parámetro
     * @exception No dispara ninguna excepción
     * @param p_dx de tipo double, utilizado para asignar el valor x de la coordenada
     * @param p_dy de tipo double, utilizado para asignar el valor y de la coordenada
     * @return No retorna ningún valor
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getOrigen().desplazar(p_dx, p_dy);
    }

    /** Calcula la distancia entre dos elipses
     * @exception No dispara ninguna excepción
     * @param otraElipse de tipo Elipse, utilizada para calcular la distancia
     * @return Retorna un double
     */
    public double distanciaA(Elipse otraElipse) {
        return this.getOrigen().distanciaA(otraElipse.getOrigen());
    }

    /** Devuelve la elipse de mayor superficie 
     * @exception No dispara ninguna excepción
     * @param otraElipse de tipo Elipse, utilizada para comparar las superficies
     * @return Retorna una Elipse
     */
    public Elipse elmayor(Elipse otraElipse) {
        if(this.superficie() >= otraElipse.superficie()) {
            return this;
        }  else {
            return otraElipse;
        }
    }
}
