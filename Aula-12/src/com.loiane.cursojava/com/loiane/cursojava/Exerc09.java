package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc09 {

    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\n"+"Entre com a temperatura em Farenheit: ");

        double f = scan.nextDouble();

        double c = (5 * ( f - 32 )/9);

        System.out.println("\n"+"A temperatura " + f + " F é igual a " + c + "C");
    }
    
}
