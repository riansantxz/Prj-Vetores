package prj_vetor;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int a[], b[], i, j;

        a = new int[TAM];
        b = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1) +
                               " (use um valor entre 0 e 12)");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            b[i] = 1;

            for(j = 1; j <= a[i]; j++) {
                b[i] = b[i] * j;
            }
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("A: " + a[i] + " B: " + b[i]);
        }

        ler.close();
    }
}
