package TP5;

/** Clase Ejecutable
 * @author Wolkowyski, Micaela
 * @version 14/10/2023
 */

import java.util.*;

public class VentaDeEntradas {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        int respuesta, tipo, op, otro;

        System.out.print("Ingrese el nombre del zoologico: ");
        String nombreZoo = teclado.next();
        Zoologico unZoo = new Zoologico(nombreZoo);
        ArrayList<Individuo> integrantesDel = new ArrayList<Individuo>();

        do {
            System.out.println("\n" + "----- Venta de Entradas ZOO " + unZoo.getNombre() + " -----");
            System.out.println("1 - Agregar visitante");
            System.out.println("2 - Listar visitantes por fecha");
            System.out.println("3 - Listar por fecha");
            System.out.println("4 - Mostrar total recaudado");
            System.out.println("0 - Salir");
            respuesta = teclado.nextInt();

            switch(respuesta) {
                case 1:
                    do {
                        do {
                            System.out.println("Elija visitante");
                            System.out.print("1 - Individuo / 2 - Delegación: ");
                            tipo = teclado.nextInt();
                        } while (tipo != 1 && tipo != 2);
    
                        if(tipo == 1) {
                            System.out.println("--- Ingrese datos del Individuo ---");
                            System.out.print("Ingrese su nombre: ");
                            String nombreInd = teclado.next();
                            System.out.print("Ingrese su apellido: ");
                            String apellidoInd = teclado.next();
                            System.out.print("Ingrese su DNI: ");
                            int nroDniInd = teclado.nextInt();
                            System.out.print("Ingrese año de nacimiento: ");
                            int añoNac = teclado.nextInt();
    
                            Persona unaPersona = new Persona(nroDniInd, nombreInd, apellidoInd, añoNac);
    
                            System.out.print("Ingrese el día de visita: ");
                            int diaInd = teclado.nextInt();
                            System.out.print("Ingrese el mes de visita en números: ");
                            int mesInd = teclado.nextInt();
                            System.out.print("Ingrese el año de visita: ");
                            int añoInd = teclado.nextInt();
    
                            Calendar fechaVisita = new GregorianCalendar();
                            fechaVisita.set(añoInd, mesInd, diaInd);
                            Individuo unIndividuo = new Individuo(nombreInd, fechaVisita, unaPersona);
                            unZoo.nuevoVisitante(unIndividuo);
    
                            System.out.println("Visitante Individuo agregado!");
                        } else {
                            System.out.println("--- Ingrese datos de la Delegación ---");
                            System.out.print("Ingrese nombre de la delegación: ");
                            String nomDel = teclado.next();
    
                            System.out.print("Ingrese el día de visita: ");
                            int diaDel = teclado.nextInt();
                            System.out.print("Ingrese el mes de visita en números: ");
                            int mesDel = teclado.nextInt();
                            System.out.print("Ingrese el año de visita: ");
                            int añoDel = teclado.nextInt();
                            
                            Calendar fechaVisitDel = new GregorianCalendar();
                            fechaVisitDel.set(añoDel, mesDel, diaDel);
                            
                            do {
                                System.out.println("--- Ingrese datos de Integrante ---");
                                System.out.print("Ingrese su nombre: ");
                                String nombreInt = teclado.next();
                                System.out.print("Ingrese su apellido: ");
                                String apellidoInt = teclado.next();
                                System.out.print("Ingrese su DNI: ");
                                int nroDniInt = teclado.nextInt();
                                System.out.print("Ingrese año de nacimiento: ");
                                int añoNac = teclado.nextInt();
    
                                Persona otraPersona = new Persona(nroDniInt, nombreInt, apellidoInt, añoNac);
    
                                Individuo otroIndividuo = new Individuo(nombreInt, fechaVisitDel, otraPersona);
                                integrantesDel.add(otroIndividuo);
                            
                                System.out.print("¿Desea ingresar otro integrante? 1-Si 2-No: ");
                                op = teclado.nextInt();
    
                            } while (op == 1);
    
                            Delegacion unaDelegacion = new Delegacion(nomDel, fechaVisitDel, integrantesDel);
                            unZoo.nuevoVisitante(unaDelegacion);
                            System.out.println("Visitante Delegación agregado!");
                        }
                        System.out.print("¿Desea agregar otro visitante? 1-Si 2-No");
                        otro = teclado.nextInt();
                    } while (otro == 1);
                break;
                case 2:
                    if(unZoo.getVisitantes().isEmpty()) {
                        System.out.println("No hay visitantes!");
                    } else {
                        int tipoVis;
    
                        do {
                            System.out.print("Elija tipo de visitante a filtrar: 1 - Individuo / 2 - Delegación: ");
                            tipoVis = teclado.nextInt();
                        } while (tipoVis != 1 && tipoVis != 2);
                        if (tipoVis == 1) {
                            System.out.print("Ingrese el día de visita: ");
                            int diaVis = teclado.nextInt();
                            System.out.print("Ingrese el mes de visita en números: ");
                            int mesVis = teclado.nextInt();
                            System.out.print("Ingrese el año de visita: ");
                            int añoVis = teclado.nextInt();
                            
                            Calendar fechaVisit = new GregorianCalendar();
                            fechaVisit.set(añoVis, mesVis, diaVis);
                            unZoo.listaTipoVisitantePorFecha(fechaVisit, "Individuo");
                        } else {
                            System.out.print("Ingrese el día de visita: ");
                            int diaVis = teclado.nextInt();
                            System.out.print("Ingrese el mes de visita en números: ");
                            int mesVis = teclado.nextInt();
                            System.out.print("Ingrese el año de visita: ");
                            int añoVis = teclado.nextInt();
                            
                            Calendar fechaVisit = new GregorianCalendar();
                            fechaVisit.set(añoVis, mesVis, diaVis);
                            unZoo.listaTipoVisitantePorFecha(fechaVisit, "Delegacion");
                        }
                    }
                break;
                case 3:
                    if(unZoo.getVisitantes().isEmpty()) {
                        System.out.println("No hay visitantes!");
                    } else {
                        System.out.print("Ingrese el día de visita: ");
                        int diaVis = teclado.nextInt();
                        System.out.print("Ingrese el mes de visita en números: ");
                        int mesVis = teclado.nextInt();
                        System.out.print("Ingrese el año de visita: ");
                        int añoVis = teclado.nextInt();
                        
                        Calendar fechaVisit = new GregorianCalendar();
                        fechaVisit.set(añoVis, mesVis, diaVis);
    
                        unZoo.listaVisitantePorFecha(fechaVisit);
                    }
                break;
                case 4:
                    System.out.println("--- Ingrese desde qué fecha calcular recaudación ---");
                    System.out.print("Ingrese el día de visita: ");
                    int diaDesde = teclado.nextInt();
                    System.out.print("Ingrese el mes de visita en números: ");
                    int mesDesde = teclado.nextInt();
                    System.out.print("Ingrese el año de visita: ");
                    int añoDesde = teclado.nextInt();
                    
                    Calendar fechaDesde = new GregorianCalendar();
                    fechaDesde.set(añoDesde, mesDesde, diaDesde);
                    
                    System.out.println("--- Ingrese hasta qué fecha calcular recaudación ---");
                    System.out.print("Ingrese el día de visita: ");
                    int diaHasta = teclado.nextInt();
                    System.out.print("Ingrese el mes de visita en números: ");
                    int mesHasta = teclado.nextInt();
                    System.out.print("Ingrese el año de visita: ");
                    int añoHasta = teclado.nextInt();
                    
                    Calendar fechaHasta = new GregorianCalendar();
                    fechaHasta.set(añoHasta, mesHasta, diaHasta);

                    System.out.println("Recaudación desde " + fechaDesde.get(Calendar.DATE) + "/" + (fechaDesde.get(Calendar.MONTH) + 1) + "/" + fechaDesde.get(Calendar.YEAR) + " hasta " + 
                    fechaHasta.get(Calendar.DATE) + "/" + (fechaHasta.get(Calendar.MONTH) + 1) + "/" + fechaHasta.get(Calendar.YEAR) + " es: $" + unZoo.recaudacion(fechaDesde, fechaHasta));
                break;
                case 0:
                    System.out.println("Menú cerrado!");
                break;
                default:
                    System.out.println("Valor erróneo!");
                break;
            }
        } while (respuesta != 0 && (respuesta >= 1 && respuesta <= 4));
        teclado.close();
    }
}
