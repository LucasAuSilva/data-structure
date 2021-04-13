public class Merge {

    public Fila merge(Fila fA, Fila fB) {
        Fila fC = new Fila(fA.tamanho + fB.tamanho);

        while (!fC.cheia()) {
            if (!fA.vazio() && !fB.vazio()) {
                if (fA.primeiro() > fB.primeiro())
                    fC.inserir(fB.remove());
                else
                    fC.inserir(fA.remove());
            } else {
                if (fA.vazio())
                    fC.inserir(fB.remove());
                else
                    fC.inserir(fA.remove());
            }
        }
        fC.imprimir();

        return fC;
    }
}