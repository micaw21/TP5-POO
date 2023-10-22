package TP5;

/** Permite crear y manipular obejtos de tipo Triángulo
 * @author Wolkowyski, Micaela
 * @version 06/10/2023
 */
public class Triangulo extends FiguraGeometrica{
    //Atributos
    private double base;
    private double altura;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Triángulo
     * @exception No dispara excepciones
     * @param p_base de tipo double, utilizado para asignar el estado de base
     * @param p_altura de tipo double, utilizado para asignar el estado de altura
     */
    public Triangulo(double p_base, double p_altura) {
        super();
        this.setBase(p_base);
        this.setAltura(p_altura);
    }

    /** Permite instanciar objetos de tipo Triángulo
     * @exception No dispara excepciones
     * @param p_base de tipo double, utilizado para asignar el estado de base
     * @param p_altura de tipo double, utilizado para asignar el estado de altura
     * @param p_origen de tipo Punto, utilizado para asignar el estado de altura
     */
    public Triangulo(Punto p_origen, double p_base, double p_altura) {
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }

    //Setters y Getters
    private void setBase(double p_base) {
        this.base = p_base;
    }

    private void setAltura(double p_altura) {
        this.altura = p_altura;
    }

    /** Devuelve la base
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double getBase() {
        return this.base;
    }

    /** Devuelve la altura
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double getAltura() {
        return this.altura;
    }

    //Métodos
    /** Imprime por pantalla el nombre de la figura
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return Retorna un String
     */
    public String nombreFigura() {
        return("****** Triángulo ******");
    }

    /** Calcula la superficie de cualquier triángulo con la fórmula de Herón
     * @return Retorna un double
     * @param No utiliza parámtros
     * @exception No dispara excepciones
     */
    public double superficie() {
        double x1 = this.getOrigen().getX();
        double y1 = this.getOrigen().getY();
        double x2 = this.getOrigen().getX() + this.getBase();
        double y2 = this.getOrigen().getY();
        double x3 = this.getOrigen().getY();
        double y3 = this.getOrigen().getY() + this.getAltura();

        double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lado2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double lado3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        double semiperimetro = (lado1 + lado2 + lado3) / 2;

        return (Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)));
    }
}
