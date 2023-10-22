package TP5;

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */

import java.util.*;

public class Comercio {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        int respuesta, compresor, automatico;
        Heladera unaHeladera;
        Cocina unaCocina;
        Lavarropas unLavarropas;

        do {
            System.out.println("\n" + "----- Menú Artefactos para Hogar -----");
            System.out.println("1 - Comprar Heladera");
            System.out.println("2 - Comprar Cocina");
            System.out.println("3 - Comprar Lavarropas");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();

            switch(respuesta) {
                case 1:
                    System.out.print("Ingrese marca: ");
                    String marca = teclado.next();
                    System.out.print("Ingrese precio: ");
                    float precio = teclado.nextFloat();
                    System.out.print("Ingrese stock: ");
                    int stock = teclado.nextInt();
                    System.out.print("Ingrese pies:");
                    int pies = teclado.nextInt();
                    System.out.print("Ingrese cantidad de puertas: ");
                    int puertas = teclado.nextInt();
                    do {
                        System.out.print("¿Posee compresor? 1-Si 2-No: ");
                        compresor = teclado.nextInt();
                        if (compresor == 1){
                            unaHeladera = new Heladera(marca, precio, stock, pies, puertas, true);
                        } else {
                            unaHeladera = new Heladera(marca, precio, stock, pies, puertas, false);
                        }
                    } while (compresor < 1 && compresor > 2);
                    System.out.print("Cuotas a pagar: ");
                    int cuotas = teclado.nextInt();
                    System.out.print("Interes a pagar: ");
                    float interes = teclado.nextFloat();
                    unaHeladera.imprimir();
                    System.out.println("Cuotas: " + cuotas + " - Interés: " + interes + " %");
                    System.out.println("Valor Cuota: " + unaHeladera.cuotaCredito(cuotas, interes));
                    System.out.println("Valor Cuota con Adicionales: " + unaHeladera.creditoConAdicional(cuotas, interes));
                break;
                case 2:
                    System.out.print("Ingrese marca: ");
                    marca = teclado.next();
                    System.out.print("Ingrese precio: ");
                    precio = teclado.nextFloat();
                    System.out.print("Ingrese stock: ");
                    stock = teclado.nextInt();
                    System.out.print("Ingrese la cantidad de hornallas: ");
                    int hornallas = teclado.nextInt();
                    System.out.print("Ingrese cantidad de calorias: ");
                    int calorias = teclado.nextInt();
                    System.out.print("Ingrese las dimensiones: ");
                    String dimensiones = teclado.next();
                    unaCocina = new Cocina(marca, precio, stock, hornallas, calorias, dimensiones);

                    System.out.print("Cuotas a pagar: ");
                    cuotas = teclado.nextInt();
                    System.out.print("Interes a pagar: ");
                    interes = teclado.nextFloat();
                    unaCocina.imprimir();
                    System.out.println("Cuotas: " + cuotas + " - Interés: " + interes + " %");
                    System.out.println("Valor Cuota: " + unaCocina.cuotaCredito(cuotas, interes));
                    System.out.println("Valor Cuota con Adicionales: " + unaCocina.creditoConAdicional(cuotas, interes));
                break;
                case 3:
                    System.out.print("Ingrese marca: ");
                    marca = teclado.next();
                    System.out.print("Ingrese precio: ");
                    precio = teclado.nextFloat();
                    System.out.print("Ingrese stock: ");
                    stock = teclado.nextInt();
                    System.out.print("Ingrese la cantidad de programas: ");
                    int programas = teclado.nextInt();
                    System.out.print("Ingrese kilos: ");
                    float kilos = teclado.nextInt();
                    do {
                        System.out.print("¿Es automático? 1-Si 2-No: ");
                        automatico = teclado.nextInt();
                        if (automatico == 1){
                            unLavarropas = new Lavarropas(marca, precio, stock, programas, kilos, true);
                        } else {
                            unLavarropas = new Lavarropas(marca, precio, stock, programas, kilos, false);
                        }
                    } while (automatico < 1 && automatico > 2);

                    System.out.print("Cuotas a pagar: ");
                    cuotas = teclado.nextInt();
                    System.out.print("Interes a pagar: ");
                    interes = teclado.nextFloat();
                    unLavarropas.imprimir();
                    System.out.println("Cuotas: " + cuotas + " - Interés: " + interes + " %");
                    System.out.println("Valor Cuota: " + unLavarropas.cuotaCredito(cuotas, interes));
                    System.out.println("Valor Cuota con Adicionales: " + unLavarropas.creditoConAdicional(cuotas, interes));
                break;
                case 0:
                    System.out.println("Menú cerrado!");
                break;
                default:
                    System.out.println("Valor erróneo!");
                break;
            }
        } while (respuesta != 0 && (respuesta >= 1 && respuesta <= 3));
        teclado.close();
    }
}
