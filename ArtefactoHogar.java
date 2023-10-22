package TP5;

/** Permite crear y manipular objetos de tipo ArtefactoHogar
 * @author Wolkowyski, Micaela
 * @version 11/10/2023
 */
public abstract class ArtefactoHogar {
    //Atributos
    private String marca;
    private float precio;
    private int stock;

    //Metodo Constructor
    /** Permite instanciar objetos de tipo ArtefactoHogar
     * @param p_marca de tipo String, utilizado para asignar el estado de marca
     * @param p_precio de tipo float, utilizado para asignar el estado de precio
     * @param p_stock de tipo int, utilizado para asignar el estado de stock
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock) {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    //Setters y Getters
    private void setMarca(String p_marca) {
        this.marca = p_marca;
    }

    private void setPrecio(float p_precio) {
        this.precio = p_precio;
    }

    private void setStock(int p_stock) {
        this.stock = p_stock;
    }

    /** Permite obtener la marca
     * @exception No dispara excecpciones
     * @return Retorna un String
     * @param No utiliza parametros
     */
    public String getMarca() {
        return this.marca;
    }

    /** Permite obtener el precio
     * @param No utiliza parametros
     * @return Retorna un float
     * @exception No dispara excepciones
     */
    public float getPrecio() {
        return this.precio;
    }

    /** Permite obtener stock
     * @param No utiliza parametros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int getStock() {
        return this.stock;
    }

    //Metodos
    /** Imprime por pantalla los datos de los artefactos
     * @param No utiliza parametros
     * @exception No dispara excepciones
     * @return No retorna ningun valor
     */
    public void imprimir() {
        System.out.println("Marca: " + this.getMarca() + " - Precio: " + this.getPrecio() + " - Stock: " + this.getStock());
    }

    /** Calcula las cuotas de credito
     * @exception No dispara excepciones
     * @param p_cuotas de tipo int, utilizado como cantidad de cuotas
     * @param p_interes de tipo float, utilizado como el interes a sumar
     * @return Retorna un float
     */
    public float cuotaCredito(int p_cuotas, float p_interes) {
        return ((this.getPrecio() + (this.getPrecio() * (p_interes / 100))) / p_cuotas);
    }

    /** Calcula el credito con adicional
     * @exception No dispara excepciones
     * @param p_cuotas de tipo int, utilizado como cantidad de cuotas
     * @param p_interes de tipo float, utilizado como el interes a sumar
     * @return Retorna un float
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
