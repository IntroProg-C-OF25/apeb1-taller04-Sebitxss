
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner luz = new Scanner(System.in);
        double costoK, numK, edadUsuario, valorPla, descuento, total = 0;
        System.out.print("Ingrese el costo por Kilovatio/hora: ");
        costoK = luz.nextDouble();
        System.out.print("Ingrese el número de Kilovatios consumidos al mes: ");
        numK = luz.nextDouble();
        System.out.print("Ingrese la edad del usuario: ");
        edadUsuario = luz.nextInt();
        valorPla = costoK * numK;
        System.out.println("El valor de la planilla es de: " + valorPla);
        if (edadUsuario > 65) {;
        descuento = valorPla * 0.10;
        total = valorPla -= descuento;
        }
        System.out.println("El valor total a cancelar es de: " +  total);
        
        
    }
    
    
}
