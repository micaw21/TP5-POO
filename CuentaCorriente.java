package TP5;

/** Permite crear y manipular objetos de tipo CuentaCorriente
 * @author Wolkowyski, Micaela
 * @version 05/10/2023
 */

public class CuentaCorriente extends CuentaBancaria{
    //Atributos
    private double limiteDescubierto;

    //Metodos Constructores
    /** Permite instanciar objetos de tipo CuentaCorriente
     * @param p_nroCuenta de tipo int, utilizado para asignar el estado de número de cuenta
     * @param p_titular de tipo Persona, utilizado para asignar el estado de titular
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500);
    }

    /** Permite instanciar objetos de tipo CuentaCorriente
     * @param p_nroCuenta de tipo int, utilizado para asignar el estado de número de cuenta
     * @param p_titular de tipo Persona, utilizado para asignar el estado de titular
     * @param p_saldo de tipo double, utilizado para asignar el estado de saldo
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500);
    }

    //Setters y Getters
    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }

    /** Permite obtener el limite de descubierto
     * @exception No dispara excepciones
     * @return Retorna un double
     * @param No utiliza parámetros
     */
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    //Metodos
    /** Verifica si puede extraer la cantidad dada por parámetro
     * @exception No dispara excepciones
     * @param p_importe de tipo double, utilizado para verificar si se puede extraer dicho importe
     * @return Retorna un boolean
     */
    private boolean puedeExtraer(double p_importe) {
        return (p_importe <= (this.getSaldo() + this.getLimiteDescubierto()));
    }

    /** Permite extraer un monto pasado por parámetro
     * @exception No dispara excepciones
     * @param p_importe de tipo double, utilizado como monto a extraer
     * @return Retorna un boolean
     */
    public boolean extraer(double p_importe) {
        if(this.puedeExtraer(p_importe)) {
            this.extraccion(p_importe);
            System.out.println(this.xQNoPuedeExtraer(p_importe));
            return true;
        } else {
            System.out.println(this.xQNoPuedeExtraer(p_importe));
            return false;
        }
    }

    /** Imprime por pantalla los datos de la Cuenta Corriente
     * @param No utiliza parámetros
     * @return No devuelve ningún valor
     * @exception No dispara excepciones
     */
    public void mostrar() {
        System.out.println("\t" + "-     Cuenta Corriente    -");
        super.mostrar();
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }

    /** Imprime por pantalla por qué no se puede extraer dicho importe pasado por parámetro
     * @exception No dispara excepciones
     * @param p_importe de tipo double, utilizado para ver por qué no se puede extraer ese importe
     * @return Retorna un String
     */
    public String xQNoPuedeExtraer(double p_importe) {
        if(p_importe > this.getLimiteDescubierto()) {
            return ("El importe de extraccion sobrepasa el limite de descubierto!");
        } else {
            return ("Extraccion exitosa!");
        }
    }


}
