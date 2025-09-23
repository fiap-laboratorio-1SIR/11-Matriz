import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        Random random = new Random();
        int linha = random.nextInt(2, 6);
        int coluna = random.nextInt(2, 6);
        int[][] c = new int[linha][coluna];
        int[][] ct = new int[coluna][linha];

        // gerar e imprimir a matriz c
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                c[i][j] = random.nextInt(10);
                System.out.print(c[i][j] + "\t");
                ct[j][i] = c[i][j];
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < ct.length; i++) {
            for(int j = 0; j < ct[i].length; j++) {
                System.out.print(ct[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
