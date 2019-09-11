package com.company;

import java.util.Scanner;

public class faltas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de faltas do aluno: ");
         int faltas = sc.nextInt();
            if (faltas > 40)
                {
                    System.out.println("REPROVADO POR FALTA!!!");
                }
            else
                {
                    System.out.println("Informe a média do aluno: ");
                    double media = sc.nextDouble();
                        if (media < 6)
                            {
                                System.out.println("Recuperação");
                            }
                        else
                            {
                                System.out.println("Aprovado");
                            }
                            }
                }
}
