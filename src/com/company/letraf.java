package com.company;

import java.util.Scanner;

public class letraf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preco,quantidade,total;


        System.out.println("Qual o valor do produto?");
        preco = sc.nextDouble();
        System.out.println("Quantas unidades serão compradas?");
        quantidade = sc.nextDouble();
        total = preco * quantidade;
        System.out.println("O valor total da compra é: "+ total);

    }
}
