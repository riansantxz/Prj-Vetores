package prj_vetor;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 20;
        int a[], b[], i, p = 0, imp = TAM;

        a = new int[TAM];
        b = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1));
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            if(a[i] % 2 == 0) {
                b[p] = a[i];
                p++;
            } else {
                imp--;
                b[imp] = a[i];
            }
        }

        System.out.println("Vetor B:");
        for(i = 0; i < TAM; i++) {
            System.out.print(b[i] + " ");
        }

        ler.close();
    }
}
