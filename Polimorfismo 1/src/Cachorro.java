public class Cachorro extends Mamifero {
    //métodos abstratos:
    public void enterrarOsso(){
        System.out.println("enterrando...");
    }

    public void abanarRAbo(){
        System.out.println("abanando...");
    }

    @Override
    public void emitirSom(){
        System.out.println("au au au");
    }
}
