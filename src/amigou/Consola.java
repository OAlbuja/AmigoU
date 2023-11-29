/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amigou;

import java.util.Scanner;

/**
 *
 * @author ox_ar
 */
public class Consola {

    private static Scanner input = new Scanner(System.in);

    private Consola() {
    }

    public static void escribir(Object x) {
        System.out.println(x);
    }

    public static void escribirSinSaltar(Object x) {
        System.out.print(x);
    }

    /**
     * Retorna un dato colocado por el usuario en la consola como String
     *
     * @return El dato colocado por el usuario en la consola como String
     */
    public static String leer() {
        return input.nextLine();
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como String
     *
     * @param mensaje El mensaje que el usuario verá antes de ingresar un dato.
     * @return El dato colocado por el usuario en la consola como String
     */
    public static String leer(String mensaje) {
        Consola.escribir(mensaje);
        return input.nextLine();
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como entero
     *
     * @return El dato colocado por el usuario en la consola como entero
     * @throws NumberFormatException si el dato ingresado no representa un
     * entero.
     */
public static int leerEntero(String mensaje) {
    int numero;
    do {
        System.out.println(mensaje);
        try {
            numero = input.nextInt();
            input.nextLine();            
        } catch (NumberFormatException | ArithmeticException | NullPointerException e) {
            numero = -2;
        }
    } while (numero == -2);
    return numero;
}



    public static int leerEntero() {
        return Integer.parseInt(Consola.leer());
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como entero
     *
     * @param mensaje El mensaje que el usuario verá antes de ingresar un dato.
     * @return El dato colocado por el usuario en la consola como entero
     * @throws NumberFormatException si el dato ingresado no representa un
     * entero.
     */
//    public static int leerEntero(String mensaje) {
//        return Integer.parseInt(Consola.leer(mensaje));
//    }
    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como double
     *
     * @return El dato colocado por el usuario en la consola como double
     * @throws NumberFormatException si el dato ingresado no representa un
     * double.
     */
    public static double leerDouble() {
        return Double.parseDouble(Consola.leer());
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como double
     *
     * @param mensaje El mensaje que el usuario verá antes de ingresar un dato.
     * @return El dato colocado por el usuario en la consola como double
     * @throws NumberFormatException si el dato ingresado no representa un
     * double.
     */
    public static double leerDouble(String mensaje) {
        return Double.parseDouble(Consola.leer(mensaje));
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como caracter. Si el usuario ingresa más de un
     * caracter, solo se devuelve el primero. EJ: "Hola" --> 'H'
     *
     * @return El dato colocado por el usuario en la consola como caracter
     */
    public static char leerCaracter() {
        return Consola.leer().charAt(0);
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como caracter. Si el usuario ingresa más de un
     * caracter, solo se devuelve el primero. EJ: "Hola" --> 'H'
     *
     * @param mensaje El mensaje que el usuario verá antes de ingresar un dato.
     * @return El dato colocado por el usuario en la consola como caracter
     */
    public static char leerCaracter(String mensaje) {
        return Consola.leer(mensaje).charAt(0);
    }
}
