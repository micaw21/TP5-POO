package TP5;

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 29/09/2023
 */

public class CrearCirculo {
    public static void main(String [] args) {
        Punto unPunto = new Punto(5.0, 3.0);
        Punto otroPunto = new Punto(2.0, 4.0);
        Elipse unaElipse = new Elipse(20.44, 46.86, unPunto);
        Circulo unCirculo = new Circulo(10, otroPunto);
        unaElipse.caracteristicas();
        unCirculo.caracteristicas();
    }
}