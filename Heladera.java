package TP5;

/** Permite crear y manipular objetos de tipo Heladera
 * @author Wolkowyski, Micaela
 * @version 11/10/2023
 */
public class Heladera extends ArtefactoHogar {
    //Atributos
    private int pies;
    private int puertas;
    private boolean compresor;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo Heladera
     * @param p_marca de tipo String, utilizado para asignar el estado de marca
     * @param p_precio de tipo float, utilizado para asignar el estado de precio
     * @param p_stock de tipo int, utilizado para asignar el estado de stock
     * @param p_pies de tipo int, utilizado para asignar el estado de pies
     * @param p_puertas de tipo int, utilizado para asignar el estado de puertas
     * @param p_compresor de tipo boolean, utilizado para asignar el estado de compresor
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor) {
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }

    //Setters y Getters
    private void setPies(int p_pies) {
        this.pies = p_pies;
    }

    private void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }

    private void setCompresor(boolean p_compresor) {
        this.compresor = p_compresor;
    }

    /** Permite obtener la cantidad de pies
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getPies() {
        return this.pies;
    }

    /** Permite obtener la cantidad de puertas
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getPuertas() {
        return this.puertas;
    }

    /** Permite obtener si tiene o no compresor
     * @param No utiliza parametros
     * @return Retorna un boolean
     * @exception No dispara excepciones
     */
    public boolean getCompresor() {
        return this.compresor;
    }

    //Metodos
    /** Imprime por pantalla los datos de la Heladera
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return No devuelve ningún valor
     */
    public void imprimir() {
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        if(this.getCompresor() == true) {
            System.out.println("Compresor: Si");
        } else {
            System.out.println("Compresor: No");
        }
    }

    /** Calcula el credito adicional 
     * @param p_cuotas de tipo int, utilizado como cantidad de cuotas a pagar
     * @param p_interes de tipo float, utilizado coo el interes a sumar
     * @exception No dispara excepciones
     * @return Retorna un float
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        return cuotaCredito(p_cuotas, p_interes) + 50;
    }
}