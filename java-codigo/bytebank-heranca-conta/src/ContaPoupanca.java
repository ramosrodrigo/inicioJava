public class ContaPoupanca extends Conta {

    // construtores nao sao herdados precisamos fazelos manualmente:
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
