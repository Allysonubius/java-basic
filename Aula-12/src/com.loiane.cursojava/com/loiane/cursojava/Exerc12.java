package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\n"+"Entre com a altura: ");

        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("\n"+"O peso ideal é : " + pesoIdeal);
    }
    
}
