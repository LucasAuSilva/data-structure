public class Main {
    public static void main(String[] args) {
        Fila fA = new Fila(4);
        Fila fB = new Fila(5);
        Merge merge = new Merge();

        fA.inserir(12);
        fA.inserir(35);
        fA.inserir(52);
        fA.inserir(64);

        fB.inserir(05);
        fB.inserir(15);
        fB.inserir(23);
        fB.inserir(55);
        fB.inserir(75);

        fA.imprimir();
        fB.imprimir();

        merge.merge(fA, fB);
    }
}