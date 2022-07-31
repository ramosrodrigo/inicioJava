// Gerente herda da classe funcionario, pois o gerente eh um funcionario

public class Gerente extends Funcionario {
    // quando vc nao atribui nada ao atributos ele inicializa com 0.
    private int senha;


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else{
            return false;
        }
    }

    public double getBonificacao(){
        System.out.println("Chamando o método de bonificaçao do Gerente");
        return super.getSalario();
    }

}