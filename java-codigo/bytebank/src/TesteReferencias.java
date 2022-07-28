public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.saldo = 300;
        System.out.println("saldo da primeira conta é " + primeirConta.saldo);

        Conta segundConta = primeirConta;
        System.out.println("saldo da segunda conta é " + segundConta.saldo);

        segundConta.saldo += 100;
        System.out.println("saldo da ssegunda conta é " + segundConta.saldo);

        System.out.println(segundConta.saldo);

        System.out.println(primeirConta);
        System.out.println(segundConta);
    }
}
