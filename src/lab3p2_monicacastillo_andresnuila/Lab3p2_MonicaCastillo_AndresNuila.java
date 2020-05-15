/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_monicacastillo_andresnuila;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enuil
 */
public class Lab3p2_MonicaCastillo_AndresNuila {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Integer> IDs = new ArrayList();
    static ArrayList<String> usernames = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("***MENU***");
            System.out.println("1) Log In");
            System.out.println("2) Salida");
            System.out.print("Ingrese la opcion deseada: ");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Es usted un administrador o un cliente?");
                    System.out.println("1) Administrador");
                    System.out.println("2) Cliente");
                    System.out.print("Ingrese la opcion deseada: ");
                    int opcion1 = entrada.nextInt();
                    switch (opcion1) {
                        case 1:
                            System.out.println("¡Bienvenido Administrador!");
                            break;
                        case 2:
                            System.out.println("¡Bienvenido Cliente!");
                            System.out.println("¿Que desea hacer el dia de hoy?");
                            System.out.println("1) Sign In");
                            System.out.println("2) Salida");
                            System.out.print("Ingrese la opcion deseada: ");
                            int opcion2 = entrada.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.print("Ingrese su ID: ");
                                    int ID = entrada.nextInt();
                                    while (IDs(ID) == true) {
                                        System.out.println("¡El ID ingresado ya se encuentra registrado!");
                                        System.out.print("Ingrese su ID: ");
                                        ID = entrada.nextInt();
                                    } // Fin While
                                    System.out.print("Ingrese su username: ");
                                    String username = entrada.next();
                                    while (Usernames(username) == true) {
                                        System.out.println("¡El username ingresado ya se encuentra registrado!");
                                        System.out.print("Ingrese su username: ");
                                        username = entrada.next();
                                    } // Fin While
                                    System.out.print("Ingrese su contraseña: ");
                                    String contraseña = entrada.next();
                                    System.out.println("Ingrese su correo electronico: ");
                                    String correo = entrada.next();
                                    System.out.println("Ingrese su nombre completo: ");
                                    String nombre = entrada.nextLine();
                                    System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
                                    String fecha = entrada.next();
                                    break;
                                case 2:
                                    resp = 'n';
                                    break;
                                default:
                                    System.out.println("¡Entrada no valida!");
                            } // Fin Break Sign In
                            break;
                        default:
                            System.out.println("¡Entrada no valida!");
                    } // Fin Switch Roles
                    break;
                case 2:
                    // Aqui va la Salida
                    resp = 'n';
                    break;
                default:
                    System.out.println("¡Entrada no valida!");
            } // Fin Switch Log In

//                    System.out.println("¿Que desea agregar?");
//                    System.out.println("1) Agregar Local");
//                    System.out.println("2) Agregar Producto");
//                    System.out.println("3) Agregar Empleado");
//                    System.out.print("Ingrese la opcion deseada: ");
//                    int opcion2 = entrada.nextInt();
//                    switch (opcion2) {
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                        default:
//                            System.out.println("¡Entrada no valida!");
//                    } // Fin Switch Agregar
//                    break;
//                case 2:
//                    System.out.println("¿Que desea modificar?");
//                    System.out.println("1) Modificar Local");
//                    System.out.println("2) Modificar Producto");
//                    System.out.println("3) Modificar Empleado");
//                    System.out.print("Ingrese la opcion deseada: ");
//                    int opcion3 = entrada.nextInt();
//                    switch (opcion3) {
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                        default:
//                            System.out.println("¡Entrada no valida!");
//                    } // Fin Switch Agregar
//                    break;
//                case 3:
//                    System.out.println("¿Que desea eliminar?");
//                    System.out.println("1) Eliminar Local");
//                    System.out.println("2) Eliminar Producto");
//                    System.out.println("3) Eliminar Empleado");
//                    System.out.print("Ingrese la opcion deseada: ");
//                    int opcion4 = entrada.nextInt();
//                    switch (opcion4) {
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                        default:
//                            System.out.println("¡Entrada no valida!");
//                    } // Fin Switch Agregar
//                    break;
//                case 4:
//                    System.out.println("¿Que desea listar?");
//                    System.out.println("1) Listar Local");
//                    System.out.println("2) Listar Producto");
//                    System.out.println("3) Listar Empleado");
//                    System.out.print("Ingrese la opcion deseada: ");
//                    int opcion5 = entrada.nextInt();
//                    switch (opcion5) {
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                        default:
//                            System.out.println("¡Entrada no valida!");
//                    } // Fin Switch Agregar
//                    break;
//                case 5:
//                    // Aqui va la Salida
//                    resp = 'n';
//                    break;
//                default:
//                    System.out.println("¡Entrada no valida!");
//            } // Fin Switch
//        } // Fin While Resp
        } // Fin Main
    }

    public static boolean IDs(int ID) {
        for (int i = 0; i < IDs.size(); i++) {
            if (IDs.get(i) == ID) {
                return true;
            } else {
                return false;
            } // Fin If
        } // Fin For
        return false;
    } // Fin Codigos

    public static boolean Usernames(String username) {
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username)) {
                return true;
            } else {
                return false;
            } // Fin If
        } // Fin For
        return false;
    } // Fin Codigos
} // Fin Class
