public class Aluno extends Pessoa{
    //Atributos:
    private Integer matr;
    private String curso;

    //Construtor:
    public Aluno(String nome, Integer idade, String sexo, Integer matr,String curso) {
        super(nome, idade, sexo);
        this.setMatr(matr);
        this.setCurso(curso);
    }

    @Override
    public String toString() {
        return "Aluno:\n" +
                "Nome=" + getNome() +
                "\nIdade=" + getIdade() +
                "\nSexo=" + getSexo() +
                "\nmatr=" + matr +
                " \ncurso='" + curso;
    }

    //Métodos especias:
    public Integer getMatr() {
        return matr;
    }

    public void setMatr(Integer matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Métodos abstratos:
    public void cancelMatricula(){
        this.setMatr(null);
    }
}
