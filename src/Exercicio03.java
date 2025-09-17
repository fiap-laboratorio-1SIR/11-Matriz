import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Random random = new Random();
        double[][] temperatura = new double[3][5];
        DecimalFormat df = new DecimalFormat("0.00");
        double[] mediaAnual = new double[temperatura.length];
        double media;

        // armazena e imprime as temperaturas
        for(int i = 0; i < temperatura.length; i++) {
            media = 0;
            for(int j = 0; j < temperatura[i].length; j++) {
                temperatura[i][j] = random.nextDouble(10, 40);
                System.out.print(df.format(temperatura[i][j]) + "\t");
                media += temperatura[i][j];
            }
            mediaAnual[i] = media / temperatura[i].length;
            System.out.println();
        }

        // impressão da material anual
        for(int i = 0; i < mediaAnual.length; i++) {
            System.out.println("Ano " + (i+1) + " --> " + df.format(mediaAnual[i]));
        }

    }
}
