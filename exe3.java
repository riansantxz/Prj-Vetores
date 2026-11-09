package prj_vetor;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, j, cont;

        a = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1));
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            cont = 0;

            for(j = 1; j <= a[i]; j++) {
                if(a[i] % j == 0) {
                    cont++;
                }
            }

            if(cont == 2) {
                System.out.println(a[i] + " e primo");
            } else {
                System.out.println(a[i] + " nao e primo");
            }
        }

        ler.close();
    }
}
