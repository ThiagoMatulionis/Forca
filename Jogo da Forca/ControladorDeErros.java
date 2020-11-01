public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if(qtdMax < 0)
            throw new Exception("Quantidade m�xima inv�lida");

        this.qtdMax = qtdMax;
		// verifica se qtdMax fornecida n�o � positiva, lan�ando
		// uma exce��o.
		// armazena qtdMax fornecida em this.qtdMax.
    }

    public void registreUmErro () throws Exception
    {
        if(isAtingidoMaximoDeErros())
        {
            throw new Exception("Erros m�ximos atingido");
        }

        this.qtdErr++;

        // verifica se this.qtdErr ja � igual a this.qtdMax,
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        return this.qtdErr == this.qtdMax;
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;

        if(obj == null)
            return false;

        if(this.getClass() != obj.getClass())
            return false;

        ControladorDeErros c = (ControladorDeErros) obj;

        return this.qtdErr == c.qtdErr && this.qtdMax == c.qtdMax;

        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int ret = 25;

        ret *= 7 + Integer.valueOf(this.qtdErr).hashCode();
        ret *= 7 + Integer.valueOf(this.qtdMax).hashCode();


        return ret;
        // calcular e retornar o hashcode de this
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de c�pia
    {
        if (c == null)
            throw new Exception("Par�metro nulo");
        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone ()
    {
        ControladorDeErros ret = null;

        try {
            ret = new ControladorDeErros(this);
        }
        catch (Exception ignored) { }

        return ret;
        // returnar uma c�pia de this
    }
}
