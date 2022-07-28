public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaJulia = new Conta();
        System.out.println(contaDaJulia.getsaldo());

        contaDaJulia.titular = new Cliente();
        contaDaJulia.titular.nome = "julia";

        System.out.println(contaDaJulia.titular.nome);


    }
}
