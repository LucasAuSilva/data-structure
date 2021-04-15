
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
        }
        result = (nume/denom);

        return result;
    }

    public void thirdList(ListaEncadeada x, ListaEncadeada y, ListaEncadeada z) {
        No py;
        No px = x.primeiro;
        No qx = null;
        while (px != null) {
            py = y.primeiro;
            while (py != null) {
                if (px.info == py.info) {
                    if (px == x.primeiro)
                        z.insererOrdenado(x.retiraPrimeiro());
                    z.insererOrdenado(x.retiraDepois(qx));
                    break;
                }
                py = py.proximo;
            }
            qx = px;
            px = px.proximo;
        }
    }
}