package interpreter.practice.numerosRomanos;

import interpreter.practice.numerosRomanos.Context;
import interpreter.practice.numerosRomanos.Expressions;

public class TerminalExpression10 extends Expressions {
    /**
     * dato entrada contexto =A B C D E
     * dato salido = 1
     * si en el mensaje encontramos la letra A remplazamos por
     * el numero 1 en el mensaje original
     * @param context
     */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("10")){
            context.output= context.output+"X ";
            context.input= context.input.substring(1);
        }
    }
}