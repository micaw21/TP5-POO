package TP5;

/** Clase abstracta de objetos de tipo FiguraGeometrica
 * @author Wolkowyski, Micaela
 * @version 06/10/2023
 */
public abstract class FiguraGeometrica {
    //Atributos
    private Punto origen;

    //Metodos Constructores
    /** Permite instanciar objetos de tipo FiguraGeometrica
     * @param No utiliza parametros
     */
    public FiguraGeometrica() {
        this.setOrigen(new Punto());
    }

    /** Permite instanciar objetos de tipo FiguraGeometrica
     * @param p_origen de tipo Punto, utilizada para asignar el origen
     */
    public FiguraGeometrica(Punto p_origen) {
        this.setOrigen(p_origen);
    }

    //Setters y Getters
    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }

    /** Devuelve el origen
     * @exception No dispara ninguna excepción
     * @return Retorna un objeto de tipo Punto
     * @param No utiliza parámetros
     */
    public Punto getOrigen() {
        return this.origen;
    }

    //Metodos
    /** Metodo abstracto que devuelve el nombre de la figura geométrica
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public abstract String nombreFigura();

    /** Método asbtracto que devuelve la superficie de la figura geométrica
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara ninguna excepción
     */
    public abstract double superficie();

    /** Imprime por pantalla la superficie
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void mostrarSuperficie() {
        System.out.println(this.nombreFigura());
        System.out.println("Superficie: " + this.superficie());
    }
}
