public class Main {
    public static void main(String[] args) {
        Expressao exp = new Expressao();

        if (exp.expressionCheck() == 0)
            System.out.println("Expressao Invalida");
        else
            System.out.println("Expressao Valida");
    }
}