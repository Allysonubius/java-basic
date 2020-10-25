package com.loiane.cursojava;

import java.util.Scanner;

public class Exer04 {
    
    public static void main(String[] args){
        
        double  condicao = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("\n" + "1° nota:");
        double nota_01 = scan.nextDouble();

        System.out.println("\n" + "2° nota:");
        double nota_02 = scan.nextDouble();
        
        System.out.println("\n" + "3° nota:");
        double nota_03 = scan.nextDouble();

        System.out.println("\n" + "4° nota:");
        double nota_04 = scan.nextDouble();

        double media = (nota_01 + nota_02 + nota_03 + nota_04) / 4;

        if(media >= 1){
            if (media >= 1 && media <= 5){
                condicao = 1 ;
                System.out.println("\n" + "Reprovado " + media);
            }
            if (media >= 5 && media <=10){
                condicao = 2 ;
                System.out.println("\n" + "Aprovado " + media);
            }
        }else{
            System.out.println("\n" + "Valor invalido é necessário colocar a nota do aluno !");
        }

    }
}