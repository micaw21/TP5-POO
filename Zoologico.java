package TP5;

/** Permite crear y manipular objetos de tipo Zoologico
 *  @author Wolkowyski, Micaela
 *  @version 14/10/2023
 */

import java.util.*;
public class Zoologico {
    //Atributos
    private String nombre;
    private ArrayList<Visitante> visitantes;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Zoologico
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     */
    public Zoologico(String p_nombre) {
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }

    /** Permite instanciar objetos de tipo Zoologico
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_visitantes de tipo ArrayList<Visitante>, utilizado para asignar el estado de visitantes
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes) {
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setVisitantes(ArrayList<Visitante> p_visitantes) {
        this.visitantes = p_visitantes;
    }

    /** Permite obtener el nombre
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Permite obtener los visitantes
     * @param No utiliza parámetros
     * @return Retorna un ArrayList<Visitante>
     * @exception No dispara excepciones
     */
    public ArrayList<Visitante> getVisitantes() {
        return this.visitantes;
    }

    //Métodos
    /** Permite agregar un nuevo visitante a la lista
     * @return No retorna ningún valor
     * @param p_visitantes de tipo Visitante, utilizado para agregarlo a la lista
     * @exception No dispara excepciones
     */
    public void nuevoVisitante(Visitante p_visitantes) {
        this.getVisitantes().add(p_visitantes);
    }

    /** Permite remover visitantes de la lista
     * @return No retorna ningún valor
     * @param p_visitantes de tipo Visitante, utilizado para removerlo de la lista
     * @exception No dispara excepciones
     */
    public void removerVisitante(Visitante p_visitantes) {
        this.getVisitantes().remove(p_visitantes);
    }

    /** Permite listar un tipo de visitante específico por fecha
     * @return No retorna ningún valor
     * @param p_fecha de tipo Calendar, utilizado como fecha a filtrar
     * @param p_tipoVisitante de tipo String, utilizado para filtrar el tipo de visitante
     * @exception No dispara excepciones
     */
    public void listaTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante) {
        for(Visitante visitant: this.getVisitantes()) {
            visitant.listarPorFecha(p_fecha, p_tipoVisitante);
        }
    }

    /** Permite listar visitantes en una fecha dada
     * @return No retorna ningún valor
     * @param p_fecha de tipo Calendar, utilizado como fecha a filtrar
     * @exception No dispara excepciones
     */
    public void listaVisitantePorFecha(Calendar p_fecha) {
        for(Visitante visitant: this.getVisitantes()) {
            if((visitant.getFechaVisita().get(Calendar.DATE) == p_fecha.get(Calendar.DATE)) && (visitant.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH)) && (visitant.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR))) {
                visitant.mostrar();
            }
        }
    }

    /** Calcula la recaudación de entradas desde una fecha hasta otra específica
     * @exception No dispara excepciones
     * @param p_fechaDesde de tipo Calendar, filtra desde que fecha calcular la recaudación
     * @param p_fechaHasta de tipo Calendar, filtra hasta que fecha calcular la recaudación
     * @return Retorna un double
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta) {
        double total = 0;
        for(Visitante visitant: this.getVisitantes()) {

            int comparacionDesde = visitant.getFechaVisita().compareTo(p_fechaDesde);
            int comparacionHasta = visitant.getFechaVisita().compareTo(p_fechaHasta);

            if (comparacionDesde >= 0 && comparacionHasta <= 0) {
                total = total + visitant.entrada();
            }
        }
        return total;
    }
}
