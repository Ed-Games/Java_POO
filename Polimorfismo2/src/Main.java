public class Main {
    public static void main(String[] args) {
        Lobo l1 = new Lobo();
        Cachorro c1 = new Cachorro();

        c1.emitirSom();
        l1.emitirSom();

        c1.reagir(true);
    }
}
