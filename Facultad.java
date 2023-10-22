package TP5;

/** Permite crear y manipular objetos de tipo Facultad
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */

import java.util.*;

public class Facultad {
    //Atributos
    private String nombre;
    private ArrayList<Profesor> profesores;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Facultad
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_profesor de tipo Profesor, utilizado para asignar el estado de profesores
     */
    public Facultad(String p_nombre, Profesor p_profesor){
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>());
        this.agregarProfesor(p_profesor);
    }

    /** Permite instanciar objetos de tipo Facultad
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_profesores de tipo ArrayList<Profesor>, utilizado para asignar el estado de profesores
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores) {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setProfesores(ArrayList<Profesor> p_profesores) {
        this.profesores = p_profesores;
    }

    /** Permite obtener el nombre
     * @exception No dispara excepciones
     * @return Retorna un String
     * @param No utiliza parámetros
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Permite obtener los profesores
     * @param No utiliza parámetros
     * @return Retorna un ArrayList<Profesor>
     * @exception No dispara excepciones
     */
    public ArrayList<Profesor> getProfesores() {
        return this.profesores;
    }

    //Métodos
    /** Permite agregar un profesor
     * @exception No dispara excepciones
     * @param p_profesor de tipo Profesor, utilizado para agregarlo
     * @return Retorna un boolean
     */
    public boolean agregarProfesor(Profesor p_profesor) {
        return this.getProfesores().add(p_profesor);
    }

    /** Permite quitar un profesor
     * @exception No dispara excepciones
     * @param p_profesor de tipo Profesor, utilizado para removerlo
     * @return Retorna un boolean
     */
    public boolean quitarProfesor(Profesor p_profesor) {
        return this.getProfesores().remove(p_profesor);
    }

    /** Imprime por pantalla la nómina de profesores con todos sus datos más el total a pagar en sueldos
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void nominaProfesores() {
        System.out.println("*************** Nómina Facultad: " + this.getNombre());
        System.out.println("-------------------------------------------------------");
        for(Profesor profesores: this.getProfesores()) {
            System.out.println(profesores.mostrarLinea());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Total a pagar: $" + this.totalAPagar());
    }

    /** Calcula el total a pagar en sueldos
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double totalAPagar() {
        double total = 0;
        for(Profesor profesores: this.getProfesores()) {
            total = total + profesores.sueldoTotal();
        } 
        return total;
    }

    /** Imprime por pantalla la lista de profesores con sus cargos
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void listarProfesorCargos() {
        int cantidad = 0;
        System.out.println("***** Detalle de Profesores y cargos de Facultad: " + this.getNombre());
        System.out.println("-------------------------------------------------------");
        for(Profesor profesores: this.getProfesores()) {
            profesores.mostrar();
            cantidad++;
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Hay " + cantidad + " profesor/es");
    }
}
