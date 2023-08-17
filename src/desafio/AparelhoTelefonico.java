package desafio;
public class AparelhoTelefonico {
    //Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
    private String telefone;
    
    public void ligar(String telefone){
        System.out.println("Ligando para " + telefone);
    }
    
    public void atender(){
        System.out.println("Atendendo chamada");
    }
    
    public void iniciarCorreioVoz(){
        System.out.println("Enviando recado");
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String nome) {
        this.telefone = telefone;
    }  
}
