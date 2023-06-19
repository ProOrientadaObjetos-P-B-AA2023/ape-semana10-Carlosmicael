package paquete01;
import Paquete03.PrestamoAutomovil;
import paquete02.InstitucionEducativa;
import paquete02.Persona;
import paquete04.PrestamoEducativo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
        String autoTip;
        String marcaAuto;
        String nom;
        String ape;
        String user;
        double valorAuto;
        String ciudad;
        int temp;
        Scanner scanner=new Scanner(System.in);
        boolean registrarPrestamo = true;
        int opcion;
        List<PrestamoAutomovil> prestamosAutomovil = new ArrayList<>();
        List<PrestamoEducativo> prestamosEducativo = new ArrayList<>();
        do {
            System.out.println("╭──────────────────────────────────────────╮");
            System.out.println("│                BIENVENIDO                │");
            System.out.println("├──────────────────────────────────────────┤");
            System.out.println("│ 1. INGRESAR PRESTAMO PARA UN AUTOMOVIL   │");
            System.out.println("│ 2. INGRESAR UN PRESTAMO EDUCATIVO        │");
            System.out.println("│ 3. SALIR                                 │");
            System.out.println("│                                          │");
            System.out.println("╰──────────────────────────────────────────╯");
            System.out.println("SELECCIONE UNA OPCION:  ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    boolean registrarPrestamoAutomovil = true;
                    do {
                    System.out.println("Ingrese el tipo de automovil: ");
                    autoTip=scanner.nextLine();
                    System.out.println("Ingrese la marca del Automovil: ");
                    marcaAuto=scanner.nextLine();
                    System.out.println("Ingrese garante");
                    System.out.println("Nombre: ");
                    nom=scanner.nextLine();
                    System.out.println("Apellido: ");
                    ape=scanner.nextLine();
                    System.out.println("Ingrese UserName: ");
                    user=scanner.nextLine();
                    System.out.println("Ingrese la ciudad donde se Solicita el Prestamo: ");
                    ciudad=scanner.nextLine();
                    System.out.println("Ingrese el tiempo del Prestamo: ");
                    temp=scanner.nextInt();
                    System.out.println("Ingrese el valor del Auto: ");
                    valorAuto=scanner.nextDouble();
                    PrestamoAutomovil prestamoAutomovil1= new PrestamoAutomovil();
                    Persona garante1=new Persona();
                    prestamoAutomovil1.setTipoAutomovil(autoTip);
                    prestamoAutomovil1.setMarcaAutomovil(marcaAuto);
                    garante1.setNombre(nom);
                    garante1.setApellido(ape);
                    garante1.setUserName(user);
                    prestamoAutomovil1.setGarante1(garante1);
                    prestamoAutomovil1.setCiudadPrestamo(ciudad);
                    prestamoAutomovil1.setTiempoPrestamo(temp);
                    prestamoAutomovil1.setValorAutomovil(valorAuto);
                    prestamoAutomovil1.calcularValorMensualPago();
                        prestamosAutomovil.add(prestamoAutomovil1);
                        System.out.println("1. Registrar otro préstamo de automóvil");
                        System.out.println("2. Volver al menú principal");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                        if (opcion == 1) {
                            registrarPrestamoAutomovil = true;
                        } else if (opcion == 2) {
                            registrarPrestamoAutomovil = false;
                            registrarPrestamo = true;
                            System.out.println("DATOS DE LOS PRÉSTAMOS DE AUTOMÓVIL REGISTRADOS:\n");
                            for (PrestamoAutomovil prestamo : prestamosAutomovil) {
                                System.out.println("Tipo de Automóvil: " + prestamo.getTipoAutomovil());
                                System.out.println("Marca del Automóvil: " + prestamo.getMarcaAutomovil());
                                System.out.println("GARANTE");
                                System.out.println("Nombre: "+prestamo.getGarante1().getNombre());
                                System.out.println("Apellido: "+prestamo.getGarante1().getApellido());
                                System.out.println("UserName: "+prestamo.getGarante1().getUserName());
                                System.out.println("Ciudad: " + prestamo.getCiudadPrestamo());
                                System.out.println("Tiempo del Préstamo: " + prestamo.getTiempoPrestamo());
                                System.out.println("Valor del Automóvil: " + prestamo.getValorAutomovil());
                                System.out.println("Valor Mensual a Pagar: " + prestamo.getValorMensualPago());
                                System.out.println("***********************************************************************");
                            }
                            System.out.println();
                        } else {
                            System.out.println("Opción inválida. Se volverá al menú principal.");
                            registrarPrestamoAutomovil = false;
                            registrarPrestamo = true;
                        }
                    } while (registrarPrestamoAutomovil);
                    break;
                case 2:
                    String nivelestu;
                    String nom1;
                    String siglas;
                    double valorcarre;
                    String ciudadEdu;
                    int tempEdu;
                    boolean registrarPrestamoEducativo = true;
                    do {
                        System.out.println("Ingrese el nivel de Estudio en el que se encuentra: ");
                        nivelestu=scanner.nextLine();
                        System.out.println("Ingrese el nombre de la Institucion: ");
                        nom1=scanner.nextLine();
                        System.out.println("Ingrese las siglas de la Institucion: ");
                        siglas=scanner.nextLine();
                        System.out.println("Ingrese el valor de la Carrera: ");
                        valorcarre=scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Ingrese la ciudad donde se solicita el Prestamo: ");
                        ciudadEdu=scanner.nextLine();
                        System.out.println("Ingrese el tiempo del prestamo: ");
                        tempEdu=scanner.nextInt();
                        scanner.nextLine();
                        PrestamoEducativo prestamoEducativo1=new PrestamoEducativo();
                        InstitucionEducativa institucionEducativa1=new InstitucionEducativa();
                        prestamoEducativo1.setNivelEstudio(nivelestu);
                        institucionEducativa1.setSiglas(siglas);
                        institucionEducativa1.setNombre(nom1);
                        prestamoEducativo1.setCentroEducativo(institucionEducativa1);
                        prestamoEducativo1.setValorCarrera(valorcarre);
                        prestamoEducativo1.setCiudadPrestamo(ciudadEdu);
                        prestamoEducativo1.setTiempoPrestamo(tempEdu);
                        prestamoEducativo1.calcularPorcentaje();
                        prestamoEducativo1.calcularValorMensualPagoEdu();
                        prestamosEducativo.add(prestamoEducativo1);
                        System.out.println("1. Registrar otro préstamo de automóvil");
                        System.out.println("2. Volver al menú principal");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                        if (opcion == 1) {
                            registrarPrestamoEducativo = true;
                        } else if (opcion == 2) {
                            registrarPrestamoEducativo = false;
                            registrarPrestamo = true;
                            for (PrestamoEducativo prestamo : prestamosEducativo) {
                                System.out.println("Nivel de Estudio: " + prestamo.getNivelEstudio());
                                System.out.println("Nombre de la Institucion: "+prestamo.getCentroEducativo().getNombre());
                                System.out.println("Siglas de la Institucion: "+prestamo.getCentroEducativo().getSiglas());
                                System.out.println("Valor de la Carrera: " + prestamo.getValorCarrera());
                                System.out.println("Ciudad donde se Tramita el Prestamo: " + prestamo.getCiudadPrestamo());
                                System.out.println("Tiempo del Prestamo: " + prestamo.getTiempoPrestamo());
                                System.out.println("Valor Mensual a Pagar: " + prestamo.getValorMensualPagoEdu());
                                System.out.println("***********************************************************************");
                            }
                        } else {
                            System.out.println("Opción inválida. Se volverá al menú principal.");
                            registrarPrestamoEducativo = false;
                            registrarPrestamo = true;
                        }
                    } while (registrarPrestamoEducativo);
                    break;
                case 3:
                    registrarPrestamo = false;
                    break;
            }
        }while (registrarPrestamo);
    }
}
