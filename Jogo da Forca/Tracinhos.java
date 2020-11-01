import java.util.Arrays;

public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {

        if(qtd < 1)
        {
            throw new Exception("Quantidade inv�lida");
        }

        this.texto = new char[qtd];

        for(int i=0; i < qtd;i++)
        {
            this.texto[i] = '_';
        }

		// verifica se qtd n�o � positiva, lan�ando uma exce��o.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).



    }

    public void revele (int posicao, char letra) throws Exception
    {
        if ((posicao < 0) || (posicao >= this.texto.length))
        {
            throw new Exception("Posi��o inv�lida");
        }

        this.texto[posicao] = letra;

		// verifica se posicao � negativa ou ent�o igual ou maior
		// do que this.texto.length, lan�ando uma exce��o.
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

        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
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
        // verificar se this e obj possuem o mesmo conte�do, retornando
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

    public Tracinhos (Tracinhos t) throws Exception // construtor de c�pia
    {
        if(t == null)
            throw new Exception("Par�metro nulo");

        this.texto = new char[t.texto.length];

        for(int i = 0; i < t.texto.length; i++)
        {
            this.texto[i] = t.texto[i];
        }
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
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
