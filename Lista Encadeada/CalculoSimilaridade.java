

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

    public void thirdList(No x, No y, ListaEncadeada z) {
        while (x != null && y != null) {
            if (x.info == y.info)
                z.insererOrdenado(x.info);
            x = x.proximo;
            y = y.proximo;
        }
    }
}