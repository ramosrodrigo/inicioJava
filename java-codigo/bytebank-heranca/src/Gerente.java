// Gerente eh um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel, eh um autenticavel

public class Gerente extends Funcionario implements Autenticavel {
    // quando vc nao atribui nada ao atributos ele inicializa com 0.
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
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