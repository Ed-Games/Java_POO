public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("au! au! au!");
    }

    public void reagir(String frase){
        if (frase.equals("toma comida") || frase.equals("oi")){
            System.out.println("abanando e latindo");
        } else{
            System.out.println("rosnando e latindo");
        }
    }

    public void reagir(Integer hora){
        if(hora<12){
            System.out.println("abanar");
        } else if (hora>18){
            System.out.println("ignorar");
        } else {
            System.out.println("abanar e latir");
        }
    }

    public void reagir(Boolean dono){
        if (dono) System.out.println("abanar");
        else System.out.println("rosnar");
    }
}
