package prj_vetor;

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, x;
        boolean encontrou = false;

        a = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o valor de A " + (i+1));
            a[i] = ler.nextInt();
        }

        System.out.println("Digite o numero que deseja buscar:");
        x = ler.nextInt();

        for(i = 0; i < TAM; i++) {
            if(a[i] == x) {
                encontrou = true;
            }
        }

        if(encontrou == true) {
            System.out.println("Numero encontrado!");
        } else {
            System.out.println("Numero nao encontrado!");
        }

        ler.close();
    }
}
