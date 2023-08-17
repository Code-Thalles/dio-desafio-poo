package desafio;
public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico tel = new AparelhoTelefonico();
        NavegadorInternet nav = new NavegadorInternet();
        ReprodutorMusical mus = new ReprodutorMusical();
        
        tel.ligar("40028922");
        tel.iniciarCorreioVoz();
        
        System.out.println("---------");
        
        nav.adicionarNovaAba();
        nav.exibirPagina("google.com");
        nav.atualizarPagina("google.com");
        
        System.out.println("----------");
        
        mus.selecionarMusica("E.T");
        mus.pausar();
        mus.tocar();
    }
    
}
