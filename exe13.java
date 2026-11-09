package prj_vetor;

import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], i;
        boolean palindromo = true;

        a = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1));
            a[i] = ler.nextInt();
        }

        for(i = 0; i < TAM/2; i++) {
            if(a[i] != a[TAM-1-i]) {
                palindromo = false;
            }
        }

        if(palindromo == true) {
            System.out.println("O vetor e palindromo!");
        } else {
            System.out.println("O vetor nao e palindromo!");
        }

        ler.close();
    }
}
