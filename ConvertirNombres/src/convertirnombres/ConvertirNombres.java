/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirnombres;
import java.util.Scanner;
/**
 *
 * @author javie
 */
public class ConvertirNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        System.out.println("Ingresa nombres en minúsculas. Escribe 'salir' para terminar.");
        while (true) {
            entrada = teclado.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.println("Nombre en mayúsculas: " + entrada.toUpperCase());
        }
        teclado.close();
    }
    
}
