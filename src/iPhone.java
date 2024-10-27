public class iPhone implements MusicaPlayer, Telefone, WebBrowser {
    private String modelo;
    private String versao;

    public iPhone(String modelo, String versao) {
        this.modelo = modelo;
        this.versao = versao;
    }

    // Implementação de MusicalPlayer
    @Override
    public void playMusica() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pauseMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Avançando para a próxima faixa.");
    }

    // Implementação de telefone
    @Override
    public void ligacao(String numeroTelefone) {
        System.out.println("Ligando para " + numeroTelefone + "");
    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Chamada encerrada.");
    }

    // Implementação de WebBrowser
    @Override
    public void abrirUrl(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando a página atual.");
    }
}
