package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc13{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("\n"+"Entre com o valor / hora: ");

        double valorHora = scan.nextDouble();

        System.out.println("\n"+"Entre com a quantidade de horas trabalhadas no mês: ");

        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;

        double inss = (salarioBruto / 100) * 8;

        double sindicato = (salarioBruto / 100) * 5;

        double impostoRenda = (salarioBruto / 100) * 11;

        double totalDesc = inss + sindicato + impostoRenda;

        double salarioLiq = salarioBruto - totalDesc;

        System.out.println("\n"+"O salario bruto é de : " + salarioBruto);

        System.out.println("\n"+"INSS : " + inss);

        System.out.println("\n"+"Sindicato : " + sindicato);

        System.out.println("\n"+"Imposto de renda : " + impostoRenda);

        System.out.println("\n"+"Total de descontos : " + totalDesc);

        System.out.println("\n"+"Salario liquido : " + salarioLiq);
    }
}