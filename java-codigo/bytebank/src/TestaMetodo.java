public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);

        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conseguiuRetirar);
        System.out.println(conta.saldo);

        Conta conta2 = new Conta();
        conta2.deposita(1000);
        System.out.println(conta2.saldo);

        boolean sucessoTranferencia = conta2.trasfere(300, conta);
            if(sucessoTranferencia){
                System.out.println("tranferencia com sucesso");
            } else{
                System.out.println("faltou dinheiro");
            }
        System.out.println(conta.saldo);
        System.out.println(conta2.saldo);

        conta.titular = "rodrigo";
        System.out.println(conta.titular);
    }
}
