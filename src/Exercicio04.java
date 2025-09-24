import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Random random = new Random();
        String[] categoria = {"Eletrônico", "Vestuário", "Alimento"};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        double[][] venda = new double[categoria.length][mes.length];
        double total;
        double maiorTotal = 0;
        int indexMes = 0;

        // armazenamento do total de vendas
        for(int i = 0; i < venda.length; i++) {
            for(int j = 0; j < venda[i].length; j++) {
                venda[i][j] = random.nextDouble(2, 10);
                System.out.print(df.format(venda[i][j]) + "\t");
            }
            System.out.println();
        }

        // item b --> total de vendas por categoria
        System.out.println("\nTotal de vendas por categoria");
        for(int i = 0; i < venda.length; i++) {
            total = 0;
            for(int j = 0; j < venda[i].length; j++) {
                total += venda[i][j];
            }
            System.out.println(categoria[i] + " --> R$ " + df.format(total));
        }

        // item c --> mês com o maior total de vendas
        for(int j = 0; j < mes.length; j++) {
            total = 0;
            for(int i = 0; i < categoria.length; i++) {
                total += venda[i][j];
            }
            if(total > maiorTotal) {
                maiorTotal = total;
                indexMes = j;
            }
        }
        System.out.println("\nMês com o maior total de vendas --> " + mes[indexMes]);
    }
}
