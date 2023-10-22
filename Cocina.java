package TP5;

/** Permite crear y manipular objetos de tipo Cocina
 * @author Wolkowyski, Micaela
 * @version 11/10/2023
 */

public class Cocina extends ArtefactoHogar{
    //Atributos
    private int hornallas;
    private int calorias;
    private String dimensiones;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Cocina
     * @param p_marca de tipo String, utilizado para asignar el estado de marca
     * @param p_precio de tipo float, utilizado para asignar el estado de precio
     * @param p_stock de tipo int, utilizado para asignar el estado de stock
     * @param p_hornallas de tipo int, utilizado para asignar el estado de hornallas
     * @param p_calorias de tipo int, utilizado para asignar el estado de calorias
     * @param p_dimensiones de tipo String, utilizado para asignar el estado de dimensiones
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones) {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }

    //Setters y Getters
    private void setHornallas(int p_hornallas) {
        this.hornallas = p_hornallas;
    }

    private void setCalorias(int p_calorias) {
        this.calorias = p_calorias;
    }

    private void setDimensiones(String p_dimensiones) {
        this.dimensiones = p_dimensiones;
    }

    /** Permite obtener la cantidad de hornallas
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getHornallas() {
        return this.hornallas;
    }

    /** Permite obtener la cantidad de calorias
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getCalorias() {
        return this.calorias;
    }

    /** Permite obtener las dimensiones
     * @param No utiliza parametros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getDimensiones() {
        return this.dimensiones;
    }
    //Metodos
    /** Imprime por pantalla los datos de la cocina
     * @param No utiliza parametros
     * @exception No dispara excepciones
     * @return No devuelve ningun valor
     */
    public void imprimir() {
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
    }

    /** Calcula el credito con adicional
     * @param p_cuotas de tipo int, utilizado como cantidad de cuotas
     * @param p_interes de tipo float, utilizado como interes a sumer
     * @return Retorna un float
     * @exception No dispara excepciones
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        return this.cuotaCredito(p_cuotas, p_interes);
    }
}
