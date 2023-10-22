package TP5;

import java.util.*;

/** Permite crear y manipular objetos de tipo Empleado
 * @author Wolkowyski, Micaela
 * @version 28/09/2023
 */

public class Empleado extends Persona{
    //Atributos
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso = Calendar.getInstance();


    //Metodo Constructor
    /** Permite instanciar objetos de tipos Empleado
     * @return No retorna ningun valor
     * @exception No dispara ninguna exepcion
     * @param p_cuil tipo long, se utiliza para asignar el nuevo valor de cuil.
     * @param p_apellido tipo String, se utiliza para asignar el nuevo valor de apellido.
     * @param p_nombre tipo String, se utiliza para asignar el nuevo valor de nombre.
     * @param p_importe tipo Double, se utiliza para asignar el nuevo valor de importe.
     * @param p_anio tipo int, se utiliza para asignar el nuevo valor de anio.
     */
    public Empleado(int p_dni, String p_nombre, String p_apellido, int p_anioNac, long p_cuil, double p_importe, int p_anioIngr) {
        super(p_dni,p_nombre,p_apellido,p_anioNac);
        this.setCuil(p_cuil);
        this.setSueldo(p_importe);
        this.setAnio(p_anioIngr);
    }

    /** Permite instanciar objetos de tipo Empleado
     * @return No retorna ningun valor
     * @param p_cuil tipo long, se utiliza para asignar el nuevo valor de cuil.
     * @param p_apellido tipo String, se utiliza para asignar el nuevo valor de apellido.
     * @param p_nombre tipo String, se utiliza para asignar el nuevo valor de nombre.
     * @param p_importe tipo Double, se utiliza para asignar el nuevo valor de importe.
     * @param p_fecha tipo Calendar, utilizado para asignar la fecha de ingreso
     * @exception No dispara ninguna excepcion
     */
    public Empleado(int p_dni, String p_nombre, String p_apellido, int p_anioNac, long p_cuil, double p_importe, Calendar p_fecha) {
        super(p_dni, p_nombre, p_apellido, p_fecha);
        this.setCuil(p_cuil);
        this.setSueldo(p_importe);
        this.setFechaInicio(p_fecha);
    }

    //Setters 
    private void setFechaInicio(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    private void setSueldo(double p_importe) {
        this.sueldoBasico = p_importe;
    }

    private void setAnio(int p_anio) {
        this.fechaIngreso.set(Calendar.YEAR, p_anio);
    }

    //Getters
    /** Retorna la fecha de inicio
     * @param No utiliza parametros
     * @return Retorna un objeto de tipo Calendar
     * @exception No dispara ninguna excepcion
     */
    public Calendar getFechaInicio() {
        return this.fechaIngreso;
    }

    /** Retorna el CUIL
     * @param No utiliza parametros.
     * @return Devuelve un long.
     * @exception No dispara ninguna excepcion.
     */
    public long getCuil() {
        return this.cuil;
    }

    /** Retorna el sueldo.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    public double getSueldo() {
        return this.sueldoBasico;
    }
    
    /** Retorna el anio de ingreso.
     * @param No utiliza parametros.
     * @return Devuelve un int.
     * @exception No dispara ninguna excepcion.
     */
    public int getAnio() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }

    //Metodos
    /** Calcula la antiguedad laboral del empleado.
     * @param No utiliza parametros.
     * @return Devuelve un int.
     * @exception No dispara ninguna excepcion.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return(anioHoy - this.getAnio());
    }

    /** Calcula descuentos del sueldo.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    private double descuento() {
        return (this.getSueldo() - (this.getSueldo() * 0.02) - 1500);
    }

    /** Calcula el adicional del sueldo segun su antiguedad.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    private double adicional() {
        if(this.antiguedad() < 2) {
            return (this.getSueldo() + (this.getSueldo() * 0.02));
        } else if (this.antiguedad() >= 2 && this.antiguedad() < 10) {
            return(this.getSueldo() + (this.getSueldo() * 0.04));
        } else {
            return(this.getSueldo() + (this.getSueldo() * 0.06));
        }
    }

    /** Calcula el sueldo neto.
     * @param No utiliza parametros.
     * @return Devuelve un double.
     * @exception No dispara ninguna excepcion.
     */
    public double sueldoNeto() {
        return(this.getSueldo() + this.adicional() - this.descuento());
    }

    /** Retorna el nombre y apellido.
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String nomYApe() {
        return (this.getNombre() + " " + this.getApellido());
    }

    /** Retorna el apellido y nombre.
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String apeYNombre() {
        return(this.getApellido() + "," + " " + this.getNombre());
    }

    /** Muestra por pantalla nombre y apellido, cuil, antiguedad y el sueldo neto.
     * @param No utiliza parametros.
     * @return No retorna nada.
     * @exception No dispara ninguna excepcion.
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + " " + "Antiguedad: " + this.antiguedad() + " " + "anios de servicio");
        System.out.println("Sueldo Neto: " + " " + "$" + this.sueldoNeto());
    }

    /** Retorna una linea conteniendo CUIL, apellido y nombre y sueldo neto.
     * @param No utiliza parametros.
     * @return Devuelve un String.
     * @exception No dispara ninguna excepcion.
     */
    public String mostrarLinea() {
        return(this.getCuil() + "\t" + this.apeYNombre() + " " + ".................." + " " + "$" + this.sueldoNeto());
    }

    /** Retorna true si es el aniversario de la fecha de ingreso a la empresa
     * @param No utiliza parametros
     * @return Retorna un boolean
     * @exception No dispara ninguna excepcion
     */
    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();
        return ((fechaHoy.get(Calendar.DAY_OF_MONTH) == fechaIngreso.get(Calendar.DAY_OF_MONTH)) && (fechaHoy.get(Calendar.MONTH) == fechaIngreso.get(Calendar.MONTH)));
    }
}
