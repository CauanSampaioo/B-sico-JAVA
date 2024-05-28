import java.util.Scanner;

public class ComparaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Insira o primeiro número ");
        numero1 = leitura.nextInt();

        System.out.println("Insira o segundo número ");
        numero2 = leitura.nextInt();

        if (numero1 == numero2){
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2){
            System.out.println("O primeiro número É maior");
        } else {
            System.out.println("O segundo numero é menor");
        }
    }
}
