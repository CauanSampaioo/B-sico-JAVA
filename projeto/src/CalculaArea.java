import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int escolha = 0;

        while(escolha != 3){

            System.out.println("---ESCOLHA UMA OPÇÃO---");
            System.out.println("1-Calcular área do quadrado");
            System.out.println("2-Calcular área do circulo");
            System.out.println("3-Encerrar programa");

            escolha = leitura.nextInt();

            if(escolha == 1){

                System.out.println("Digite o lado do quadrado");
                double lado = leitura.nextDouble();
                double areaQuadrada = lado * lado;

            } else if(escolha == 2){

                System.out.print("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);

            } else if (escolha == 3 ){

                System.out.println("PROGRAMA ENCERRADO");

            } else {

                System.out.println("Comando invalido");

            }
        }
    }
}
