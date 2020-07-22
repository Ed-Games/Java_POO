public class Main {
    public static void main(String[] args) {
        Fighter fighter[] = new Fighter[6];

        fighter[0] = new Fighter("Pretty Boy","França",31,1.75f,68.9f,11,3,1);

        fighter[1] = new Fighter("Putscript","Brasil",29,1.68f,57.8f,14,2,3);

        fighter[2] = new Fighter("SnapShadow","EUA",35,1.68f,80.9f,12,2,1);

        fighter[3] = new Fighter("Dead Code","Australia",28,1.93f,81.6f,13,0,2);

        fighter[4] = new Fighter("UFO Cobol","Brasil",37,1.70f,119.3f,5,4,3);

        fighter[5] = new Fighter("Neardaart","EUA",30,1.81f,105.7f,12,2,4);

        /*for(int i=0;i<=5;i++) {
            System.out.println("----");
            fighter[i].status();
            System.out.println("----");
        }*/

        Fight firstFight = new Fight();

        firstFight.markFight(fighter[2],fighter[3]);
        firstFight.fight();
    }
}
