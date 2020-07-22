public class Peixe extends Animal {
    //atributos
    protected String corDaEscama;

    //métodos especiais:


    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    //métodos abstratos:


    @Override
    public void locomover() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }

    public void soltarBolhas(){
        System.out.println("Soltou uma bolha");
    }
}
