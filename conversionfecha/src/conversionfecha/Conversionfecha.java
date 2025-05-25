/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionfecha;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author javie
 */
public class Conversionfecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una fecha con formato YYYY-MM-DD:");
        String entrada = teclado.nextLine();
        LocalDate fecha = LocalDate.parse(entrada);
        System.out.println("Una semana después: " + unaSemanaDespues(fecha));
        System.out.println("Un mes antes: " + unMesAntes(fecha));
    }

    // Suma una semana
    public static LocalDate unaSemanaDespues(LocalDate fecha) {
        return fecha.plusWeeks(1);
    }

    // Resta un mes
    public static LocalDate unMesAntes(LocalDate fecha) {
        return fecha.minusMonths(1);
    }
    
}
