public class TesteControleDeLetrasJaDigitadas {

    public static void main (String[] args){


        ControladorDeLetrasJaDigitadas teste = new ControladorDeLetrasJaDigitadas();
        ControladorDeLetrasJaDigitadas teste2 = new ControladorDeLetrasJaDigitadas();

        try
        {
            //Teste do método registre e toString
            teste.registre('C');
            teste.registre('D');
            teste.registre('E');
            System.out.println(teste);// C,D,E

            teste.registre('C');// Lança Excessão pois a letra já foi digitada

            //Teste método isJaDigitada e equals

            teste2.registre('C');
            teste2.registre('D');
            teste2.registre('E');

            //equals
            System.out.println(teste.equals(teste2)); // true , os objetos são iguais

            System.out.println(teste2.isJaDigitada('D')); //true , a letra já foi digitada !
           }
        catch (Exception e)
        {
           System.err.println( e.getMessage() );
        }


        try
        {
            //Teste Construtor de cópias e clone()
            ControladorDeLetrasJaDigitadas c1 = new ControladorDeLetrasJaDigitadas();
            c1.registre('A');
            c1.registre('E');
            c1.registre('S');
            c1.registre('Y');

            ControladorDeLetrasJaDigitadas c2 = new ControladorDeLetrasJaDigitadas(c1);

            System.out.println(c1);// A,E,S,Y
            System.out.println(c2);// A,E,S,Y

            ControladorDeLetrasJaDigitadas c3 = (ControladorDeLetrasJaDigitadas) c1.clone();
            System.out.println(c3);// A,E,S,Y

            // Teste hashCode
            System.out.println(teste.hashCode()); // 70321
            System.out.println(c2.hashCode()); // 2009143
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
