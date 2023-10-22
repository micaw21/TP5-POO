package TP5;

/** Permite crear y manipular objetos de tipo Pedido
 * @author Wolkowyski, Micaaela
 * @version 14/10/2023
 */

import java.util.ArrayList;

public class Pedido {
    //Atributo
    private ArrayList<Renglon> renglones;
    
    //Metodo Constructor
    /** Permite instanciar objetos de tipo Pedido
     * @param p_renglon de tipo Renglon, utilizado para asignar el estado de renglones
     */
    public Pedido(Renglon p_renglon){
        this.setRenglon(new ArrayList<Renglon>());
        this.agregarRenglon(p_renglon);
    }

    /** Permite instanciar objetos de tipo Pedido
     * @param p_renglones de tipo ArrayList<Renglon>, utilizado para asignar el estado de renglones
     */
    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglon(p_renglones);
    }

    //Setters y Getters
    private void setRenglon(ArrayList<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    /** Permite obtener los renglones
     * @param No utiliza parametros
     * @return Retorna un ArrayList<Renglon>
     * @exception No dispara excepciones
     */
    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    //Metodo
    /** Permite agregar renglones a la lista
     * @exception No dispara excepciones
     * @param p_renglon de tipo Renglon, utilizado para agregarlo a la lista
     * @return Retorna un boolean
     */
    public boolean agregarRenglon(Renglon p_renglon)  {
        return this.getRenglones().add(p_renglon);
    }

    /** Permite remover renglones de la lista
     * @exception No dispara excepciones
     * @param p_renglon de tipo Renglon, utilizado para removerlo de la lista
     * @return Retorna un boolean
     */
    public boolean removerRenglon(Renglon p_renglon) {
        return this.getRenglones().remove(p_renglon);
    }

    /** Muestra por pantalla los detalles de cada renglon en la lista
     * @param No utiliza parametros
     * @return No retorna ningun valor
     * @exception No dispara excepciones
     */
    public void mostrar() {
        int totalEtiq = 0;
        double totalImp = 0;
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());
        int i;

        for(Renglon renglones: this.getRenglones()) {
            totalEtiq += renglones.getCantidad();
            totalImp += renglones.getItem().precio(renglones.getCantidad());
        }

        for (i = 0; i < this.getRenglones().size(); i++) {
            System.out.print("Item " + (i + 1) + ": ");
            this.getRenglones().get(i).mostrar();
            System.out.println("Precio: $" + this.getRenglones().get(i).getItem().precio(this.getRenglones().get(i).getCantidad()));
        }
        System.out.println("--- Total pedido: " + totalEtiq + " Etiquetas por un importe total de: $" + totalImp);
    }
}
