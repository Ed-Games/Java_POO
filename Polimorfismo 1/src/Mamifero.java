public class Mamifero  extends Animal{
    //atributos;

    protected String corDoPelo;

    //métodos especiais:


    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    //métodos abstratos

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Dieta onívora");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}
