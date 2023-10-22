package TP5;

/** Permite crear y manipular objetos de tipo SemiExclusivo
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */
public class SemiExclusivo extends Cargo{
    //Atributos
    private int horasDeInvestigacion;

    //Método Constructor
    /** Permite instanciar objetos de tipo SemiExclusivo
     * @param p_nombre de tipo String, utilizado para asignar el estado del nombreCargo
     * @param p_importe de tipo double, utilizado para asignar el estado de sueldoBasico
     * @param p_anio de tipo int, utilizado para asignar el estado de anioIngreso
     * @param p_horasInvest de tipo int, utilizado para asignar el estado de horasDeInvestigacion
     */
    public SemiExclusivo(String p_nombre, double p_importe, int p_anio, int p_horasInvest) {
        super(p_nombre, p_importe, p_anio);
        this.setHorasDeInvestigacion(p_horasInvest);
    }

    /** Permite instanciar objetos de tipo SemiExclusivo
     * @param p_nombre de tipo String, utilizado para asignar el estado del nombreCargo
     * @param p_importe de tipo double, utilizado para asignar el estado de sueldoBasico
     * @param p_anio de tipo int, utilizado para asignar el estado de anioIngreso
     * @param p_horasDoc de tipo int, utilizado para asignar el estado de horasDeDocencia
     * @param p_horasInvest de tipo int, utilizado para asignar el estado de horasDeInvestigacion
     */
    public SemiExclusivo(String p_nombre, double p_importe, int p_anio, int p_horasDoc, int p_horasInvest) {
        super(p_nombre, p_importe, p_anio, p_horasDoc);
        this.setHorasDeInvestigacion(p_horasInvest);
    }

    //Setter y Getter
    private void setHorasDeInvestigacion(int p_horas) {
        this.horasDeInvestigacion = p_horas;
    }

    /** Permite obtener las horas de investigación
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara ninguna excepción
     */
    public int getHorasDeInvestigacion() {
        return this.horasDeInvestigacion;
    }

    //Métodos
    /** Imprime los datos del cargo semiexclusivo por pantalla
     * @param No utiliza parámetros
     * @exception No dispara ninguna excepción
     * @return No devuelve ningún valor
     */
    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("---- Cargo de caracter SemiExclusivo ----");
        System.out.println("Horas de Investigación: " + this.getHorasDeInvestigacion());
    }
}
