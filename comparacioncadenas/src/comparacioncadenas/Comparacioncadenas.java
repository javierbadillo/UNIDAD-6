/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacioncadenas;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Comparacioncadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la primera cadena:");
        String cadena1 = teclado.nextLine();
        System.out.println("Ingresa la segunda cadena:");
        String cadena2 = teclado.nextLine();
        System.out.println("¿Tienen la misma longitud?: " + mismaLongitud(cadena1, cadena2));
        System.out.println("¿Tienen el mismo contenido?: " + mismoContenido(cadena1, cadena2));
    }

    public static boolean mismaLongitud(String a, String b) {
        return a.length() == b.length();
    }

    public static boolean mismoContenido(String a, String b) {
        return a.equals(b);
    }
}
