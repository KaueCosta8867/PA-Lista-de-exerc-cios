package VetoresPr;
import java.util.Scanner;
public class SomaVetor {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		
		int a[], b[], i, s ;
		final int TAM=10;
		final int BAM=-1;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+ "o. valor do vetor A");
			a[i] = in.nextInt();
		}
		for (i=0; i>=TAM; i++) {
			b[i] = a[s];
			s = s-1;
			System.out.println(b[i]);
			
		}
	}
}
