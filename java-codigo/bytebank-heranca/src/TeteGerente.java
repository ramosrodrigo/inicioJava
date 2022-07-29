public class TeteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("robson");
        gerente.setCpf("16515611");
        gerente.setSalario(5000.00);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        // defini uma sehna:
        gerente.setSenha(2222);

        //chamei o metodo de autenticacao, se a senha nao for a mesma da false
        boolean autencicacao = gerente.autentica(2222);
        System.out.println(autencicacao);

        System.out.println(gerente.getBonificacao());
    }
}
