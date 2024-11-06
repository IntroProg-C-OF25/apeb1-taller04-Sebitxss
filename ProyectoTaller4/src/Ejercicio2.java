
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        double gasto1, gasto2, gasto3, gastototal;
        Scanner gastos = new Scanner(System.in);
        System.out.print("INGRESE EL GASTO 1: ");
        gasto1 = gastos.nextDouble();
        System.out.print("INGRESE EL GASTO 2: ");
        gasto2 = gastos.nextDouble();
        System.out.print("INGRESE EL GASTO 3: ");
        gasto3 = gastos.nextDouble();
        gastototal =  (gasto1 + gasto2 + gasto3);
        System.out.println("SUS GASTOS TOTALES SON: " + gastototal);
    }
    
}
