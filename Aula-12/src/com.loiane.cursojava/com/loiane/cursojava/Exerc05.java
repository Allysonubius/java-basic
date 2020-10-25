package com.loiane.cursojava;

import java.util.Scanner;

public class Exerc05 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("\n" + "Entre com a quantidade de metros: ");

        double metros = scan.nextDouble();

        // 1m = 100cm
        double cm = metros * 100;

        System.out.println("\n" + metros +" m é igual a  " + cm + "cm");
    }
    
}
