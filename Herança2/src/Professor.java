public class Professor extends Pessoa {
    //atributos:
    private  String especialidade;
    private Float salario;

    //Métodos especiais:
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

    @Override
    public String toString() {
        return "Professor{" +
                "Nome='" + getNome() + '\'' +
                "Idade='" + getIdade() + '\'' +
                "Sexo='" + getSexo() + '\'' +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }

    //Métodos abstratos:

    public void aumento(Float valor){
        this.setSalario(getSalario() + valor);
    }
}
