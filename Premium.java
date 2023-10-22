package TP5;

/** Permite crear y manipular objetos de tipo Premium
 * @author Wolkowyski, Micaela
 * @version 14/10/2023
 */

public class Premium extends Etiqueta{
    //Atributos
    private int colores;
    
    //Metodo Constructor
    /** Permite instanciar objetos de tipo Premium
     * @param p_costo de tipo double, utilizado para asignar el estado de costo
     * @param p_colores de tipo int, utilizado para asignar el estado de colores
     */
    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }

    //Setters y Getters
    private void setColores(int p_colores) {
        this.colores = p_colores;
    }

    /** Permite obtener la cantidad de colores
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getColores() {
        return this.colores;
    }

    //Metodos
    /** Calcula el precio por etiqueta premium
     * @param q de tipo int, utilizado como cantidad de etiquetas
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double precio(int q) {
        return (this.getCosto() + this.adicional()) * q;
    }

    /** Calcula el precio adicional por cantidad de colores de etiqueta
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    private double adicional() {
        if(this.getColores() == 1) {
            return 0;
        } else if(this.getColores() == 2) {
            return (this.getCosto() * 0.05);
        } else if (this.getColores() == 3) {
            return (this.getCosto() * 0.07); 
        } else {
            return (this.getCosto() * (this.getColores() * 0.03));
        }
    }

    /** Retorna el tipo de etiqueta, en este caso premium
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    protected String tipo() {
        return "Premium";
    }

    /** Retorna una cadena de caracteres con el tipo de etiqueta y la cantidad de colores
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String toString() {
        return super.toString() + " Colores: " + this.getColores();
    }
}
