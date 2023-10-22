package TP5;
/** Permite crear y manipular objetos de tipo CuentasBancarias
 *  @author Wolkowyski, Micaela
 *  @version 05/10/2023
 */

public class CuentaBancaria {
    //Atributos
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo CuentaBancaria
     * @exception No dispara excepciones
     * @param p_nroCuenta de tipo int, utilizado para asignar el estado de nroCuenta
     * @param p_titular de tipo Persona, utilizado para asignar el estado de titular
     * @param p_importe de tipo double, utilizado para asignar el importe del saldo
     */
    public CuentaBancaria (int p_nroCuenta, Persona p_titular, double p_importe) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_importe);
        this.setTitular(p_titular);
    }

    /** Permite instanciar objetos de tipo CuentaBancaria
     * @exception No dispara excepciones
     * @param p_nroCuenta de tipo int, utilizado para asignar el estado de nroCuenta
     * @param p_titular de tipo Persona, utilizado para asignar el estado de titular
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
        this.setTitular(p_titular);
    }

    //Setters y Getters
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setSaldo(double p_importe) {
        this.saldo = p_importe;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    /** Permite obtener el número de cuenta
     * @exception No dispara excepciones
     * @return Retorna un int
     * @param No utiliza parámetros
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }

    /** Permite obtener el importe del saldo
     * @exception No dispara excepciones
     * @return Retorna un double
     * @param No utiliza parámetros
     */
    public double getSaldo() {
        return this.saldo;
    }

    /** Permite obtener el titular
     * @exception No dispara excepciones
     * @return Retorna un objeto de tipo Persona
     * @param No utiliza parámetros
     */
    public Persona getTitular() {
        return this.titular;
    }

    //Metodos
    /** Imprime por pantalla los datos de la cuenta bancaria
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void mostrar() {
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
    }

    /** Deposita el importe pasado por parámetro
     * @return No retorna ningún valor
     * @param p_importe de tipo double, utilizado como importe a depositar en la cuenta
     * @exception No dispara excepciones
     */
    public void depositar(double p_importe) {
        this.setSaldo(p_importe + this.getSaldo());
        System.out.println("Deposito realizado correctamente!");
    }

    /** Realiza la extracción
     * @return No retorna ningún valor
     * @param p_importe de tipo double, utilizado como importe a extraer
     * @exception No dispara excepciones
     */
    protected void extraccion(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
    }
}
