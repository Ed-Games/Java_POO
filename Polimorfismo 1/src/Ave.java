public class Ave extends Animal{

    //atributos

    protected String corDaPena;

    //métodos especias:


    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    //métodos abstratos:


    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Dieta onívora");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
}
