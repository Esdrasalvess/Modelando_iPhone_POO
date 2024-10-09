
public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("iPhone 12", "Preto");

        System.out.println("Testando Reprodutor Musical:");
        meuIphone.selecionarMusica("Tocando em frente");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\nTestando Aparelho Telefônico:");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\nTestando Navegador na Internet:");
        meuIphone.exibirPagina("www.youtube.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}