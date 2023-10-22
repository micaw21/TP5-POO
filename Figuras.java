package TP5;

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 28/09/2023
 */

public class Figuras {
    public static void main(String [] args) {
        Punto unPunto = new Punto(10,12.5);
        Punto otroPunto = new Punto(5, 3);
        Rectangulo unRectangulo = new Rectangulo(unPunto, 10, 12);
        Cuadrado unCuadrado = new Cuadrado(otroPunto, 72.99);

        unRectangulo.caracteristicas();

        unCuadrado.caracteristicas();
    }
}
