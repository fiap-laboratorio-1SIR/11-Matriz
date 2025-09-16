import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(1, 5);
                System.out.print(matriz[i][j] + "\t");
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("maior valor = " + maior);
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == maior) {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }
}
