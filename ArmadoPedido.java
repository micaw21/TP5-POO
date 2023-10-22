package TP5;

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 18/10/2023
 */

public class ArmadoPedido {
    public static void main(String [] args) {
        Premium unPremium = new Premium(200, 10);
        Comun unComun = new Comun(100);
        Premium otroPremium = new Premium(200, 7);
        Renglon renglon1 = new Renglon(7, 100, unPremium);
        Renglon renglon2 = new Renglon(57, 100, unComun);
        Renglon renglon3 = new Renglon(94, 100, otroPremium);
        Pedido unPedido = new Pedido(renglon1);
        unPedido.agregarRenglon(renglon2);
        unPedido.agregarRenglon(renglon3);
        unPedido.mostrar();
    }
}
