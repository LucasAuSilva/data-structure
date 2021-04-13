public class ListaEncadeada {
    public No primeiro;
    public No ultimo;
    public int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void mostraLista() {
        No p = this.primeiro;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.proximo;
        }
        System.out.println("\n");
    }

    public boolean vazio() {
        return (this.primeiro == null);
    }

    public void inserePrimeiro(int elemento) {
        No p = new No(elemento);
        p.proximo = this.primeiro;
        if (vazio()) {
            this.primeiro = p;
            this.ultimo = p;
            this.tamanho += 1;
        } else
            this.primeiro = p;
            this.tamanho++;
    }

    public void InsereUltimo(int elemento) {
        No p = new No(elemento);
        if (vazio()) {
            this.primeiro = p;
            this.ultimo = p;
            this.tamanho += 1;
        } else {
            this.ultimo.proximo = p;
            this.ultimo = p;
            this.tamanho++;
        }
    }

    public void insererOrdenado(int elemento) {
        No novo = new No(elemento);
        if(vazio() || elemento < primeiro.info) {
            inserePrimeiro(elemento); // lista vazia ou elemento menor que o primeiro
            this.tamanho++;
        } else {
            if (elemento >= ultimo.info) { // elemento maior ou igual ao ultimo
                InsereUltimo(elemento);
                this.tamanho++;
            } else { // elemento intermediario
                No p = primeiro;
                No q = null;
                while(p.info < elemento) {
                    q = p;
                    p = p.proximo;
                }
                q.proximo = novo;
                novo.proximo = ultimo;
                this.tamanho++;
            }
        }
    }

    public void insereDepois(No no, int elemento) { // Insere o elemento info depois do nó No
        No novo = new No(elemento);
        if(vazio()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.tamanho += 1;
        } else {
            novo.proximo = no.proximo;
            no.proximo = novo;
            this.tamanho++;
        }
    }

    public int retiraPrimeiro() { // Retira o primeiro elemento da Lista e retorna o valor da info do No
        int primeiroElemento = primeiro.info;
        if(vazio()) {
            return 0;
        } else {
            No p = primeiro.proximo;
            primeiro = p;
            this.tamanho--;
            return primeiroElemento;
        }
    }

    public int retiraUltimo() { // Retira o último elemento da Lista e retorna a informação do Nó
        int ultimoElemento = ultimo.info;
        if(vazio()) {
            return 0;
        } else {
            No p = primeiro;
            No q = null;
            while(p != ultimo) {
                q = p;
                p = p.proximo;
            }
            ultimo = q;
            this.tamanho--;
            return ultimoElemento;
        }
    }

    public int retiraDepois(No no) { // Retira o elemento posterior ao nó No e retorna a sua informação
        No posterior = no.proximo;
        if(vazio()) {
            return 0;
        } else {
            no.proximo = posterior.proximo;
            this.tamanho--;
            return posterior.info;
        }
    }

    public int ultimoElemento() { // Retorna a informação do último elemento da Lista
        if(vazio()) {
            return 0;
        } else {
            this.tamanho--;
            return ultimo.info;
        }
    }  
}