package interpreter.practice;


public class Client {
    public static void main (String[]args){

        String msg1="1 2 3 4 5 6 7 8 9 10";

        Interpreter parser = new Interpreter(msg1);
        System.out.println("Mensaje interpretado en numeros romanos: "+parser.evaluateMsg());

        String msg2="1 5";

        Interpreter parser2 = new Interpreter(msg2);
        System.out.println("Mensaje interpretado en numeros romanos: "+parser2.evaluateMsg());

        String msg3="1 2 3 4 5 4 3 2 1 2 9 8 3";

        Interpreter parser3 = new Interpreter(msg3);
        System.out.println("Mensaje interpretado en numeros romanos: "+parser3.evaluateMsg());
    }

}
