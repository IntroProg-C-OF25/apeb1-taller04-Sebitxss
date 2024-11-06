
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIABLES
        double base, altura, area;
        Scanner teclado = new Scanner (System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("DAME LA BASE: "); //carpinteria de salida
        base = teclado.nextDouble(); //datos de entrada
        System.out.print("DAME LA ALTURA: ");
        altura = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
        area = (base * altura) / 2;
        //BLOQUE DE DATOS DE SALIDA
        System.out.print("Area del triangulo es:  = " + area );
    }
    
}
