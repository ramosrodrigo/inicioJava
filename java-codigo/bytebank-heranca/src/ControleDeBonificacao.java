public class ControleDeBonificacao {

    private double soma;

    // referencias de tipos de classes mais genericas referenciam objetos mais especificos:
    // Funcionario f = new Gerente();

    // sobre polimorfismo:
    // objetos ñ mudam de tipo,
    // a referenci pode mudar, ai entra o polimorfismo,
    // o polimorfismo permite usar referencias maos genericas para a comunicação coom o objeto,
    // o uso de referencias mais genericas permite desacoplar sistemas.

    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }


}
