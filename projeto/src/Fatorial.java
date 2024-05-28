import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        int fatorial = 6;

        for (int i = fatorial; i <=numero; i++){
            fatorial *= i;
            System.out.println(fatorial);
        }

    }
}
