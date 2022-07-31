public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario novofuncionario = new Gerente();
        novofuncionario.setNome("rodrigo");
        novofuncionario.setCpf("222-222-222-22");
        novofuncionario.setSalario(2600.00);

        System.out.println(novofuncionario.getNome());
        System.out.println(novofuncionario.getBonificacao());

    }
}
