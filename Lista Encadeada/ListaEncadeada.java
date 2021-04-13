public class ListaEncadeada {
    public No primeiro;
    public No ultimo;
    public int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void mostra_lista() {
        No p = this.primeiro;
        while (p != null) {
            System.out.println(p.info);
            p = p.proximo;
        }
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
        } else
            this.primeiro = p;
    }

    public void InsereUltimo(int elemento) {
        No p = new No(elemento);
        if (vazio()) {
            this.primeiro = p;
            this.ultimo = p;
        } else {
            this.ultimo.proximo = p;
            this.ultimo = p;
        }
    }

    public void insererOrdenado(int elemento) {
        No novo = new No(elemento);
        if(vazio() || elemento < primeiro.info) 
            inserePrimeiro(elemento); // lista vazia ou elemento menor que o primeiro
        else {
            if (elemento >= ultimo.info) { // elemento maior ou igual ao ultimo
                InsereUltimo(elemento);
            } else { // elemento intermediario
                No p = primeiro;
                No q = null;
                while(p.info < elemento) {
                    q = p;
                    p = p.proximo;
                }
                q.proximo = novo;
                novo.proximo = ultimo;
            }
        }
    }

    public void insereDepois(No no, int elemento) { // Insere o elemento info depois do nó No
        No novo = new No(elemento);
        if(vazio()) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            novo.proximo = no.proximo;
            no.proximo = novo;
        }
    }

    public int retiraPrimeiro() { // Retira o primeiro elemento da Lista e retorna o valor da info do No
        int primeiroElemento = primeiro.info;
        if(vazio()) {
            return 0;
        } else {
            No p = primeiro.proximo;
            primeiro = p;
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
            return ultimoElemento;
        }
    }

    public int retiraDepois(No no) { // Retira o elemento posterior ao nó No e retorna a sua informação
        No posterior = no.proximo;
        if(vazio()) {
            return 0;
        } else {
            no.proximo = posterior.proximo;
            return posterior.info;
        }
    }

    public int ultimoElemento() { // Retorna a informação do último elemento da Lista
        if(vazio()) {
            return 0;
        } else {
            return ultimo.info;
        }
    }  
}