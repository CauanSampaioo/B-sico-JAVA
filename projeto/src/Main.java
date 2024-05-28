//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int  anoDeLancamento  = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada por 3 notas
        double media = (9.8 + 6.3 + notaDoFilme) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de avnetura dos anos 80";
        System.out.println(sinopse);

        String sinopse2;
        sinopse2 = """
                Filme Top Gun 
                Filme de aventura
                Muito bom 
                Ano de lancamento
                """ + anoDeLancamento;
        System.out.println(sinopse2);

        int classificacao ;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}