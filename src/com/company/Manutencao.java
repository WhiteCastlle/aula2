package com.company;

import java.util.Scanner;

public class Manutencao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double produzido,defeito,porcentagem;
        System.out.println("Qual total de preças produzidas? ");
            produzido = sc.nextDouble();
        System.out.println("Qual o total de peças defeituosas? ");
            defeito = sc.nextDouble();
        porcentagem = (produzido / 10);
                if(defeito > produzido){
                    System.out.println("A máquina deve ser reparada");
                }else{
                    System.out.println("A máquina não precisa de reparo");
                }
    }
}
