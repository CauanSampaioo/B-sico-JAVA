import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        double numeroAleatorio = new Random().nextInt(10);
        System.out.println(numeroAleatorio);
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        int totalTentativas = 3;
        double numeroDigitado = 0;

        while(tentativas < totalTentativas){
            System.out.println("Digite um número ");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio){
                System.out.println("*** Você venceu ***");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
            System.out.println("O número digitado é MENOR que o número secreto");
            } else {
                System.out.println("O número digitado é MAIOR que o número secreto");
            }
        }


        if(tentativas == totalTentativas &&  numeroDigitado != numeroAleatorio){
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
        }

        }

    }

