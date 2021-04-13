public class Pilha {
    // atributos
    private char[] dado;
    private int topo;
    public int max;

    // metodo construtor
    public Pilha(int tam) {
        this.max = tam;
        this.dado = new char[tam];
        this.topo = -1;
    }

    // verifica se a pilha esta cheia
    public boolean cheio() {
        return (topo == max - 1);
    }

    // verifica se a pilha esta vazia
    public boolean vazio() {
        return (topo == -1);
    }

    // adiciona um elemento no topo da pilha
    public boolean empilhar(char e) {
        if (cheio()) {
            System.out.println("A pilha esta cheia");
            return false;
        } else {
            topo++;
            this.dado[topo] = e;
            return true;
        }
    }

    // remove um elemento no topo da pilha e o retorna no metodo
    public char desempilhar() {
        char oldElement;
        if (vazio()) {
            return '-';
        } else {
            oldElement = this.dado[topo];
            this.dado[topo] = '0';
            topo--;
            return oldElement;
        }
    }

    // retorna o elemento no topo da pilha
    public char topo() {
        if (vazio()) {
            return '0';
        } else {
            return this.dado[topo];
        }
    }

    public void imprimir() {
        if (vazio())
            System.out.println("A pilha esta vazia");
        else {
            for (char x : this.dado) {
                System.out.printf("%c ", x);
            }
        }
    }
}