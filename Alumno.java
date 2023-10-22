package TP5;

/** Permite crear y manipular un objeto de tipo Alumno.
 *  @author  Wolkowyski, Micaela
 *  @version 28/09/2023
 */

public class Alumno extends Persona{

    //Atributos
    private int lu = 0;
    private double nota1 = 0;
    private double nota2 = 0;

    //Metodo Constructor
    public Alumno(int p_dni, String p_nombre, String p_apellido, int p_anio, int p_lu) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLU(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    //Setters
    private void setLU(int p_lu) {
        this.lu = p_lu;
    }

    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }

    public void setNota2(double p_nota2) {
        this.nota2 = p_nota2;
    }

    //Getters
    /** Devuelve el LU
     * @exception No dispara excepcion
     * @return Retorna un int
     * @param No utiliza parametros
     */
    public int getLu() {
        return this.lu;
    }

    /** Devuelve la nota1
     * @param No utiliza parametros
     * @return Retorna un double
     * @exception No dispara ninguna excepcion
     */
    public double getNota1() {
        return this.nota1;
    }

    /** Devuelve la nota2
     * @exception No dispara ninguna excepcion
     * @return Retorna un double
     * @param No utiliza parametros
     */
    public double getNota2() {
        return this.nota2;
    }

    //Metodos

    /** Retorna true si las notas del alumno coinciden con las necesarias o false en caso contrario.
     *  @return Devuelve un booleano
     *  @param No utiliza parametros.
     *  @exception No dispara ninguna excepcion. 
     */
    private boolean aprueba() {
        if(this.promedio() >= 7.0 && (this.getNota1() >= 6.0 && this.getNota2() >= 6.0)) {
            return true;
        } else {
            return false;
        }
    }

    /** Retorna una leyenda dependiendo del mensaje aprueba()
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara excepciones.
     */
    private String leyendaAprueba(){
        if(this.aprueba()){
            return("APROBADO");
        } else {
            return("DESAPROBADO");
        }
    }

    /** Calcula el promedio de dos notas
     * @param No utiliza parametros.
     * @return Retorna un double.
     * @exception No dispara excepciones.
     */
    public double promedio() {
        return((this.getNota1() + this.getNota2()) / 2);
    }

    /** Retorna un String conteniendo nombre y apellido
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara excepciones.
     */
    public String nomYApe() {
        return (this.getNombre() + " " + this.getApellido());
    }

    /** Retorna un String conteniendo apellido y nombre
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara excepciones.
     */
    public String apeYNom() {
        return (this.getApellido() + " " + this.getNombre());
    }

    /** Muestra por pantalla nombre y apellido, libreta universitaria, las notas y el promedio
     * @param No utiliza parametros.
     * @return No retorna un valor.
     * @exception No dispara excepciones.
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("\t" + "LU:" + this.getLu() + "\t" + "Notas: " + this.getNota1() + " " + "-" + " " + this.getNota2());
        System.out.println("\t" + "Promedio: " + this.promedio() + " " + "-" + " " + this.leyendaAprueba());
    }
}
