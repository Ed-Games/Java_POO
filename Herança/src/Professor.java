public class Professor extends Pessoa {
    //ATRIBUTOS:
    private String especialidade;
    private Float salario;

    //CONSTRUTOR:

    public Professor(String nome, Integer idade, String sexo,String especialidade,Float Salario) {
        super(nome, idade, sexo);
        this.setSalario(Salario);
        this.setEspecialidade(especialidade);
    }

    @Override
    public String toString() {
        return "Professor:\n" +
                "Nome=" + getNome() +
                "\nIdade=" + getIdade() +
                "\nSexo=" + getSexo() +
                "\nespecialidade=" + especialidade +
                " \nsalario=" + salario ;
    }

    //MÈTODOS ESPECIAS:

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    //MÈTODOS ABSTRATOS:

    public void aumento(Float valor){
        this.setSalario(this.salario + valor);
    }
}
