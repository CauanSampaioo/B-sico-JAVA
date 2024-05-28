import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o número");
        int tabuadaDo = leitura.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(tabuadaDo+" X "+ i + " = "+ tabuadaDo * i);
        }
    }
}
