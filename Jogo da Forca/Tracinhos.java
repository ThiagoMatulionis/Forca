import java.util.Arrays;

public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {

        if(qtd < 1)
        {
            throw new Exception("Quantidade inválida");
        }

        this.texto = new char[qtd];

        for(int i=0; i < qtd;i++)
        {
            this.texto[i] = '_';
        }

		// verifica se qtd não é positiva, lançando uma exceção.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).



    }

    public void revele (int posicao, char letra) throws Exception
    {
        if ((posicao < 0) || (posicao >= this.texto.length))
        {
            throw new Exception("Posição inválida");
        }

        this.texto[posicao] = letra;

		// verifica se posicao é negativa ou então igual ou maior
		// do que this.texto.length, lançando uma exceção.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
    }

    public boolean isAindaComTracinhos ()
    {
        for(int i=0; i < this.texto.length; i++)
        {
            if (this.texto[i]== '_')
            {
                return true;
            }
        }
        return false;
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
        String palavra = ""+this.texto[0];


        for(int i=1;i < this.texto.length; i++)
        {
            palavra += " " + this.texto[i];
        }

        return palavra;

        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;

        if(obj == null)
            return false;

        if(this.getClass() != obj.getClass())
            return false;

        Tracinhos tr = (Tracinhos) obj;
        for(int i = 0; i < this.texto.length; i++)
            if(this.texto[i] != tr.texto[i])
                return false;

        return true;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int ret = 30;

        for (int i=0; i<this.texto.length; i++)
            ret = 7*ret + Character.valueOf(this.texto[i]).hashCode();

        if (ret < 0)
            ret = -ret;

        return ret;
        // calcular e retornar o hashcode de this
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        if(t == null)
            throw new Exception("Parâmetro nulo");

        this.texto = new char[t.texto.length];

        for(int i = 0; i < t.texto.length; i++)
        {
            this.texto[i] = t.texto[i];
        }
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
    {
        Tracinhos ret = null;

        try {
            ret = new Tracinhos(this);
        }
        catch (Exception ignored) { }

        return ret;


        // retornar uma copia de this
    }
}
