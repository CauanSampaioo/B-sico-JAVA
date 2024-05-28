import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidade = 3;

        for (int i = 0; i < quantidade; i++){
            System.out.println("Diga a sua avaliação do filme ?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média da avaliação é "+ mediaAvaliacao/quantidade);


    }
}
