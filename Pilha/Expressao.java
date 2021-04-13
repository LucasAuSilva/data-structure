import java.util.Scanner;

public class Expressao {

    public int expressionCheck() {
        Scanner opt = new Scanner(System.in);

        System.out.println("Enter a expression: ");
        String expression = opt.nextLine();
        Pilha p = new Pilha(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
            case ')':
                if (p.topo() == '(')
                    p.desempilhar();
                else
                    p.empilhar(expression.charAt(i));
                break;
            case ']':
                if (p.topo() == '[')
                    p.desempilhar();
                else
                    p.empilhar(expression.charAt(i));
                break;
            case '}':
                if (p.topo() == '{')
                    p.desempilhar();
                else
                    p.empilhar(expression.charAt(i));
                break;
            default:
                if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{')
                    p.empilhar(expression.charAt(i));
            }
        }

        opt.close();
        if (p.topo() == '0')
            return 1;
        else
            return 0;
    }
}
