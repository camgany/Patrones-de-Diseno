package interpreter.practice;


import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Expressions {
    private List<Expressions> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter){
        // asegurando que el msg original no tenga espacios - regla gramatica
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "1":
                    grammar.add(new TerminalExpression1());
                    break;
                case "2":
                    grammar.add(new TerminalExpression2());
                    break;
                case "3":
                    grammar.add(new TerminalExpression3());
                    break;
                case "4":
                    grammar.add(new TerminalExpression4());
                    break;
                case "5":
                    grammar.add(new TerminalExpression5());
                    break;
                case "6":
                    grammar.add(new TerminalExpression6());
                    break;
                case "7":
                    grammar.add(new TerminalExpression7());
                    break;
                case "8":
                    grammar.add(new TerminalExpression8());
                    break;
                case "9":
                    grammar.add(new TerminalExpression9());
                    break;
                case "10":
                    grammar.add(new TerminalExpression10());
                    break;
                default:
                    break;


            }
        }
    }

    public String evaluateMsg(){

        for (Expressions expression:grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }
}

