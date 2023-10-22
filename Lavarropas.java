package TP5;

/** Permite crear y manipular objetos de tipo Lavarropas
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */

public class Lavarropas extends ArtefactoHogar{
    //Atributos
    private int programas;
    private float kilos;
    private boolean automatico;

    //Método Constructor
    /** Permite instanciar objetos de tipo Lavarropas
     * @param p_marca de tipo String, utilizado para asignar el estado de marca
     * @param p_precio de tipo float, utilizado para asignar el estado de precio
     * @param p_stock de tipo int, utilizado para asignar el estado de stock
     * @param p_programas de tipo int, utilizado par asignar el estado de programas
     * @param p_kilos de tipo float, utilizad para asignar el estado de kilos
     * @param p_automatico de tipo boolean, utilizado para asignar el estado de automatico
     */
    public Lavarropas(String p_marca, float p_precio, int  p_stock, int p_programas, float p_kilos, boolean p_automatico) {
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }
    //Setters y Getters
    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }

    /** Permite obtener la cantidad de programas
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getProgramas() {
        return this.programas;
    }

    /** Permite obtener los kilos
     * @param No utiliza parámetros
     * @return Retorna un float
     * @exception No dispara excepciones
     */
    public float getKilos() {
        return this.kilos;
    }

    /** Permite obtener si es automático o no
     * @param No utiliza parámetros
     * @return Retorna un boolean
     * @exception No dispara excepciones
     */
    public boolean getAutomatico() {
        return this.automatico;
    }

    //Métodos
    /** Imprime por pantalla los datos del lavarropa
     * @param No utiliza parametros
     * @exception No dispara excepciones
     * @return No devuelve ningun valor
     */
    public void imprimir() {
        System.out.println("**** Lavarropas ****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        if(this.getAutomatico() == true) {
            System.out.println("Automatico: Si");
        } else {
            System.out.println("Automatico: No");
        }
    }

    /** Calcula el credito con adicional
     * @param p_cuotas de tipo int, utilizado como cantidad de cuotas
     * @param p_interes de tipo float, utilizado como interes a sumer
     * @return Retorna un float
     * @exception No dispara excepciones
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        if (this.getAutomatico() == false){
            return (float)(this.cuotaCredito(p_cuotas, p_interes) - ((this.cuotaCredito(p_cuotas, p_interes) * 0.02)));
        } else {
            return this.cuotaCredito(p_cuotas, p_interes);
        }
    }
}
