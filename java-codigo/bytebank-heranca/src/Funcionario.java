// não pode instanciar dessa classe, porque ela eh abstrata
// nao pode usar o new

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    // metodo sem corpo nao pode haver implementação, caso nao tenha
    // o primeiro filho concreto precisa implementar esse metodo
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}