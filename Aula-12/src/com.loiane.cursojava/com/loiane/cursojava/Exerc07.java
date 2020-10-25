package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("\n"+"Entre com o tamanho do lado do quadrado");

        double lado = scan.nextDouble();

        //area = lado * lado

        double area = Math.pow(lado,2);

        System.out.println("\n"+"A area do quadrado é "+area);
        System.out.println("\n"+"O dobro da area do  quadrado é "+(area *2));
    }
}
