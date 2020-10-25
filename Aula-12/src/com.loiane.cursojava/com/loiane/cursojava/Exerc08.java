package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc08{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("\n"+"Entre com o valor / hora: ");

        double valorHora = scan.nextDouble();

        System.out.println("\n"+"Entre com a quantidade de horas trabalhadas no mês: ");

        double horas = scan.nextDouble();

        double salario = valorHora * horas;

        System.out.println("\n"+"O salario é de : " + salario);
    }
}