package TP5;

/** Permite crear y manipular objetos de tipo Cargo
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cargo {
    //Atributos
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    //Método Constructor
    /** Permite instanciar objetos de tipo Cargo
     * @param p_nombre de tipo String, utilizado para asignar el estado del nombreCargo
     * @param p_importe de tipo double, utilizado para asignar el estado de sueldoBasico
     * @param p_anio de tipo int, utilizado para asignar el estado de anioIngreso
     */
    public Cargo(String p_nombre, double p_importe, int p_anio) {
        this.setNombreCargo(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setHorasDeDocencia(10);
    }

    /** Permite instanciar objetos de tipo Cargo
     * @param p_nombre de tipo String, utilizado para asignar el estado del nombreCargo
     * @param p_importe de tipo double, utilizado para asignar el estado de sueldoBasico
     * @param p_anio de tipo int, utilizado para asignar el estado de anioIngreso
     * @param p_horas de tipo int, utilizado para asignar el estado de horasDeDocencia
     */
    public Cargo(String p_nombre, double p_importe, int p_anio, int p_horas) {
        this.setNombreCargo(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setHorasDeDocencia(p_horas);
    }

    //Setters y Getters
    private void setNombreCargo(String p_nombre) {
        this.nombreCargo = p_nombre;
    }

    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }

    private void setAnioIngreso(int p_anio) {
        this.anioIngreso = p_anio;
    }

    private void setHorasDeDocencia(int p_horas) {
        this.horasDeDocencia = p_horas;
    }

    /** Permite obtener el nombre del cargo
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara ninguna excepción
     */
    public String getNombreCargo() {
        return this.nombreCargo;
    }

    /** Permite obtener el sueldo básico
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara ninguna excepción
     */
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    /** Permite obtener el año de ingreso
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara ninguna excepción
     */
    public int getAnioIngreso() {
        return this.anioIngreso;
    }

    /** Permite obtener las horas de docencia
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara ninguna excepción
     */
    public int getHorasDeDocencia() {
        return this.horasDeDocencia;
    }

    //Métodos
    /** Calcula la antiguedad de trabajo
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara ninguna excepción
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anio = fechaHoy.get(Calendar.YEAR);
        return (anio - this.getAnioIngreso());
    }

    /** Calcula el adicional por año de antiguedad
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara ninguna excepción
     */
    private double adicionalXAntiguedad() {
        return 0.01 * this.getSueldoBasico() * this.antiguedad();
    }

    /** Calcula el sueldo del cargo
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara ninguna excepción
     */
    public double sueldoDelCargo() {
        return this.sueldoBasico + this.adicionalXAntiguedad();
    }

    /** Imprime por pantalla los datos del cargo
     * @param No utiliza parámetros
     * @return No devuelve ningún valor
     * @exception No dispara ninguna excepción
     */
    public void mostrarCargo() {
        System.out.println(this.getNombreCargo() + " - Sueldo Básico: " + this.getSueldoBasico() + " - Sueldo Cargo: " + this.sueldoDelCargo() + " - Antiguedad: " + this.antiguedad() + " años");
        System.out.println("Horas Docencia: " + this.getHorasDeDocencia());
    }



}
