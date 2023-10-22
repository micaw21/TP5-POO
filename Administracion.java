package TP5;

/** Clase Ejecutable
 *  @author Wolkowyski, Micaela
 *  @version 10/10/2023
 */

import java.util.*;

public class Administracion {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        //FiguraGeometrica figuras = null;
        System.out.print("Ingrese el nombre del Jardin: ");
        String nombre = teclado.next();
        Jardin unJardin = new Jardin(nombre);
        int op, respuesta, figura;

        do {
            System.out.println("\n" + "------ Menú Jardín " + unJardin.getNombre() + " -------");
            System.out.println("1 - Ingresar figuras");
            System.out.println("2 - Remover figuras");
            System.out.println("3 - Consultar cuantas latas se necesitan");
            System.out.println("4 - Consultar cuantos metros hay que pintar");
            System.out.println("5 - Mostrar detalle de figuras");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();

            switch(respuesta) {
                case 1:
                    do {
                        System.out.println("Elija figura a ingresar: ");
                        System.out.println("1 - Circulo");
                        System.out.println("2 - Elipse");
                        System.out.println("3 - Cuadrado");
                        System.out.println("4 - Rectangulo");
                        System.out.println("5 - Triangulo");
                        figura = teclado.nextInt();
                        switch(figura) {
                            case 1:
                                System.out.print("Ingrese el radio: ");
                                double radio = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada x de su centro: ");
                                double cx = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada y de su centro: ");
                                double cy = teclado.nextDouble();
                                Punto centro = new Punto(cx, cy);
                                Circulo unCirculo = new Circulo(radio, centro);
                                unJardin.ingresarFigura(unCirculo);
                                System.out.println("Circulo agregado!");
                            break;
                            case 2:
                                System.out.print("Ingrese el eje mayor: ");
                                double ejeMayor = teclado.nextDouble();
                                System.out.print("Ingrese el eje menor: ");
                                double ejeMenor = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada x de su centro: ");
                                double cx2 = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada y de su centro: ");
                                double cy2 = teclado.nextDouble();
                                Punto otroCentro = new Punto(cx2, cy2);
                                Elipse unaElipse = new Elipse(ejeMayor, ejeMenor, otroCentro);
                                unJardin.ingresarFigura(unaElipse);
                                System.out.println("Elipse agregada!");
                            break;
                            case 3:
                                System.out.print("Ingrese lado del cuadrado: ");
                                double lado = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada x de su centro: ");
                                double cx3 = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada y de su centro: ");
                                double cy3 = teclado.nextDouble();
                                Punto unCentro = new Punto(cx3, cy3);
                                Cuadrado unCuadrado = new Cuadrado(unCentro, lado);
                                unJardin.ingresarFigura(unCuadrado);
                                System.out.println("Cuadrado agregado!");
                            break;
                            case 4:
                                System.out.print("Ingrese el ancho del rectangulo: ");
                                double ancho = teclado.nextDouble();
                                System.out.print("Ingrese el alto del rectangulo: ");
                                double alto = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada x de su centro: ");
                                double cx4 = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada y de su centro: ");
                                double cy4 = teclado.nextDouble();
                                Punto centro4 = new Punto(cx4, cy4);
                                Rectangulo unRectangulo = new Rectangulo(centro4, ancho, alto);
                                unJardin.ingresarFigura(unRectangulo);
                                System.out.println("Rectangulo agregado!");
                            break;
                            case 5:
                                System.out.print("Ingrese la base del triangulo: ");
                                double base = teclado.nextDouble();
                                System.out.print("Ingrese la altura del triangulo: ");
                                double altura = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada x de su centro: ");
                                double cx5 = teclado.nextDouble();
                                System.out.print("Ingrese la coordenada y de su centro: ");
                                double cy5 = teclado.nextDouble();
                                Punto centro5 = new Punto(cx5, cy5);
                                Triangulo unTriangulo = new Triangulo(centro5, base, altura);
                                unJardin.ingresarFigura(unTriangulo);
                                System.out.println("Triangulo agregado!");
                            break;
                            default:
                                System.out.println("Valor erroneo!");
                            break;
                        }

                        System.out.print("Desea ingresar otra figura? 1-Si 2-No: ");
                        op = teclado.nextInt();
                    } while (op == 1);
                break;
                case 2:
                    if(unJardin.getFiguras().isEmpty()) {
                        System.out.println("No hay figuras para remover!");
                    } else {
                        System.out.println("Elija figura a remover: ");
                        int i;
                        int figuBorrar = 0;
                        for(i = 0; i < unJardin.getFiguras().size(); i++) {
                            System.out.println("Figura nro:" + (i + 1) + " " + unJardin.getFiguras().get(i).nombreFigura() + " " + unJardin.getFiguras().get(i).superficie());
                        }

                        figuBorrar = teclado.nextInt();
                        if (unJardin.removerFigura(unJardin.getFiguras().get(figuBorrar - 1))) {
                            System.out.println("Figura removida!");
                        } else {
                            System.out.println("Figura NO removida!");
                        }
                    }
                break;
                case 3:
                    System.out.println("Se necesitan " + unJardin.cuantasLatas() + " latas"); 
                break;
                case 4:
                    System.out.println("Se deben pintar " + unJardin.cuantosMetros() + " metros");
                break;
                case 5:
                    if(unJardin.getFiguras().isEmpty()) {
                        System.out.println("No hay figuras para mostrar!");
                    } else {
                        unJardin.detalleFiguras();
                    }
                break;
                case 0:
                    System.out.println("Menu cerrado!");
                break;
                default:
                    System.out.println("Valor erroneo!");
                break;
            }

        } while (respuesta != 0 && (respuesta >= 1 && respuesta <= 5));
        
        teclado.close();
    }
}
