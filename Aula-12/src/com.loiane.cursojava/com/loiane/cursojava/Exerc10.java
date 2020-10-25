package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\n"+"Entre com a temperatura em Celcius: ");

        double c = scan.nextDouble();

        double f = (( c * 1.8) +  32);

        System.out.println("\n"+"A temperatura "+ c + " C e igual a "+ f +" F");
    }
    
}
