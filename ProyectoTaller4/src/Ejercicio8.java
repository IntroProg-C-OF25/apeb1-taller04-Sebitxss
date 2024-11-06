
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner servicios = new Scanner(System.in);
        double costoNet, costoSpo, costoDropbox, costoYou, edadUsu, totalservicios, descuento, total = 0;
        System.out.print("Ingrese el costo de Netflix: ");
        costoNet = servicios.nextDouble();
        System.out.print("Ingrese el costo de Youtube Premium: ");
        costoYou = servicios.nextDouble();
        System.out.print("Ingrese el costo de Dropbox: ");
        costoDropbox = servicios.nextDouble();
        System.out.print("Ingrese el costo de Spotify: ");
        costoSpo = servicios.nextDouble();
        System.out.print("Ingrese la edad del usuario: ");
        edadUsu = servicios.nextInt();
        totalservicios = costoNet + costoYou + costoDropbox + costoSpo;
        System.out.println("Valor total de los servicios " + totalservicios);
          if (edadUsu > 30) {;
        descuento = totalservicios * 0.20;
        total = totalservicios -= descuento;
        }
        System.out.println("El valor total a cancelar es de: " + total);
    }       
    
    
}

