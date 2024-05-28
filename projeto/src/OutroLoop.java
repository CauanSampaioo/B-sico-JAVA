import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidade = 0;

        while (nota != -1){
            System.out.println("Diga a sua avaliação do filme ?");
            nota = leitura.nextDouble();

            if ( nota != -1){
                mediaAvaliacao += nota;
                quantidade++;
            }

        }

        System.out.println("Média da avaliação é "+ (int) mediaAvaliacao / quantidade);

    }
}
