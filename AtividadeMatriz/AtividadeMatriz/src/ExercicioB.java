import java.util.Random;
public class ExercicioB {
	public static void main(String[] args) {
		
        int aleatorio [][] = new int[3][3];
        Random in = new Random();

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
            	aleatorio [linha][coluna] = in.nextInt(100);
            }
        }
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("[ %2d ]", aleatorio [linha][coluna]);
            }
            System.out.println();
        }

        int maior = aleatorio [0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        int menor = aleatorio [0][0];
        int linhaMenor = 0;
        int colunaMenor = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (aleatorio [linha][coluna] > maior) {
                    maior = aleatorio [linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }
                if (aleatorio [linha][coluna] < menor) {
                    menor = aleatorio [linha][coluna];
                    linhaMenor = linha;
                    colunaMenor = coluna;
                }
            }
        }

        System.out.println("Maior valor: " + maior + " (linha " + linhaMaior + ", coluna " + colunaMaior + ")");
        System.out.println("Menor valor: " + menor + " (linha " + linhaMenor + ", coluna " + colunaMenor + ")");
    }
	
}
