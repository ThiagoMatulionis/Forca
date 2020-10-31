
public class TestePalavra
{
    public static void main (String args[])
    {
        try {

            Palavra teste = new Palavra("OTORRINOLARINGOLOGISTA");
            System.out.println(teste.getQuantidade('O'));// 5 letras

            Palavra teste2 = new Palavra("ARARA");
            System.out.println(teste2.getPosicaoDaIezimaOcorrencia(2,'A')); // Retorna a posição quatro como o esperado

            Palavra teste3 =   new Palavra("IGUAL");
            Palavra teste4 =   new Palavra("IGUAL");

            System.out.println(teste3.equals(teste4)); //
        }
        catch (Exception erro){
         System.err.println(erro.getMessage());
        }
    }
}
