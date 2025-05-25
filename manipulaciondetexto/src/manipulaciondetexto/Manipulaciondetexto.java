/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulaciondetexto;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Manipulaciondetexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un texto largo:");
        String texto = teclado.nextLine();
        int cantidad = contarPalabra(texto, "ingeniería");
        System.out.println("La palabra 'ingeniería' aparece " + cantidad + " veces.");
    }

    public static int contarPalabra(String texto, String palabra) {
        int contador = 0;
        String[] palabras = texto.split("\\s+");
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}