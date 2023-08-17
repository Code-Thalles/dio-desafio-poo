package desafio;
public class ReprodutorMusical {
    //Repodutor Musicial: tocar, pausar, selecionarMusica
    private boolean play;
    private String musica;
    
    public void tocar(){
        if(!play){
            setPlay(true);
            System.out.println("Estou tocando a música");
        }
    }
    
    public void pausar(){
        if(play){
            setPlay(false);
            System.out.println("Música pausada");
        }
    }
    
    public void selecionarMusica(String musica){
        setPlay(true);
        System.out.println("Estou tocando a musica " + musica);
    }

    public boolean isPlay() {
        return play;
    }
    public void setPlay(boolean play) {
        this.play = play;
    }

    public String getMusica() {
        return musica;
    }
    public void setMusica(String musica) {
        this.musica = musica;
    }
}
