
public class Main {

    public static void main(String[] args) {

        double result;
        
        CalculoSimilaridade c = new CalculoSimilaridade();
        ListaEncadeada x = new ListaEncadeada();
        ListaEncadeada y = new ListaEncadeada();
        ListaEncadeada z = new ListaEncadeada();

        x.inserePrimeiro(12);
        x.insererOrdenado(20);
        x.insererOrdenado(40);

        y.inserePrimeiro(12);
        y.insererOrdenado(20);
        y.insererOrdenado(40);

        x.mostraLista();
        y.mostraLista();
        result = c.calculo(x.primeiro, y.primeiro);
        System.out.println(result);

    }
}