package com.loiane.cursojava;

import java.util.Scanner;

public class LeitruaDadosTeclado {

    private static Scanner scan;

    public static void main(String[]args){
        scan = new Scanner(System.in);
/*
        System.out.println("Digite seu nome completo :" + "\n");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto  + "\n");

        System.out.println("Digite seu primeiro nome: " + "\n");
        String firstName = scan.nextLine();
        System.out.println("Seu primeiro nome é :" + firstName + "\n");

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade e " + idade);

        System.out.println("Digite a sua idade: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura e " + altura);
*/
        System.out.println("Digite seu primeiro nome, idade, filhos, altura e bicho de estimação:");
        String name = scan.next();
        int age = scan.nextInt();
        byte qtdfilhos = scan.nextByte();
        float altur = scan.nextFloat();
        boolean pet = scan.nextBoolean();

        System.out.println("Voce digitou os seguintes valores:");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Filohs: " + qtdfilhos);
        System.out.println("Altura: " + altur);
        System.out.println("Pet: " + pet);
    }
    
}