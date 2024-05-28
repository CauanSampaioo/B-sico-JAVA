import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {    //atalho "psvm"
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito ");   // atalho "sout"
        String filme = leitura.nextLine();


        System.out.println("Qual o ano de lançamento ? ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga a sua avaliação do filme ?");
        double avaliacao = leitura.nextDouble();


        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        leitura.close();

    }
}
