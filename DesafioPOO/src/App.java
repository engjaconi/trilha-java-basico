public class App {
    public static void main(String[] args) throws Exception {
        IPhone meuIPhone = new IPhone();

        meuIPhone.selecionarMusica("Além do Rio Azul - Voz da Verdade");
        meuIPhone.tocar();
        meuIPhone.pausar();

        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("https://www.letras.mus.br/voz-da-verdade/213352/");
        meuIPhone.atualizarPagina();

        meuIPhone.ligar("1234567890");
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.atender();
    }
}
