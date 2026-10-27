package VetoresPr;
import java.util.Scanner;
public class VetoresPr {
	public static void main(String[] args) {
		int a[], b[], i;
		final int TAM=10;
		Scanner in= new Scanner (System.in);
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+ "o. valor do vetor A");
			a[i] = in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			b[i]= a[i]*a[i];
			System.out.println(b[i]);
		}
		
			
	}
	
	
}
