package VetoresLista;
import java.util.Scanner;
public class BuscaVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A[];
        int i, X, encontrado;
        final int TAM = 10;

        A = new int[TAM];

        encontrado = 0;

        for (i = 0; i < TAM; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            A[i] = in.nextInt();
        }

        System.out.print("Digite o numero que deseja buscar: ");
        X = in.nextInt();

        for (i = 0; i < TAM; i++) {
            if (A[i] == X) {
                encontrado = 1;
            }
        }

        if (encontrado == 1) {
            System.out.println("Numero encontrado!");
        } else {
            System.out.println("Numero nao encontrado!");
        }

        in.close();
    }
}