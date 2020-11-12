public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {

        if(qtdMax < 1)
            throw new Exception("Quantidade máxima inválida");

        this.qtdMax = qtdMax;
		// verifica se qtdMax fornecida não é positiva, lançando
		// uma exceção.
		// armazena qtdMax fornecida em this.qtdMax.
    }

    public void registreUmErro () throws Exception
    {

        if(isAtingidoMaximoDeErros())
        {
            throw new Exception("Erros máximos atingido");
        }

        this.qtdErr++;

        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        return this.qtdErr == this.qtdMax;
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrário.
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

        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int ret = 25;

        ret *= 7 + Integer.valueOf(this.qtdErr).hashCode();
        ret *= 7 + Integer.valueOf(this.qtdMax).hashCode();

        if(ret < 0)
            ret = -ret;

        return ret;
        // calcular e retornar o hashcode de this
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        if (c == null)
            throw new Exception("Parâmetro nulo");
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
        // returnar uma cópia de this
    }
}
