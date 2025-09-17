import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Random random = new Random();
        int ordem = random.nextInt(2, 6);
        int[][] matriz = new int[ordem][ordem];
        int aux, k;

        // gerar e imprimir a matriz
        System.out.println("Valores originais");
        for(int i = 0; i < ordem; i++) {
            for(int j = 0; j < ordem; j++) {
                matriz[i][j] = random.nextInt(3, 20);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // trocar os elementos
        k = ordem - 1;
        for(int i = 0; i < ordem; i++) {
            aux = matriz[i][i];
            matriz[i][i] = matriz[i][k];
            matriz[i][k] = aux;
            k--;
        }

        // imprimir a matriz
        System.out.println("\nImpressão após a troca dos elementos");
        for(int i = 0; i < ordem; i++) {
            for(int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
