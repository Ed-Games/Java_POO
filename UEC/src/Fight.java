import java.util.Random;

public class Fight {

    //ATRIBUTES:

    private Fighter challenger;
    private Fighter challenged;
    private Integer rounds;
    private Boolean authorization;


    // SPECIAL METHODS

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Boolean authorization) {
        this.authorization = authorization;
    }

    //ABSTRACTS METHODS:

    public void markFight(Fighter f1, Fighter f2){
        if((f1.getCategoria() == f2.getCategoria()) && f1.getNome() != f2.getNome()){
                this.setAuthorization(true);
                this.setChallenger(f1);
                this.setChallenged(f2);
        } else{
            this.setAuthorization(false);
            this.setChallenger(null);
            this.setChallenged(null);
        }
    };

    public void fight(){
        if(this.getAuthorization()){
            this.challenger.apresentar();
            this.challenged.apresentar();

            Random random = new Random();

            Integer winner = random.nextInt(3);

            System.out.println(winner);

            switch (winner.toString()){
                case "0":
                    this.challenger.empatarLuta();
                    this.challenger.empatarLuta();

                    System.out.println("E Temos um EMPATEEEEEEEEEEEE!!!!!!!!!!!");
                    break;

                case "1":
                    this.challenger.ganharLuta();
                    this.challenged.perderLuta();

                    System.out.println(" E o vencedor é:" +this.challenger.getNome());
                    break;

                case "2":
                    this.challenger.perderLuta();
                    this.challenged.ganharLuta();

                    System.out.println("e o vencedor é:" +this.challenged.getNome());
                    break;

                default:
                    System.out.println("ERRO");
                    break;
            }

            this.challenger.status();
            this.challenged.status();


        } else {
            System.out.println("impossivel lutar");
        }
    }
}
