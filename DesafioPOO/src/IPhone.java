public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo a página: " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

}
