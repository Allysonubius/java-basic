package com.loiane.java;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[]args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Entre com o primeiro número: ");
        
        int num_01 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");

        int num_02 = scan.nextInt();

        if(num_01 > num_02){
            System.out.println("O primeiro número e maior que o " + num_02 );
        }
        else{
            System.out.println("O segundo número e maior que o " + num_01 );
        }
    }
    
}