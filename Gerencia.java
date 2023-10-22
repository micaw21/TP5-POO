package TP5;

/** Permite crear y manipular objetos de tipo Gerencia
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */

import java.util.ArrayList;

public class Gerencia {
    //Atributos
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Gerencia
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     */
    public Gerencia(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<Alojamiento>());
    }

    /** Permite instanciar objetos de tipo Gerencia
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_alojamientosAlquilados de tipo ArrayList<Alojamiento>, utilizado para asignar el estado de alojamientos alquilados
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientosAlquilados) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientosAlquilados);
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientosAlquilados) {
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }

    /** Permite obtener el nombre
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Permite obener la lista de alojamientos alquilados
     * @param No utiliza parámetros
     * @return Retorna un ArrayList<Alojamiento>
     * @exception No dispara excepciones
     */
    public ArrayList<Alojamiento> getAlojamientosAlquilados() {
        return this.alojamientosAlquilados;
    }

    //Métodos
    /** Permite ingresar un alojamiento a la lista
     * @exception No dispara excepciones
     * @param p_alojamiento de tipo Alojamiento, utilizado para guardarlo en la lista
     * @return Retorna un boolean
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }

    /** Permite remover un alojamiento de la lista
     * @exception No dispara excepciones
     * @param p_alojamiento de tipo Alojamiento, utilizado para removerlo en la lista
     * @return Retorna un boolean
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }

    /** Cuenta la cantidad de alojamientos alquilados
     * @exception No dispara excepciones
     * @param tipoALojamiento de tipo String, utilizado para especificar que tipo de alojamiento contar
     * @return Retorna un int
     */
    public int contarAlojamiento(String tipoALojamiento) {
        int contar = 0;
        for(Alojamiento alojamiento: this.getAlojamientosAlquilados()) {
            contar += alojamiento.contar(tipoALojamiento);
        }
        return contar;
    }

    /** Muestra la liquidacion por pantalla
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void mostrarLiquidacion() {
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidación ---------------------------------------");
        this.liquidar();
        System.out.println("\n" + "Alojamientos tipo Cabaña ----> " + this.contarAlojamiento("Cabaña"));
        System.out.println("\n" + "Alojamientos tipo Hotel -----> " + this.contarAlojamiento("Hotel"));
    }

    /** Imprime los datos de la liquidación de alojamientos alquilados
     * @param No utiliza parámetros
     * @return No retorna ningún valor
     * @exception No dispara excepciones
     */
    public void liquidar() {
        for(Alojamiento alojameintos: this.getAlojamientosAlquilados()) {
            alojameintos.liquidar();
        }
    }
}
