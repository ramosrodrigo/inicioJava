public class Conta {
    // deixando o atributo privado:
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else{
            return false;
        }
    }

    public boolean trasfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else{
            return false;
        }
    }
    // acessando o atributo privado:
    public double getsaldo(){
        return this.saldo;
    }
}
