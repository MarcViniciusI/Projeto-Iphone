public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("iPhone 14", "iOS 17");

        // Usando a funcionalidade de Reprodutor Musical
        meuiPhone.playMusica();
        meuiPhone.pauseMusica();
        meuiPhone.proximaMusica();

        // Usando a funcionalidade de Aparelho Telefônico
        meuiPhone.ligacao("819999-9999");
        meuiPhone.encerrarLigacao();

        // Usando a funcionalidade de Navegador
        meuiPhone.abrirUrl("https://web.dio.me/home");
        meuiPhone.fecharPagina();
    }
}