package prj_vetor;

public class exe6 {
    public static void main(String[] args) {
        final int TAM = 11;
        int a[], i, pot;

        a = new int[TAM];

        for(i = 0; i < TAM; i++) {
            pot = 1;

            for(int j = 1; j <= i; j++) {
                pot = pot * 2;
            }

            a[i] = pot;
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }
}
