package desafio;
public class NavegadorInternet {
    //Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina
    private String link;
    
    public void exibirPagina(String link){
        System.out.println("Carregando página: " + link);
    }
    
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }
    
    public void atualizarPagina(String link){
        System.out.println("Atualizando página: " + link);
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    
    
}
