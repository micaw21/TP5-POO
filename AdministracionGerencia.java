package TP5;

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 12/10/2023
 */

import java.util.*;

public class AdministracionGerencia {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int respuesta, op, servicios, op3;
        int op2 = 0;
        double precioInternet = 5.00;
        double precioAuto = 100;
        double precioLavanderia = 20;
        
        String tipoHab;
    
        System.out.print("Ingrese el nombre de la Gerencia: ");
        String nombre = teclado.next();
        Gerencia unaGerencia = new Gerencia(nombre);
    
        do {
            System.out.println("\n" + "----- Gerencia " + unaGerencia.getNombre() + " -----");
            System.out.println("1 - Alquilar alojamiento");
            System.out.println("2 - Quitar alojamiento");
            System.out.println("3 - Cantidad de alojamientos");
            System.out.println("4 - Mostrar liquidacion");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();
    
            switch(respuesta) {
                case 1:
                    do {
                        System.out.println("1 - Alquilar hotel");
                        System.out.println("2 - Alquilar cabaña");
                        op = teclado.nextInt();
                        if (op == 1) {
                            System.out.print("Ingrese nombre del Hotel: ");
                            String nomHotel = teclado.next();
                            System.out.print("Ingrese precio base: ");
                            double precioBas = teclado.nextDouble();
                            System.out.print("Ingrese cantidad de dias a alquilar: ");
                            int diasAlquiler = teclado.nextInt();
    
                            do {
                                System.out.print("Ingrese el tipo de habitacion (Single o Double): ");
                                tipoHab = teclado.next();
                            } while (!(tipoHab.equalsIgnoreCase("Single")) && !(tipoHab.equalsIgnoreCase("Double")));
                            
                            Hotel unHotel = new Hotel(nomHotel, precioBas, diasAlquiler, tipoHab);
    
                            int internet = 0;
                            int alquilerAuto = 0;
                            int lavanderia = 0;
    
                            do {
                                System.out.print("Desea agregar servicios? 1-Si 2-No: ");
                                servicios = teclado.nextInt();
    
                                if(servicios == 1) {
                                    System.out.println("1 - Internet");
                                    System.out.println("2 - Alquiler auto");
                                    System.out.println("3 - Lavanderia");
                                    System.out.println("0 - Salir");
                                    op2 = teclado.nextInt();
                                } 
    
                                switch(op2) {
                                    case 1:
                                        if(internet == 0) {
                                            Servicio servInternet = new Servicio("Internet", precioInternet);
                                            unHotel.agregarServicio(servInternet);
                                            System.out.print("Servicio agregado!");
                                            internet = 1;
                                        } else {
                                            System.out.println("Servicio ya contratado!");
                                        }
                                    break;
                                    case 2:
                                        if(alquilerAuto == 0) {
                                            Servicio servAuto = new Servicio("Alquier Auto", precioAuto);
                                            unHotel.agregarServicio(servAuto);
                                            System.out.print("Servicio agregado!");
                                            alquilerAuto = 1;
                                        } else {
                                            System.out.println("Servicio ya contratado!");
                                        }
                                    break;
                                    case 3:
                                        if(lavanderia == 0) {
                                            Servicio servLanderia = new Servicio("Lavanderia", precioLavanderia);
                                            unHotel.agregarServicio(servLanderia);
                                            System.out.print("Servicio agregado!");
                                            lavanderia = 1;
                                        } else {
                                            System.out.println("Servicio ya contratado!");
                                        }
                                    break;
                                    case 0:
                                        System.out.print("Menu de servicios cerrado!");
                                    break;
                                    default:
                                        System.out.print("Valor erroneo!");
                                    break;
                                } 
    
                                unaGerencia.agregarAlojamiento(unHotel);
    
                            } while (op2 != 0 && (op2 >= 1 && op2 <= 3));
    
                            internet = 0;
                            alquilerAuto = 0;
                            lavanderia = 0;
    
                        } else {
                            System.out.print("Ingrese nombre de la cabaña: ");
                            String nombreCab = teclado.next();
                            System.out.print("Ingrese precio base: ");
                            double precioB = teclado.nextDouble();
                            System.out.print("Ingrese la cantidad de dias a alquilar: ");
                            int diasAlq = teclado.nextInt();
                            System.out.print("Ingrese cantidad de habitaciones: ");
                            int cantHab = teclado.nextInt();
                            Cabaña unaCabaña = new Cabaña(nombreCab, precioB, diasAlq, cantHab);
    
                            do {
                                System.out.print("Desea agregar servicios? 1-Si 2-No: ");
                                servicios = teclado.nextInt();
                                int internet = 0;
                                int alquilerAuto = 0;
                                int lavanderia = 0;
                                if(servicios == 1) {
                                    System.out.println("1 - Internet");
                                    System.out.println("2 - Alquiler auto");
                                    System.out.println("3 - Lavanderia");
                                    System.out.println("0 - Salir");
                                    op2 = teclado.nextInt();
                                } 
    
                                switch(op2) {
                                    case 1:
                                        if(internet == 0) {
                                            Servicio servInternet = new Servicio("Internet", precioInternet);
                                            unaCabaña.agregarServicio(servInternet);
                                            System.out.print("Servicio agregado!");
                                            internet = 1;
                                        } else {
                                            System.out.println("Servicio ya contratado!");
                                        }
                                    break;
                                    case 2:
                                        if(alquilerAuto == 0) {
                                            Servicio servAuto = new Servicio("Alquier Auto", precioAuto);
                                            unaCabaña.agregarServicio(servAuto);
                                            System.out.print("Servicio agregado!");
                                            alquilerAuto = 1;
                                        } else {
                                            System.out.println("Servicio ya contratado!");
                                        }
                                    break;
                                    case 3:
                                        if(lavanderia == 0) {
                                            Servicio servLanderia = new Servicio("Lavanderia", precioLavanderia);
                                            unaCabaña.agregarServicio(servLanderia);
                                            System.out.print("Servicio agregado!");
                                            lavanderia = 1;
                                        } else {
                                            System.out.println("Servicio ya contratado!");
                                        }
                                    break;
                                    case 0:
                                        System.out.print("Menu de servicios cerrado!");
                                    break;
                                    default:
                                        System.out.print("Valor erroneo!");
                                    break;
                                } 
                            } while (op2 != 0 && (op2 >= 1 && op2 <= 3));
    
                            unaGerencia.agregarAlojamiento(unaCabaña);
                        }
                    } while (op < 1 && op > 2);
                break;
                case 2: 
                    if(unaGerencia.getAlojamientosAlquilados().isEmpty()) {
                        System.out.println("No hay alojamientos alquilados!");
                    } else {
                        int i;
                        System.out.println("Elija alojamiento a eliminar: ");
                        for(i = 0; i < unaGerencia.getAlojamientosAlquilados().size(); i++) {
                            System.out.println("Alojamiento nro: " + (i + 1) + " " + unaGerencia.getAlojamientosAlquilados().get(i).getNombre());
                        }
                        int alojElim = teclado.nextInt();
                        unaGerencia.quitarAlojamiento(unaGerencia.getAlojamientosAlquilados().get(alojElim - 1));
                    }
                break;
                case 3:
                    do {
                        System.out.print("Desea ver cantidad de Hoteles o Cabañas? (1 - Hoteles / 2 - Cabañas): ");
                        op3 = teclado.nextInt();
                    } while (op3 != 1 && op3 != 2);

                    if(op3 == 1) {
                        System.out.println("\n" + "Alojamientos tipo Hotel -----> " + unaGerencia.contarAlojamiento("Hotel"));
                    } else {
                        System.out.println("\n" + "Alojamientos tipo Cabaña ----> " + unaGerencia.contarAlojamiento("Cabaña"));
                    }
                break;
                case 4:
                    unaGerencia.mostrarLiquidacion();
                break;
                case 0:
                    System.out.println("Menu cerrado!");
                break;
                default:
                    System.out.println("Valor erroneo!");
                break;
            }
    
    
        } while (respuesta != 0 && (respuesta >= 1 && respuesta <= 4));
        teclado.close();
    }
}
