public class TracinhoTeste {
    public static void main(String[] args)
    {
        try
        {
            Tracinhos a = new Tracinhos(4);
            System.out.println("a: "+a);
            a.revele(0,'P');
            a.revele(1,'A');
            System.out.println(a.isAindaComTracinhos());
            a.revele(2,'R');
            a.revele(3,'E');
            System.out.println("a: "+a);
            System.out.println(a.isAindaComTracinhos());

            System.out.println(); // Linha vazia

            Tracinhos b = new Tracinhos(4);
            System.out.println("b: "+b);
            b.revele(0,'P');
            b.revele(1,'A');
            b.revele(2,'R');
            b.revele(3,'E');
            System.out.println("b: "+b);

            System.out.println(); // Linha vazia
            
            
            System.out.println("a equals b: "+a.equals(b)+"\n");

            Tracinhos c = (Tracinhos) a.clone();
            System.out.println("c: "+c+"\n");

            System.out.println("a.hashCode: "+a.hashCode());
            System.out.println("b.hashCode: "+b.hashCode());
            System.out.println("c.hashCode: "+c.hashCode());


            
            


        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
