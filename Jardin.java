package TP5;

import java.util.*;

/** Permite crear y manipular objetos de tipo Jardin
 * @author Wolkowyski, Micaela
 * @version 06/10/2023
 */

public class Jardin {
    //Atributos
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;

    //Métodos Constructores
    /** Permite instanciar objetos de tipo Jardin
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     * @param p_figuras de tipo ArrayList<FiguraGeometrica>, utilizada para asignar el estado de figuras
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras) {
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }

    /** Permite instanciar objetos de tipo Jardin
     * @param p_nombre de tipo String, utilizado para asignar el estado de nombre
     */
    public Jardin(String p_nombre) {
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }

    //Setters y Getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras) {
        this.figuras = p_figuras;
    }

    /** Permite obtener el nombre
     * @param No utiliza parámetros
     * @return Retorna un String
     * @exception No dispara excepciones
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Permite obtener las figuras
     * @param No utiliza parámetros
     * @return retorna un ArrayList<FiguraGeometrica>
     * @exception No dispara excepciones
     */
    public ArrayList<FiguraGeometrica> getFiguras() {
        return this.figuras;
    }

    //Métodos
    /** Permite agregar figuras a la lista
     * @exception No dispara excepciones
     * @param p_figura de tipo FiguraGeometrica, utilizada para agregarla a la lista
     * @return Retorna un boolean
     */
    public boolean ingresarFigura(FiguraGeometrica p_figura) {
        return  this.getFiguras().add(p_figura);
    }

    /** Permite remover una figura de la lista
     * @exception No dispara excepciones
     * @param p_figura de tipo FiguraGeometrica, utilizada para removerla de la lista
     * @return Retorna un boolean
     */
    public boolean removerFigura(FiguraGeometrica p_figura) {
        return this.getFiguras().remove(p_figura);
    }
    /** Calcula cuantos litros de pintura se necesitan
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    private double cuantosLitros() {
        return ((this.cuantosMetros() * 4) / 20); 
    }

    /** Calcula cuantas latas de pintura se necesitan
     * @param No utiliza parámetros
     * @return Retorna un int
     * @exception No dispara excepciones
     */
    public int cuantasLatas() {
        return (int) Math.round(this.cuantosLitros() / 4);
    }

    /** Calcula cuantos metros de superficie se deben pintar
     * @param No utiliza parámetros
     * @return Retorna un double
     * @exception No dispara excepciones
     */
    public double cuantosMetros() {
        double totalMetros = 0;

        for(FiguraGeometrica figuras: this.getFiguras()) {
            totalMetros = totalMetros + figuras.superficie();
        }

        return totalMetros;
    }

    /** Imprime por pantalla el detalle de cada figura geométrica
     * @param No utiliza parámetros
     * @exception No dispara excepciones
     * @return No retorna ningún valor
     */
    public void detalleFiguras() {
        System.out.println("Presupuesto: " + this.getNombre());
        for(FiguraGeometrica figuritas: this.getFiguras()) {
            figuritas.mostrarSuperficie();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total a cubrir: " + this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
    }

}
