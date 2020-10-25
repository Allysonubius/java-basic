package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("\n" + "Entre com o raio do circulo: ");

        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("\n"+"A area do circulo é " + area);
    }
    
}
