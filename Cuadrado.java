package TP5;

/** Permite crear y manipular objetos de tipo Rectangulo
 * @author Wolkowyski, Micaela
 * @version 28/09/2023
 */

public class Cuadrado extends Rectangulo{

    //Constructores
    /** Permite instanciar objetos de tipo Cuadrado
     * @return No devuelve ningun valor
     * @param p_origen de tipo Punto, utilizada para asignar el estado de origen
     * @param p_lado de tipo double, utilizado para asignar los estados de alto y ancho
     */
    public Cuadrado(Punto p_origen, double p_lado) {
        super(p_origen, p_lado, p_lado);
    }

    //Metodos
    /** Retorna el nombre de a la figura
     * @return Retorna un String
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcio
     */
    public String nombreFigura() {
        return("****** Cuadrado ******");
    }

    /** Muestra las caracteristicas del Cuadrado
     * @param No utiliza parametros
     * @exception No dispara ninguna excepcion
     * @return No devuelve ningun valor
     */
    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " " + "-" + " " + "Lado: " + this.getAlto());
        System.out.println("Superficie: " + this.superficie() + " " + "-" + " " + "Perimetro: " + this.perimetro());
    }
}
