import java.sql.SQLOutput;

public class Condicional {
    public static void main (String[] args){

        int anoDeLancamento = 2000;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if  (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo");
        } else {
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("filme liberado ");
        } else {
            System.out.println("Deve pagar o aluguel do filme ");
        }
    }
}
