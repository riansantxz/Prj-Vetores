package prj_vetor;

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i, j, soma;

        a = new int[TAM];
        b = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1));
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            soma = 0;

            for(j = i; j < TAM; j++) {
                soma = soma + a[j];
            }

            b[i] = soma;
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }

        ler.close();
    }
}
