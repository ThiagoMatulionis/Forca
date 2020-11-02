public class TracinhoTeste {
    public static void main(String[] args)
    {
        try
        {
            Tracinhos a = new Tracinhos(2);
            System.out.println(a);
            a.revele(0,'P');
            System.out.println(a);
            a.revele(1,'O');
            System.out.println("a: "+a);
            System.out.println(a.isAindaComTracinhos());
            
            Tracinhos b = new Tracinhos(2);
            System.out.println(b);
            b.revele(0,'P');
            System.out.println(b);
            b.revele(1,'O');
            System.out.println("b: "+b);
            System.out.println(b.isAindaComTracinhos());
            
            
            System.out.println(a.equals(b));
            
            Tracinhos c = (Tracinhos) a.clone();
            System.out.println("c: "+c);

            System.out.println(a.hashCode());
            System.out.println(c.hashCode());


            
            


        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
