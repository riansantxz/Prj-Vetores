package prj_vetor;

import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int senha[], i, op, qtd = 0, proxima = 1;

        senha = new int[TAM];

        do {
            System.out.println("\n1 - Adicionar senha");
            System.out.println("2 - Chamar senha");
            System.out.println("3 - Sair");
            System.out.println("Escolha:");
            op = ler.nextInt();

            if(op == 1) {
                if(qtd < TAM) {
                    senha[qtd] = proxima;
                    System.out.println("Senha adicionada: " + senha[qtd]);
                    qtd++;
                    proxima++;
                } else {
                    System.out.println("Fila cheia!");
                }
            }

            if(op == 2) {
                if(qtd > 0) {
                    System.out.println("Senha chamada: " + senha[0]);

                    for(i = 0; i < qtd-1; i++) {
                        senha[i] = senha[i+1];
                    }

                    qtd--;
                } else {
                    System.out.println("Fila vazia!");
                }
            }

        } while(op != 3);

        ler.close();
    }
}
