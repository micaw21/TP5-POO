package TP5;

/** Permite crear y manipular objetos de tipo Visitante
 * @author Wolkowyski, Micaela
 * @version 13/10/2023
 */

import java.util.*;
public abstract class Visitante {
    //Atributos
    private String nombre;
    private Calendar fechaVisita = Calendar.getInstance();

    //Método Constructor
    /** Permite instanciar objetos de tipo Visitante
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre.
     * @param p_fecha de tipo Calendar, utilizado para asignar el estado de fechaVisita.
     */
    public Visitante(String p_nombre, Calendar p_fecha) {
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setFechaVisita(Calendar p_fecha) {
        this.fechaVisita = p_fecha;
    }

    /** Permite obtener el nombre del visitante
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Permite obtener la fecha de visita
     * @param No utiliza parámetros
     * @return Retorna un objeto de tipo Calendar
     * @exception No dispara excepciones
     */
    public Calendar getFechaVisita() {
        return this.fechaVisita;
    }

    //Métodos
    /** Método abstracta, permite mostrar los datos del visitante
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public abstract void mostrar();

    /** Método abstracta, calcula la entrada
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public abstract double entrada();

    /** Método abstracto, permite listar los visitantes por fecha 
     * @return No retorna ningún valor
     * @param p_fecha de tipo Calendar, utilizado como fecha a mostrar visitantes
     * @param p_visitante de tipo String, utilizado para confirmar que tipo de visitante desea mostrar
     * @exception No dispara excepciones
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);

    /** Método abstracto, retorna el tipo de visitante como cadena de caracteres
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public abstract String tipoVisitante();
}
