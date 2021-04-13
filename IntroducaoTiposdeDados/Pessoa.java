
public class Pessoa {
    // atributos
    public String nome;
    public String sobrenome;
    public int idade;
    public double salario;

    // construtor
    public Pessoa(String nome, String sobrenome, int idade, double salario) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
        setSalario(salario);
    }

    public String toString() {
        return "\nNome: " + getNome() + "\n" + "Sobrenome: " + getSobrenome() + "\n" + "Idade: " + getIdade() + "\n"
                + "Salario: " + getSalario() + "\n";
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
