package prj_vetor;

import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], c[], i;

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite A " + (i+1));
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite B " + (i+1));
            b[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            if(a[i] > b[i]) {
                c[i] = 1;
            } else if(a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
        }

        System.out.println("Vetor C:");
        for(i = 0; i < TAM; i++) {
            System.out.print(c[i] + " ");
        }

        ler.close();
    }
}
