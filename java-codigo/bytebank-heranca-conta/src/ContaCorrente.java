
public class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override //é importante utilizar o override para o compoilador saber qua intenção é de sobrescrever o método
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

}
