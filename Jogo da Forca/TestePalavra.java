
public class TestePalavra
{
    public static void main (String args[])
    {
        try {

            //Teste getQuantidade
            Palavra teste = new Palavra("CONFORTO");
            System.out.println(teste.getQuantidade('O'));// 3 letras

            //Teste getPosicaoDaIezimaOcorrencia
            Palavra teste2 = new Palavra("ARARA");
            System.out.println(teste2.getPosicaoDaIezimaOcorrencia(1,'A'));
            // Retorna a posição 2

            //System.out.println(teste2.getPosicaoDaIezimaOcorrencia(0,'E'));
            // Lança exceção pois a letra não existe na palavra

            Palavra teste3 =   new Palavra("IGUAL");
            Palavra teste4 =   new Palavra("IGUAL");

            System.out.println(teste3.equals(teste4)); // true, as palavras são iguais

            //Teste hashCode
            System.out.println(teste.hashCode()); //202680757
            System.out.println(teste2.hashCode());//62540114
        }
        catch (Exception erro){
         System.err.println(erro.getMessage());
        }
    }
}
