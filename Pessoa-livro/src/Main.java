public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa( "João",15,"M");
        Livro l1 = new Livro("As Cronicas de Nárnia","C.S Lewis",750,502,true,p1);
        l1.detalhes();
        l1.getPagAtual();
        l1.folhear();
        l1.detalhes();
    }
}
