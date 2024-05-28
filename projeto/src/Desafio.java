import java.util.Scanner;

public class Desafio {
        public static void main(String[] args) {

            System.out.println("Dados iniciais do cliente: ");
            String nome = "Cauan Sampaio";
            String tipoConta = "Corrente";
            double saldo = 2500;

            System.out.println("***************************");
            System.out.println("nome - "+nome);
            System.out.println("Conta - "+tipoConta);
            System.out.println("Saldo - "+saldo);
            System.out.println("***************************");


            Scanner leitura = new Scanner(System.in);
            int escolha = 0;

            while(escolha != 4){

                System.out.println("Operações : ");
                System.out.println("1-Consultar saldos");
                System.out.println("2-Pagar valor");
                System.out.println("3-Receber valor");
                System.out.println("4-Sair");
                System.out.println("Digite :");
                escolha = leitura.nextInt();

                if (escolha == 1){
                    System.out.println("O seu saldo é de = "+saldo);
                } else if(escolha == 2){

                    System.out.println("Qual valor que deseja Pagar ? ");
                    double valor = leitura.nextDouble();

                    if(valor > saldo){
                        System.out.println("Saldo insuficiente ! ");
                    } else {
                        saldo -= valor;
                        System.out.println("Pagamento de "+ valor +" conlcuida ! ");
                    }

                } else if(escolha == 3){
                    System.out.println("Qual Valor recebido");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo é de = "+ saldo);
                } else if (escolha != 4){
                    System.out.println("Opção invalida !");
                }

        }
    }
}
