public class Reptil extends Animal {
    //atributos

    protected String corDaEscama;

    //métodos especiais


    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    //métodos abstratos


    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Dieta onívora");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
}
