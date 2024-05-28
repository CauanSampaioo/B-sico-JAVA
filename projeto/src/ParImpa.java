import java.util.Scanner;

public class ParImpa {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = leitura.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("É PAR");
        } else {
            System.out.println("É IMPAR");
        }
}
}
