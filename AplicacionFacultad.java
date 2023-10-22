package TP5;
/** Clase Ejecutable
 *  @author Wolkowyski, Micaela
 *  @version 04/10/2023 
 */

import java.util.*;

public class AplicacionFacultad {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        Facultad unaFacultad = null;
        boolean flag = false;
        Profesor unProfesor = null;
        
        int op, respuesta, otroProf;
        int otroCarg = 0;
        do {
            System.out.println("\n" + "----- Menú Facultad -----");
            System.out.println("1 - Contratar profesor");
            System.out.println("2 - Despedir profesor");
            System.out.println("3 - Mostrar nómina de profesores");
            System.out.println("4 - Mostrar total a pagar");
            System.out.println("5 - Listar los cargos de profesores");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();
            switch(respuesta) {
                case 1:
                    do {
                        System.out.print("Ingrese su DNI: ");
                        int dni = teclado.nextInt();
                        
                        if(unaFacultad != null) {
                            for(Profesor profes: unaFacultad.getProfesores()) {
                                if(dni == profes.getDni()) {
                                    flag = true;
                                    break;
                                } 
                            }
                        }

                        if(flag == true) {
                            System.out.println("Profesor ya contratado!");
                        } else {
                            System.out.print("Ingrese su nombre: ");
                            String nombre = teclado.next();
        
                            System.out.print("Ingrese su apellido: ");
                            String apellido = teclado.next();
        
                            System.out.print("Ingrese año de nacimiento: ");
                            int anio = teclado.nextInt();
                            Calendar fechaNac = new GregorianCalendar();
                            fechaNac.set(Calendar.YEAR, anio);
        
                            System.out.print("Ingrese su titulo: ");
                            String titulo = teclado.next();
                            
                            ArrayList<Cargo> cargos = new ArrayList<>();

                            do {
                                System.out.println("Ingrese su tipo de cargo: ");
                                System.out.print("1 - Simple / 2 - SemiExclusivo / 3 - Exclusivo: ");
                                op = teclado.nextInt();
                                if (op >= 1 && op <= 3) {
                                    if(op == 1) {
                                        System.out.print("Ingrese nombre del cargo: ");
                                        String nombreCarg = teclado.next();
        
                                        System.out.print("Ingrese sueldo basico: ");
                                        double sueldo = teclado.nextDouble();
        
                                        System.out.print("Ingrese año de ingreso: ");
                                        int anioIng = teclado.nextInt();
        
                                        Cargo cargoSimple = new Cargo(nombreCarg, sueldo, anioIng);
                                        cargos.add(cargoSimple);
                                    } else if (op == 2){
                                        System.out.print("Ingrese nombre del cargo: ");
                                        String nombreCarg = teclado.next();
                                        
                                        System.out.print("Ingrese sueldo basico: ");
                                        double sueldo = teclado.nextDouble();
        
                                        System.out.print("Ingrese año de ingreso: ");
                                        int anioIng = teclado.nextInt();
    
                                        int horasInvest = 0;
                                        int horasDoc = 0;
                                        do {
                                            System.out.print("Ingrese las horas de docencia (minimo 10): ");
                                            horasDoc = teclado.nextInt();
            
                                            if (horasDoc >= 10 && horasDoc < 20) {
                                                System.out.print("Ingrese las horas de investigacion: ");
                                                horasInvest = teclado.nextInt();
    
                                                if (horasDoc + horasInvest > 20) {
                                                    System.out.println("No pueden ser mas de 20 horas en total!");
                                                }
                                            }
                                        } while (horasDoc + horasInvest > 20);
    
                                        SemiExclusivo cargoSemi = new SemiExclusivo(nombreCarg, sueldo, anioIng, horasDoc, horasInvest);
                                        cargos.add(cargoSemi);
                                    } else {
                                        System.out.print("Ingrese nombre del cargo: ");
                                        String nombreCarg = teclado.next();
                                        
                                        System.out.print("Ingrese sueldo basico: ");
                                        double sueldo = teclado.nextDouble();
        
                                        System.out.print("Ingrese año de ingreso: ");
                                        int anioIng = teclado.nextInt();
        
                                        System.out.print("Ingrese las horas de docencia: ");
                                        int horasDoc = teclado.nextInt();
        
                                        System.out.print("Ingrese las horas de investigación: ");
                                        int horasInvest = teclado.nextInt();
        
                                        System.out.print("Ingrese las horas de extensión: ");
                                        int horasExt = teclado.nextInt();
        
                                        Exclusivo cargoExcl = new Exclusivo(nombreCarg, sueldo, anioIng, horasDoc, horasInvest, horasExt);
                                        cargos.add(cargoExcl);

                                    }
                                } else {
                                    System.out.println("Valor Erroneo!");
                                    break;
                                }
                                
                                if (unaFacultad == null) {
                                    unProfesor = new Profesor(dni, nombre, apellido, anio, titulo, cargos);
                                    System.out.print("Ingrese el nombre de la facultad: ");
                                    String nombreFac = teclado.next();
                                    unaFacultad = new Facultad(nombreFac, unProfesor);
                                } else {
                                    Profesor otroProfesor = new Profesor(dni, nombre, apellido, anio, titulo, cargos);
                                    unaFacultad.agregarProfesor(otroProfesor);
                                }

                                System.out.print("¿Desea ingresar otro cargo? 1-si 2-no: ");
                                otroCarg = teclado.nextInt();

                            } while(cargos.size() < 4 && otroCarg == 1);

                        }
                            
                        System.out.print("Desea contratar otro? 1-Si 2-No: ");
                        otroProf = teclado.nextInt();
                    } while (otroProf == 1);
                break;
                case 2:
                    if(unaFacultad == null || unaFacultad.getProfesores().isEmpty() == true) {
                        System.out.println("No hay profesores contratados!");
                    } else if (unaFacultad.getProfesores().size() > 1) {
                        do {
                            System.out.println("Ingrese DNI de profesor a despedir: ");
                            for(Profesor profesores: unaFacultad.getProfesores()) {
                                System.out.println(profesores.mostrarLinea());
                            }
    
                            int dniDespido = teclado.nextInt();
                            int i;
                            for(i = 0; i < unaFacultad.getProfesores().size(); i++) {
                                if(unaFacultad.getProfesores().get(i).getDni() == dniDespido) {
                                    if (unaFacultad.quitarProfesor(unaFacultad.getProfesores().get(i)) ) {
                                        System.out.println("Profesor despedido!");
                                    } else {
                                        System.out.println("No existe el DNI!");
                                    }
                                } 
                            }
                            System.out.print("Desea despedir otro profesor? (1-Si/2-No): ");
                            op = teclado.nextInt();
                        } while (op == 1 && unaFacultad.getProfesores().size() > 1);
                    } else {
                        System.out.println("No se pueden despedir más profesores!");
                    }
                break;
                case 3:
                    if(unaFacultad == null || unaFacultad.getProfesores().isEmpty()) {
                        System.out.println("No hay ningún profesor en la facultad!");
                    } else {
                        unaFacultad.nominaProfesores();
                    }
                break;
                case 4:
                    if(unaFacultad == null || unaFacultad.getProfesores().isEmpty()) {
                        System.out.println("No hay ningún profesor en la facultad!");
                    } else {
                        System.out.println("Total a pagar: " + unaFacultad.totalAPagar());
                    }
                break;
                case 5:
                    if(unaFacultad == null || unaFacultad.getProfesores().isEmpty()) {
                        System.out.println("No hay ningún profesor en la facultad!");
                    } else {
                        unaFacultad.listarProfesorCargos();
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
