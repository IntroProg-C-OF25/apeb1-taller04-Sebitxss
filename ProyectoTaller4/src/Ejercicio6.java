
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner prestamo = new Scanner(System.in);
        double montoPres, interesMen, NumMeses, pagoMen;
        System.out.print("Ingrese el monto del Prestamo: ");
        montoPres = prestamo.nextDouble();
        System.out.print("Interes Mensual: ");
        interesMen = prestamo.nextDouble();
        System.out.print("Ingrese el número de meses: ");
        NumMeses = prestamo.nextDouble();
        pagoMen = montoPres * interesMen * (Math.pow(1 + interesMen,NumMeses)) / (Math.pow(1+interesMen,NumMeses)) - 1;
        System.out.println("El pago mensual es de: " + pagoMen);
    }
    
}

