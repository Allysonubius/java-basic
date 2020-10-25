package com.loiane.cursojava;

import java.util.Scanner;

//Calculador valor de SOMA
public class Exer03 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("\n" + "Entre com o primeiro número : ");

        int num_01 =scan.nextInt();

        System.out.println("\n" + "Entre com o segundo número : ");

        int num_02 = scan.nextInt();

        int resultado = num_01 + num_02;

        System.out.println("\n" + "Resultado: " + resultado );
    }
}
