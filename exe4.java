package prj_vetor;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, j;

        a = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1));
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("\nPares de 0 ate " + a[i]);

            for(j = 0; j <= a[i]; j++) {
                if(j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        ler.close();
    }
}
