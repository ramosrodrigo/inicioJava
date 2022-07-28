public class TestaBanco {
    public static void main(String[] args) {
        Cliente rodrigo = new Cliente();
        rodrigo.nome = "rodrigo ramos";
        rodrigo.cpf = "222.222.222-22";
        rodrigo.profissao = "programador";

        Conta contaDoRodrigo = new Conta();
        contaDoRodrigo.deposita(100);

        // associa o cliente rodrigo a conta contaDoRodrigo
        contaDoRodrigo.titular = rodrigo;
        System.out.println(contaDoRodrigo.titular.nome);
    }
}
