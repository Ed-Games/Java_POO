public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews() +1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(Integer nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(Float percent){
        Integer total=0;
        if (percent <=20){
            total = 3;
        } else if(percent >=50){
            total = 5;
        } else if(percent <=90){
            total=8;
        } else{
            total=10;
        }

        this.filme.setAvaliacao(total);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
