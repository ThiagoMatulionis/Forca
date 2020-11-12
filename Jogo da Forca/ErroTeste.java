public class ErroTeste {
    public static void main(String[] args)
    {
        try
        {
            ControladorDeErros a = new ControladorDeErros(5);
            System.out.println("Erros: "+a);
            a.registreUmErro();
            System.out.println("Erros: "+a);
            System.out.println("Erros maximos atingidos: "+a.isAtingidoMaximoDeErros());
            while(!a.isAtingidoMaximoDeErros())
                a.registreUmErro();
            System.out.println("Erros: "+a +"\nErros maximos atingidos: " + a.isAtingidoMaximoDeErros()+"\n");


            ControladorDeErros b = new ControladorDeErros(5);
            System.out.println(b);
            b.registreUmErro();
            System.out.println(b);
            System.out.println(b.isAtingidoMaximoDeErros());
            b.registreUmErro();
            b.registreUmErro();
            b.registreUmErro();
            b.registreUmErro();
            System.out.println(b +"\n" + b.isAtingidoMaximoDeErros());

            System.out.println("\na equals b: "+ a.equals(b));

            ControladorDeErros c = (ControladorDeErros) a.clone();
            System.out.println("\nc: "+c);

            System.out.println("\n"+    a.hashCode());
            System.out.println(         b.hashCode());
            System.out.println(         c.hashCode());

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
