package TP5;

/** Permite crear y manipular objetos de tipo Rectangulo
 *  @author Wolkowyski, Micaela
 *  @version 28/09/2023
 */

public class Rectangulo extends FiguraGeometrica{
    //atributos 
    private double ancho;
    private double alto;

    //Metodos Constructores
    /** Permite instanciar objetos de tipo Rectangulo
     * @exception No dispara ninguna exepcion
     * @Return No devuelve ningun valor
     * @param p_origen de tipo Punto, utilizado para asignar el nuevo valor del origen
     * @param p_ancho de tipo double, utilizado para asignar el valor del ancho
     * @param p_alto de tipo double, utilizado para asignar el valor del alto
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    /** Permite instanciar objetos de tipo Rectangulo
     * @exception No dispara ninguna exepcion
     * @return No devuelve ningun valor
     * @param p_ancho de tipo double, utilizado para asignar el valor del ancho
     * @param p_alto de tipo double, utilizado para asignar el valor del alto
     */
    public Rectangulo(double p_ancho, double p_alto) {
        super();
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    //Setters y Getters
    private void setAncho(double p_ancho) {
        this.ancho = p_ancho;
    }

    private void setAlto(double p_alto) {
        this.alto = p_alto;
    }
    
    /** Permite obtener el valor del alto
     * @param No utiliza parametros
     * @return Devuelve un double
     * @exception No dispara ninguna excepcion
     */
    public double getAlto() {
        return this.alto;
    }

    /** Permite obtener el valor del ancho
     * @param No utiliza parametros
     * @return Devuelve un double
     * @exception No dispara ninguna excepcion
    */
    public double getAncho() {
        return this.ancho;
    }

    //Metodos
    /** Retorna el nombre de la figura
     * @exception No dispara ninguna excepcion
     * @param No utiliza parametros
     * @return Retorna un String
     */
    public String nombreFigura() {
        return ("****** Rectangulo ******");
    }

    /** Traslada el origen del rectangulo a otra posicion pasada por parametro
     * @exception No dispara ninguna excepcion
     * @param p_dx de tipo double, utilizado para asignar el valor x de la posicion a desplazar
     * @param p_dy de tipo double, utilizado para asignar el valor y de la posicion a desplazar
     * @return No devuelve ningun valor
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getOrigen().desplazar(p_dx, p_dy);
    }

    /** Imprime por pantalla los datos del rectangulo, tales como origen, alto, ancho, superficie y perimetro
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return No devuelve ningun valor
     */
    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " " + "-" + " " + "Alto: " + this.getAlto() + " " + "-" + " " + "Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " " + "-" + " " + "Perimetro: " + this.perimetro());
    }

    /** Devuelve el perimetro del rectangulo
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return Devuelve un double
     */
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }

    /** Devuelve la superficie del rectangulo
     * @exception No dispara ninguna excepcion
     * @return Devuelve un double
     * @param No utiliza parametros
     */
    public double superficie(){
        return this.getAlto() * this.getAncho();
    }

    /** Calcula la distancia entre dos rectangulos
     * @param otroRectangulo de tipo Rectangulo, utilizado para calcular la distancia hacia él
     * @exception No dispara ninguna excepcion
     * @return Devuelve un double
     */
    public double distanciaA(Rectangulo otroRectangulo) {
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }

    /** Devuelve el rectangulo de mayor superficie
     * @exception No dispara ninguna excepcion
     * @param otroRectangulo de tipo Rectangulo, utilizado para comparar superficies
     * @return Devuelve un Rectangulo
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo) {
        if(this.superficie() >= otroRectangulo.superficie()) {
            return this;
        } else {
            return otroRectangulo;
        }
    }
}
