public class Fila {

    // atributos
    private int[] dado;
    private int primeiro;
    private int ultimo;
    public int max;
    public int tamanho;

    // construtor
    public Fila(int tamanho) {
        this.primeiro = 0;
        this.ultimo = -1;
        this.dado = new int[tamanho];
        this.max = tamanho;
        this.tamanho = 0;
    }

    // metodos
    public boolean cheia() {
        return (this.tamanho == this.max);
    }

    public boolean vazio() {
        return (this.tamanho == 0);
    }

    public boolean inserir(int e) {
        if (cheia())
            return false;
        else {
            this.ultimo++;
            if (this.ultimo == max)
                ultimo = 0;
            this.tamanho++;
            this.dado[this.ultimo] = e;
            return true;
        }
    }

    public int remove() {
        int oldElement = -1;
        if (vazio())
            return oldElement;
        else {
            oldElement = this.dado[this.primeiro];
            this.dado[this.primeiro] = 0;
            this.primeiro++;
            if (this.primeiro == max)
                this.primeiro = 0;
            this.tamanho--;
            return oldElement;
        }
    }

    public int primeiro() {
        if (vazio())
            return -1;
        return this.dado[this.primeiro];
    }

    public int ultimo() {
        if (vazio())
            return -1;
        return this.dado[this.ultimo];
    }

    public void imprimir() {
        System.out.print("\n[ ");
        for (int e : this.dado) {
            System.out.print(" " + e + " ");
        }
        System.out.print(" ]\n");
    }

}