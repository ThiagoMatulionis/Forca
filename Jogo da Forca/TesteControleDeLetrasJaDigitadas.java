public class TesteControleDeLetrasJaDigitadas {

    public static void main (String[] args){


        ControladorDeLetrasJaDigitadas teste = new ControladorDeLetrasJaDigitadas();
        ControladorDeLetrasJaDigitadas teste2 = new ControladorDeLetrasJaDigitadas();

        try {
            /*Teste do método registre e toString*/
            teste.registre('C');
            teste.registre('D');
            teste.registre('E');
        //    System.out.println(teste);// C,D,E

          //  teste.registre('C'); //Lança Excessão pois a letra já foi digitada

            /*Teste método isJaDigitada*/
            teste2.registre('D');
            teste2.registre('F');
            //System.out.println(teste2.isJaDigitada('D')); //true foi a letra já foi digitada
        }
        catch (Exception e){
           System.err.println( e.getMessage() );
        }

        try {
            /*Teste Construtor de cópias e clone()*/
            ControladorDeLetrasJaDigitadas c1 = new ControladorDeLetrasJaDigitadas();
            c1.registre('T');
            c1.registre('E');
            c1.registre('S');

            ControladorDeLetrasJaDigitadas c2 = new ControladorDeLetrasJaDigitadas(c1);

            System.out.println(c1);// T,E,S
            System.out.println(c2);// T,E,S

            ControladorDeLetrasJaDigitadas c3 = (ControladorDeLetrasJaDigitadas) c1.clone();

            System.out.println(c3);// T,E,S
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
