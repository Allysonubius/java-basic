package com.loiane.cursojava;

import java.util.Scanner;

public class If_Else {
    
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n"+"Entre com a sua idade: ");

        int idade = scan.nextInt();

        if(idade >- 18){
            System.out.println("\n"+"E maior de idade ");
        }else{
            System.out.println("\n"+"Não e maior de idade ");
        }
        
    }
}
