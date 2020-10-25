package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\n"+"Entre com um numero inteiro ");

        int num1 = scan.nextInt();

        System.out.println("\n"+"Entre com outro numero inteiro ");

        int num2 = scan.nextInt();

        System.out.println("\n"+"Entre com um numero inteiro ");

        int num3 = scan.nextInt();
    
        int resultado01 = (num1 * num2) * (num2 /2);
        double resultado02 = (num1 * 3) + (num3 );
        double resultado03 = Math.pow(num3, 3);

        System.out.println("Resultado 1: "+ resultado01);
        System.out.println("Resultado 1: "+ resultado02);
        System.out.println("Resultado 1: "+ resultado03);
    }
    
}
