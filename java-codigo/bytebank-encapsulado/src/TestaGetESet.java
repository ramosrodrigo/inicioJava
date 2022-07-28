public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(2565, 2625);
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente rodrigo = new Cliente();
        rodrigo.setNome("rodrigo ramos");
        rodrigo.setCpf("222.222.222-22");
        rodrigo.setProfissao("programador");

        conta.setTitular(rodrigo);

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());

        conta.getTitular().setProfissao("programador junior");
        System.out.println(conta.getTitular().getProfissao());
    }
}
