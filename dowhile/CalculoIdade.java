package prjCalculoIdade;

import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aa,an,i;
		String decisao;
		
		do {
			System.out.println("Entre com o ano atual:");
			aa = sc.nextInt();
			
			System.out.println("Entre com o ano de nascimento:");
			an = sc.nextInt();
			
			i = aa - an;
			
			if (i < 18) {
				System.out.println("Idade =" + " " + i + ", " + "Menor de idade.");
			} else {
				System.out.println("Idade =" + " " + i + ", " + "Maior de idade.");
			}
			
			System.out.println("Deseja continuar? (S para sim, N para não).");
			sc.nextLine();
			decisao = sc.nextLine();
			
		} while (decisao.equalsIgnoreCase("S"));

		sc.close();
	}

}
