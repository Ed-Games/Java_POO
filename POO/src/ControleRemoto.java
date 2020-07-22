public class ControleRemoto implements Controlador {

    //ATRIBUTOS:

    private Integer volume;
    private Boolean ligado;
    private Boolean tocando;

    //MÉTODOS ESPECIAIS:

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer volume) {
        this.volume = volume;
    }

    private Boolean getLigado() {
        return ligado;
    }

    private void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    private Boolean getTocando() {
        return tocando;
    }

    private void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    //MÉTODOS ABSTATOS:

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Ligado: "+this.getLigado());
        System.out.println("Tocando:" +this.getTocando());
        System.out.print("Volume: "+this.getVolume());
        for (Integer i=1; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) this.setVolume(this.getVolume() + 5);
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) this.setVolume(this.getVolume() - 5);
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0) this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0) this.setVolume(50);

    }

    @Override
    public void play() {
        if(this.getLigado() || !this.getTocando()) this.setTocando(true);
    }

    @Override
    public void pause() {
        if(this.getLigado() || this.getTocando()) this.setTocando(false);
    }
}
