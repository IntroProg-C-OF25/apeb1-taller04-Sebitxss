
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        int numero, resultado;
        System.out.print("Ingrese un número entre 2 y 6:  ");
        numero = calculadora.nextInt();
    for (int i = 1; i <= 10; i++) {
    resultado = numero * i;
    System.out.println(numero + " x " + i + " = " + resultado);
}
    
}
}
