public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 6521);
        System.out.println(conta2.getNumero());

        System.out.println(Conta.getTotalDeContas());
    }
}
