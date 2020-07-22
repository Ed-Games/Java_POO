public class Gafanhoto  extends  Pessoa{
    private String login;
    private Integer total_assistido;

    public Gafanhoto(String nome, Integer idade, Character sexo, String login) {
        super(nome, idade, sexo);
        this.login=login;
        this.total_assistido=0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotal_assistido() {
        return total_assistido;
    }

    public void setTotal_assistido(Integer total_assistido) {
        this.total_assistido = total_assistido;
    }

    public void viuMaisUm(){
        this.setTotal_assistido(this.getTotal_assistido()+1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", total_assistido=" + total_assistido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", xp=" + xp +
                '}';
    }
}
