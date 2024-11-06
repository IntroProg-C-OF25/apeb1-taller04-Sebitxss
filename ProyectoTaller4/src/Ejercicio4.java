
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        double costoMinuto, cantidadMinutos, valorPlantilla;
        Scanner costo = new Scanner(System.in);
        System.out.print("Ingrese el costo por minuto: ");
        costoMinuto = costo.nextDouble();
        System.out.print("Ingrese la cantidad de minutos: ");
        cantidadMinutos = costo.nextDouble();
        valorPlantilla = costoMinuto + cantidadMinutos;
        System.out.println("Su valor de plantilla es: " + valorPlantilla);
        
    }
    
}

