package VetoresPr;
import java.util.Scanner;
public class MediaVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAM = 10;
        int a [], soma = 0;
        double media;
        
        a = new int[TAM];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " +(i+1)+ "o valor: ");
            a[i] = in.nextInt();

            soma = soma + a[i];
        }

        media = soma/10.0;

        System.out.println("A media é: " +media);

        in.close();
    }
}