public class Desconto {
    public static void main( String[] args){
        double precoOriginal = 150;

        double percentualDesconto = 10;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;


        System.out.println("Preço original = "+ precoOriginal);
        System.out.println("Valor do desconto "+ valorDesconto);
        System.out.println("Preço com desconto = "+ novoPreco);
    }
}
