package TP5;

/** Permite crear y manipular objetos de tipo CajaDeAhorro
 * @author Wolkowyski, Micaela
 * @version 05/10/2023
 */

public class CajaDeAhorro extends CuentaBancaria{
    //Atributos
    private int extraccionesPosibles;

    //Metodos Constructores
    /** Permite instanciar objetos de tipo CajaDeAhorro
     * @exception No dispara excepciones
     * @param p_nroCuenta de tipo int, utilizado para asignar el estado de nroCuenta
     * @param p_titular de tipo Persona, utilizado para asignar el estado del titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    }

    /** Permite instanciar objetos de tipo CajaDeAhorro
     * @exception No dispara excepciones
     * @param p_nroCuenta de tipo int, utilizado para asignar el estado de nroCuenta
     * @param p_importe de tipo double, utilizado para asignar el estado del saldo
     * @param p_titular de tipo Persona, utilizado para asignar el estado del titular
     */
    public CajaDeAhorro(int p_nroCuenta, double p_importe, Persona p_titular) {
        super(p_nroCuenta, p_titular, p_importe);
        this.setExtraccionesPosibles(10);
    }

    //Setters y Getters
    private void setExtraccionesPosibles(int p_extracciones) {
        this.extraccionesPosibles = p_extracciones;
    }

    /** Devuelve las extracciones posibles
     * @param No utiliza parámetros
     * @return Devuelve un int
     * @exception No dispara excepciones
     */
    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    //Metodos
    /** Verifica si se cumplen las condiciones para extraer
     * @exception No dispara excepciones
     * @param p_importe de tipo double, utilizado para verificar si cumple las condiciones
     * @return Retorna un boolean
     */
    private boolean puedeExtraer(double p_importe) {
        return (p_importe <= this.getSaldo() && this.getExtraccionesPosibles() != 0);
    }

    /** Realiza la extracción y disminuye las extracciones posibles
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    protected void extraccion(double p_importe) {
        super.extraccion(p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }

    /** Confirma la extracción
     * @exception No dispara excepciones
     * @param p_importe de tipo double, utilizado como importe a extraer
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

    /** Imprime por pantalla los datos de la CajaDeAhorro
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void mostrar() {
        System.out.println("\t" + "-     Caja de Ahorro    -");
        super.mostrar();
        System.out.println("Extracciones Posibles: " + this.getExtraccionesPosibles());
    }

    /** Da las razones por las cuales no se pudo extraer
     * @exception No dispara excepciones
     * @param p_importe de tipo double, utilizado para ver por qué no se puede extraer
     * @return Retorna un String
     */
    public String xQNoPuedeExtraer(double p_importe) {
        if(this.getExtraccionesPosibles() == 0) {
            return ("No tiene habilitadas mas extracciones!");
        } else if(p_importe > this.getSaldo()) {
            return ("No puede extraer mas que el saldo!");
        } else {
            return ("Extracción completada!");
        }
    }
}
