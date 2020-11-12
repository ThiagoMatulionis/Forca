public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        // verifica se o texto recebido é nulo ou então vazio,
        // ou seja, sem nenhum caractere, lançando exceção.
        // armazena o texto recebido em this.texto.

        if (texto == null || texto.equals(""))
            throw new Exception ("Palavra inválida !");

        this.texto = texto;
    }

    public int getQuantidade (char letra)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida


        int qtd = 0;

        for (int i = 0; i < texto.length();i++){

            if(texto.charAt(i) == letra)
                qtd++;
        }

        return qtd;

    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {  // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.

        int pos = 0 ;
        int vez =-1;

        for (int j=0; j < this.texto.length();j++)
        {
            if (this.texto.charAt(j) == letra)
            {
                vez++;

                if (vez == i)
                {
                    pos = j;
                    break;
                }
            }
        }

        if (vez == -1)
            throw new Exception("Não há essa letra na palavra");

        return pos;

    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo


        if (this == obj) return true;

        if(obj == null) return false;

        if(obj.getClass() != Palavra.class) return false;

        Palavra plv = (Palavra) obj;

        if (!plv.texto.equals( this.texto)) return false;

        return true;


    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this

        int ret = 255;

        ret = 13 * ret + this.texto.hashCode();

        if(ret < 0)
            ret = -ret;

        return ret;

    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
