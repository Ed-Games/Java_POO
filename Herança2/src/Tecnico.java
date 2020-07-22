public class Tecnico extends Aluno {
    //atributo:
    private String registroProfissional;
    //Métodos especias

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "Nome='" + getNome() + '\'' +
                "Idade='" + getIdade() + '\'' +
                "Sexo='" + getSexo() + '\'' +
                "registroProfissional='" + registroProfissional + '\'' +
                "matricula=" + getMatricula() +
                ", curso='" + getCurso() + '\'' +
                '}';
    }

    //Métodos abstratos

    public void praticar(){
        System.out.println("Praticando");
    }
}
