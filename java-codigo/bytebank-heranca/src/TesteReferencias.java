public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("marcos");
        g1.setSalario(5000.0);

        EditorDeVideo editorVideo = new EditorDeVideo();
        editorVideo.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleDeBonificacao controle = new ControleDeBonificacao();
        controle.registra(g1);
        controle.registra(editorVideo);
        controle.registra(d);

        // essa soma é juntando o total das bonificaçoes dos funcionarios juntos
        System.out.println(controle.getSoma());
    }
}
