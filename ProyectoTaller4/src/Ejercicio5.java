
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double CPU, teclado, pantalla, raton, precioT;
        Scanner compu = new Scanner(System.in);
        System.out.print("Presupuesto del CPU: ");
        CPU = compu.nextDouble();
        System.out.print("Presupuesto del teclado: ");
        teclado = compu.nextDouble();
        System.out.print("Presupuesto de la Pantalla: ");
        pantalla = compu.nextDouble();
        System.out.print("Presupuesto del ratón: ");
        raton = compu.nextDouble();
        precioT = CPU + teclado + pantalla + raton;
        System.out.println("El precio es de: " + precioT);
    }
    
}

