public class Conta {
    // deixando o atributo privado:
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    // construtor:
    //public Conta(){
    //} esse construtor é construido automaticamente quando vc não inicia ele pessoalmente

    public Conta(int agencia, int numero){
        Conta.totalDeContas++;
        System.out.println("o totalDeContas de contas é " + totalDeContas);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero + " e agencia " + this.agencia);
    }

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
    // GET para buscar, consultar
    // SET para modificar, alterar

    public double getsaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("não pode valor menor igual a 0");
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

// dentro de um metodo estatico não existe o THIS:
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
}
