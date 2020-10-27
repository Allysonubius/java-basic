package com.loiane.java;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);

        boolean novaValida = false;

        do{
            System.out.println("Entre com uma nota: ");

        double nota = scan.nextDouble();

        if(nota >= 0 && nota <= 10){
            notaValida = true;
            System.out.println("Voce digitou: " + nota);
        }else{
            System.out.println("Nota invalida,digite novamente:");
        }while(!novaValida);
    
        
    }
    
}
