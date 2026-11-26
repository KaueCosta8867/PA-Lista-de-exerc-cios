public class ExercicioA {
	public static void main(String[] args) {
		
        int dobro [][] = new int[4][4];

        int anterior = 1;

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
            	dobro [linha][coluna] = anterior * 2;
                anterior = dobro [linha][coluna];
            }
        }
        
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("[ %6d ]", dobro [linha][coluna]);
            }
            System.out.println();
        }
    }

}
