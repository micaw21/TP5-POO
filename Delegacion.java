package TP5;

/** Permite crear y manipular objetos de tipo Delegacion
 * @author Wolkowyski, Micaela
 * @version 14/10/2023
 */

import java.util.*;

public class Delegacion extends Visitante{
    //Atirbutos
    private ArrayList<Individuo> integrantes;
    
    //Métodos Constructores
    /** Permite instanciar objetos de tipo Delegacion
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_visita de tipo Calendar, utilizado para asignar el estado de fechaVisita
     * @param p_integrantes de tipo ArrayList<Individuo>, utilizado para asignar el estado de integrantes
     */
    public Delegacion(String p_nombre, Calendar p_fechaVisita, ArrayList<Individuo> p_integrantes) {
        super(p_nombre, p_fechaVisita);
        this.setIntegrantes(p_integrantes);
    } 

    /** Permite instanciar objetos de tipo Delegacion 
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_visita de tipo Calendar, utilizado para asignar el estado de fechaVisita
     * @param p_individuo de tipo Individuo, utilizado para asignar el estado de integrantes
     */
    public Delegacion(String p_nombre, Calendar p_visita, Individuo p_individuo) {
        super(p_nombre, p_visita);
        this.setIntegrantes(new ArrayList<Individuo>());
        this.inscribirIndividuo(p_individuo);
    }

    //Setters y Getters
    private void setIntegrantes (ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }

    /** Permite obtener los integrantes
     * @param No utiliza parámetros
     * @return Retorna un ArrayList<Individuo>
     * @exception No dispara excepciones
     */
    public ArrayList<Individuo> getIntegrantes() {
        return this.integrantes;
    }

    //Métodos
    /** Calcula el precio de las entradas para la delegacion
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double entrada() {
        double total = 0;
        for(Individuo integrantes: this.getIntegrantes()) {
            total = total + integrantes.entrada();
        }
        return (total - (total * 0.10));
    }

    /** Permite inscribir individuos
     * @return No retorna ningún valor
     * @param p_individuo de tipo Individuo, utilizado para inscribirlo a la delegacion
     * @exception No dispara excepciones
     */
    public void inscribirIndividuo(Individuo p_individuo) {
        this.getIntegrantes().add(p_individuo);
    }

    /** Permite remover individuos
     * @return No retorna ningún valor
     * @param p_individuo de tipo Individuo, utilizado para removerlo de la delegacion
     * @exception No dispara excepciones
     */
    public void removerIndividuo(Individuo p_individuo) {
        this.getIntegrantes().remove(p_individuo);
    }

    /** Retorna la cantidad de integrantes de la delegacion
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int cantidadDeIntegrantes() {
        return this.getIntegrantes().size();
    }

    /** Muestra por pantalla los datos de la delegacion
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void mostrar() {
        System.out.println("----------------------------------------------------");
        System.out.println(this.tipoVisitante() + ": " + this.getNombre());
        for(Individuo integrantes: this.getIntegrantes()) {
            integrantes.mostrar();
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadDeIntegrantes());
        System.out.println("----------------------------------------------------");
    }

    /** Retorna una cadena de caracteres
     * @param No utiliza parámetros
     * @return Retorna un String
     * @excepcion No dispara excepciones
     */
    public String tipoVisitante() {
        return "Delegación";
    }

    /** Lista las delegaciones que visitaron cierta fecha pasada por parámetro
     * @param p_fecha de tipo Calendar, utilizada como fecha para filtrar las visitas de los individuos
     * @param p_visitante de tipo String, utilizado para verificar que el visitante sea de tipo Delegacion
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        if(p_visitante.equalsIgnoreCase("Delegacion")) {
            if((this.getFechaVisita().get(Calendar.DATE) == p_fecha.get(Calendar.DATE)) && (this.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH)) && (this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR))) {
                this.mostrar();
            } else {
                System.out.println("No hubo visitantes dicho dia!");
            }
        }
    }
}
