package TP5;

/** Permite crear y manipular objetos de tipo Exclusivo
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */

public class Exclusivo extends Cargo{
    //Atributos
    private int horasDeInvestigacion;
    private int horasDeExtension;

    //Método Constructor
    /** Permite instanciar objetos de tipo Exclusivo
     * @param p_nombre de tipo String, utilizado para asignar el estado del nombreCargo
     * @param p_importe de tipo double, utilizado para asignar el estado del sueldoBasico
     * @param p_anioIngreso de tipo int, utilizado para asignar el estado de anioIngreso
     * @param p_horasDocencia de tipo int, utilizado para asignar el estado de horasDeDocencia
     * @param p_horasInvest de tipo int, utilizado para asignar el estado de horasDeInvestigacion
     * @param p_horasExt de tipo int, utilizado para asignar el estado de horasDeExtension
     */
    public Exclusivo(String p_nombre, double p_importe, int p_anioIngreso, int p_horasDocencia, int p_horasInvest, int p_horasExt)  {
        super(p_nombre, p_importe, p_anioIngreso, p_horasDocencia);
        this.setHorasDeInvestigacion(p_horasInvest);
        this.setHorasDeExtension(p_horasExt);
    }

    /** Permite instanciar objetos de tipo Exclusivo
     * @param p_nombre de tipo String, utilizado para asignar el estado del nombreCargo
     * @param p_importe de tipo double, utilizado para asignar el estado del sueldoBasico
     * @param p_anioIngreso de tipo int, utilizado para asignar el estado de anioIngreso
     * @param p_horasInvest de tipo int, utilizado para asignar el estado de horasDeInvestigacion
     * @param p_horasExt de tipo int, utilizado para asignar el estado de horasDeExtension
     */
    public Exclusivo(String p_nombre, double p_importe, int p_anioIngreso, int p_horasInvest, int p_horasExt)  {
        super(p_nombre, p_importe, p_anioIngreso);
        this.setHorasDeInvestigacion(p_horasInvest);
        this.setHorasDeExtension(p_horasExt);
    }

    //Setters y Getters
    private void setHorasDeInvestigacion(int p_horasInvest) {
        this.horasDeInvestigacion = p_horasInvest;
    }

    private void setHorasDeExtension(int p_horasExt) {
        this.horasDeExtension = p_horasExt;
    }

    /** Permite obtener las horas de investigacion
     * @param No utiliza parámetros
     * @exception No dispara ninguna excepción
     * @return Retorna un int
     */
    public int getHorasDeInvestigacion() {
        return this.horasDeInvestigacion;
    }

    /** Permite obtener las horas de extensión
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara ninguna excepción
     */
    public int getHorasDeExtension() {
        return this.horasDeExtension;
    }

    //Métodos
    /** Imprime por pantalla los datos del cargo exclusivo
     * @param No utiliza parámetros
     * @exception No dispara ninguna excepción
     * @return No devuelve ningún valor
     */
    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("---- Cargo de caracter Exclusivo ----");
        System.out.println("Horas investigación: " + this.getHorasDeInvestigacion());
        System.out.println("Horas extensión: " + this.getHorasDeExtension());
    }

}
