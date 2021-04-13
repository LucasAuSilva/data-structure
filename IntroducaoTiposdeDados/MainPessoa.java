import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Quantas pessoas vai criar ? ");
        int n = entry.nextInt();
        Pessoa[] p = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            int count = 1 + i;
            System.out.println("Entre com o nome da " + count + " pessoa: ");
            String nome = entry.next();
            System.out.println("Entre com o sobrenome da " + count + " pessoa: ");
            String sobrenome = entry.next();
            System.out.println("Entre com o idade da " + count + " pessoa: ");
            int idade = Integer.parseInt(entry.next());
            System.out.println("Entre com o salario da " + count + " pessoa: ");
            double salario = Double.parseDouble(entry.next());
            p[i] = new Pessoa(nome, sobrenome, idade, salario);
        }
        entry.close();

        for (int i = 0; i < n; i++) {
            System.out.print(p[i].toString());
            System.out.print("-----------------");
        }
    }
}
