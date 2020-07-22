public class Aluno extends Pessoa {
    //Atributos:
    protected Integer matricula;
    protected String curso;

    //Métodos especiais:

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + getNome() + '\'' +
                "Idade='" + getIdade() + '\'' +
                "Sexo='" + getSexo() + '\'' +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }

    //Métodos abstratos

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de  R$ 150,00 do aluno: " +this.nome);
    }
}
