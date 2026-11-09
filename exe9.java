package prj_vetor;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], c[], i, j, k = 0, x;
        boolean existe;

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
            for(j = 0; j < TAM; j++) {
                if(a[i] == b[j]) {
                    existe = false;

                    for(x = 0; x < k; x++) {
                        if(c[x] == a[i]) {
                            existe = true;
                        }
                    }

                    if(existe == false) {
                        c[k] = a[i];
                        k++;
                    }

                    break;
                }
            }
        }

        System.out.println("C = [");
        for(i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("]");

        ler.close();
    }
}
