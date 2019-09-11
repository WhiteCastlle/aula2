package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Papelaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o total de cópias?");
        int copias = sc.nextInt();
        if(copias <= 100)
        {
                System.out.println("O valor total a ser pago é: "+(copias * 0.25));
        }
        else
            {
                System.out.println("O valor total a ser pago é: "+(copias * 0.20));
        }

    }
}
