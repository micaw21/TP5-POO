package TP5;

/** Permite crear y manipular objetos de tipo Individuo
 * @author Wolkowyski, Micaela
 * @version 13/10/2023
 */

import java.util.*;

public class Individuo extends Visitante{
    //Atributo
    private Persona persona;
    
    //Método Constructor
    /** Permite instanciar objetos de tipo Individuo
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_fechaVisita de tipo Calendar, utilizado para asignar el estado de fechaVisita
     * @param p_persona de tipo Persona, utilizado para asignar el estado de persona
     */
    public Individuo(String p_nombre, Calendar p_fechaVisita, Persona p_persona) {
        super(p_nombre, p_fechaVisita);
        this.setPersona(p_persona);
    }

    //Setters y Getters
    private void setPersona(Persona p_persona) {
        this.persona = p_persona;
    }

    /** Permite obtener a la persona
     * @param No utiliza parámetros
     * @return Retorna un objeto de tipo Persona
     * @exception No dispara excepciones
     */
    public Persona getPersona() {
        return this.persona;
    }

    //Métodos
    /** Retorna el valor de entrada por individuo
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return Retorna un double
     */
    public double entrada() {
        return 10;
    }

    /** Muestra los datos del individuo por pantalla
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.getPersona().nomYApe());
        System.out.println("DNI: " + this.getPersona().getDni() + " Edad: " + this.getPersona().edad());
    }

    /** Lista los individuos que visitaron cierta fecha pasada por parámetro
     * @param p_fecha de tipo Calendar, utilizada como fecha para filtrar las visitas de los individuos
     * @param p_visitante de tipo String, utilizado para verificar que el visitante sea de tipo Individuo
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        if(p_visitante.equalsIgnoreCase("Individuo")) {
            if((this.getFechaVisita().get(Calendar.DATE) == p_fecha.get(Calendar.DATE)) && (this.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH)) && (this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR))) {
                this.mostrar();
            } else {
                System.out.println("No hubo visitantes en dicha fecha!");
            }
        }
    }

    /** Retorna una cadena de caracteres 
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return Retorna un String
     */
    public String tipoVisitante() {
        return ("Individuo");
    }
}
