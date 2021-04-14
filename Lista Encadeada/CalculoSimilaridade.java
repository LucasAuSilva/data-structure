

public class CalculoSimilaridade {

    public double calculo(No x, No y) {

        int nume = 0;
        double denom = 0;
        int denomSumX = 0;
        int denomSumY = 0;
        double result;

        while (x != null || y != null) {

            nume += (x.info * y.info);

            denomSumX += Math.pow(x.info, 2);
            denomSumY += Math.pow(y.info, 2);

            x = x.proximo;
            y = y.proximo;

            if (x == null) 
                denom = Math.sqrt(denomSumX * denomSumY);
            result = (nume/denom);

        }
        result = (nume/denom);

        return result;
    }

    public void thirdList(ListaEncadeada x, ListaEncadeada y, ListaEncadeada z) {
        while(!x.vazio() || !y.vazio()) {
            if (!x.vazio() && !y.vazio()) {
                if (x.primeiro.info > y.primeiro.info)
                    z.insererOrdenado(y.retiraPrimeiro());
                else 
                    z.insererOrdenado(x.retiraPrimeiro());
            } else {
                if (x.vazio())
                    z.insererOrdenado(y.retiraPrimeiro());
                else
                    z.insererOrdenado(x.retiraPrimeiro());
            }
        }
    }
}