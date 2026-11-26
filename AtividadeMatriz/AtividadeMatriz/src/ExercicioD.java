import java.util.Random;
public class ExercicioD {
	public static void main(String[] args) {
        Random in = new Random();
        int cartela [][] = new int[4][4];

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                int numero;
                do {
                    numero = in.nextInt(75) + 1;
                } while (existeNaCartela(cartela, numero));
                cartela[linha][coluna] = numero;
            }
        }

        System.out.println("Cartela");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("[ %02d ]", cartela[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println();

        boolean[] jaSorteado = new boolean[76];
        int acertos = 0;
        int rodadas = 0;

        while (acertos < 16) {
        	int sorteado;
            do {
                sorteado = in.nextInt(75) + 1;
            } while (jaSorteado[sorteado]);
            jaSorteado[sorteado] = true;
            rodadas++;

            boolean achou = false;
            for (int linha = 0; linha < 4; linha++) {
                for (int coluna = 0; coluna < 4; coluna++) {
                    if (cartela[linha][coluna] == sorteado) {
                        achou = true;
                    }
                }
            }

            if (achou) {
                acertos++;
                System.out.printf("Rodada %2d: número %02d -> Tem na cartela (%d/16)%n", rodadas, sorteado, acertos);
            } else {
                System.out.printf("Rodada %2d: número %02d -> não tem na cartela.%n", rodadas, sorteado);
            }
        }
        
        System.out.println();

        System.out.println("BINGO!");
        System.out.println("Você completou a cartela em " + rodadas + " rodadas.");
    }
	
    static boolean existeNaCartela(int[][] cartela, int numero) {
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (cartela[linha][coluna] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

}
