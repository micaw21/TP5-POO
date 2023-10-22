package TP5;

/** Permite crear y manipular objetos de tipo Profesor
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */

import java.util.*;

public class Profesor extends Persona{
    //Atributos
    private String titulo;
    private ArrayList<Cargo> cargos;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Profesor
     * @exception No dispara excepciones
     * @param p_dni de tipo int, utilizado para asignar el estado del dni
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_apellido de tipo String, utilizado para asignar el estado de apellido
     * @param p_anio de tipo int, utilizado para asignar el estado de año de nacimiento
     * @param p_titulo de tipo String, utilizado para asiganr el estado de titulo
     * @param p_cargos de tipo ArrayList<Cargo>, utilizado para asignar el estado de cargos
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }

    /** Permite instanciar objetos de tipo Profesor
     * @exception No dispara excepciones
     * @param p_dni de tipo int, utilizado para asignar el estado del dni
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_apellido de tipo String, utilizado para asignar el estado de apellido
     * @param p_anio de tipo int, utilizado para asignar el estado de año de nacimiento
     * @param p_titulo de tipo String, utilizado para asiganr el estado de titulo
     * @param p_cargo de tipo Cargo, utilizado para asignar el estado de cargos
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, Cargo p_cargo) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<Cargo>());
        this.agregarCargo(p_cargo);
    }

    //Setters y Getters
    private void setTitulo(String p_titulo) {
        this.titulo = p_titulo;
    }

    private void setCargos(ArrayList<Cargo> p_cargos) {
        this.cargos = p_cargos;
    }

    /** Permite obtener el titulo
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getTitulo() {
        return this.titulo;
    }

    /** Permite obtener los cargos
     * @param No utiliza parámetros
     * @return Retorna un ArrayList<Cargo>
     * @exception No dispara excepciones
     */
    public ArrayList<Cargo> getCargos() {
        return this.cargos;
    }

    //Métodos
    /** Agrega un cargo al profesor
     * @exception No dispara excepciones
     * @param p_cargo de tipo Cargo, utilizado para asignar ese cargo al profesor
     * @return Retorna un boolean
     */
    public boolean agregarCargo(Cargo p_cargo) {
        return this.getCargos().add(p_cargo);
    }

    /** Quita un cargo al profesor
     * @exception No dispara excepciones
     * @param p_cargo de tipo Cargo, utilizado para remover dicho cargo del profesor
     * @return Retorna un boolean
     */
    public boolean quitarCargo(Cargo p_cargo) {
        return this.getCargos().remove(p_cargo);
    }

    /** Imprime por pantalla los datos del profesor
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("Título: " + this.getTitulo());
        System.out.println("\n" + "-****** Cargos Asignados ******-");
        for(Cargo cargos: this.getCargos()) {
            cargos.mostrarCargo();
            System.out.println("\n");
        }
        System.out.println("** Sueldo Total: " + this.sueldoTotal() + " **");
    }

    /** Calcula el sueldo total de profesor
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double sueldoTotal() {
        double total = 0;
        for(Cargo cargos: this.getCargos()) {
            total = total + cargos.sueldoDelCargo();
        }
        return total;
    }

    /** Imprime por pantalla en una linea el dni, nombre y el sueldo total del profesor
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String mostrarLinea() {
        return ("DNI: " + this.getDni() + " - Nombre: " + this.nomYApe() + " - Sueldo Total: " + this.sueldoTotal());
    }
    


}
