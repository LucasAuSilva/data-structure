import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {
        int[] v = new int[10];
        Scanner nbr = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + i + " numero: ");
            v[i] = nbr.nextInt();
        }

        Calculador c = new Calculador();
        int moda = c.moda(v);
        double media = c.media(v);

        if (moda == 0) {
            System.out.println("A moda não existe.");
            System.out.println("A media é " + media);
        } else {
            System.out.println("A moda é " + moda);
            System.out.println("A media é " + media);
        }

        nbr.close();
    }
}
