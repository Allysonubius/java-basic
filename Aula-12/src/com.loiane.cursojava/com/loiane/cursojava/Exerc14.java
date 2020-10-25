package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\n"+"Entre com o tamanho do arquivo: ");

        double tamArq = scan.nextDouble();

        System.out.println("\n"+"Entre com a velocidade da internet: ");

        double velInternet = scan.nextDouble();

        double tempo = tamArq / velInternet;

        System.out.println("\n"+"Tempo de download: "+ tempo);
    }
    
}
