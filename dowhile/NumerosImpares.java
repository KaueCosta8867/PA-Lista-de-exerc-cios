package prjNumerosImpares;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] argsn) {
		Scanner sc = new Scanner(System.in);
		
		int i=1, r=0;
		
		do {
			r = r + i;
			i = i + 2;
		} while (i < 1000);
		
		System.out.println(r);

	}

}
