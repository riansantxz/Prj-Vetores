package prj_vetor;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int a[], i, j;

        a = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1));
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("\nTabuada do " + a[i]);

            for(j = 1; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i]*j));
            }
        }

        ler.close();
    }
}
