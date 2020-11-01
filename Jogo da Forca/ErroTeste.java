public class ErroTeste {
    public static void main(String[] args)
    {
        try
        {
            ControladorDeErros a = new ControladorDeErros(5);
            System.out.println(a);
            a.registreUmErro();
            System.out.println(a);
            System.out.println(a.isAtingidoMaximoDeErros());
            a.registreUmErro();
            a.registreUmErro();
            a.registreUmErro();
            a.registreUmErro();
            System.out.println(a +"\n" + a.isAtingidoMaximoDeErros()+"\n");


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

            System.out.println("\n"+ a.equals(b));

            ControladorDeErros c = (ControladorDeErros) a.clone();
            System.out.println("\n"+c);

            System.out.println("\n"+a.hashCode());
            System.out.println(c.hashCode());

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
