import java.util.Random;
public class ExercicioC {
	public static void main(String[] args) {
		
        int matriz [][] = new int[3][4];
        Random in = new Random();

        for (int linha = 0; linha < 3; linha++) {
            int soma = 0;

            for (int coluna = 0; coluna < 3; coluna++) {
                matriz [linha][coluna] = in.nextInt(20);
                soma += matriz [linha][coluna];
            }

            matriz [linha][3] = soma;
        }

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("[ %3d ]", matriz [linha][coluna]);
            }
            System.out.println();
        }
    }

}
