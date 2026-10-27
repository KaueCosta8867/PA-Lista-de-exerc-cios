package VetoresPr;
import java.util.Scanner;
public class Inverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int A [], B[];
        
        A = new int[TAM];
        B = new int[TAM];

        for (int i=0; i<TAM; i++) {
            System.out.print("Digite o " +(i+1)+ "o valor: ");
            A[i] = in.nextInt();
        }

        for (int i=0; i<TAM; i++) {
            B[i] = A[9 - i];
        }

        System.out.print("Vetor B: ");

        for (int i=0; i<TAM; i++) {
            System.out.print(B[i] + " ");
        }

        in.close();
    }
}