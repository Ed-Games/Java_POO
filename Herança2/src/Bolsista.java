public class Bolsista extends Aluno {
    //atributo:
    private Float bolsa;

    // Métodos expecias:

    public Float getBolsa() {
        return bolsa;
    }

    public void setBolsa(Float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "Nome='" + getNome() + '\'' +
                "Idade='" + getIdade() + '\'' +
                "Sexo='" + getSexo() + '\'' +
                "matricula=" + getMatricula() +
                ", curso='" + getCurso() + '\'' +
                "bolsa=" + bolsa +
                '}';
    }

    //métodos abstratos:

    public void renovarBolsa(){
        System.out.println("Renovado!");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de R$ 80,00");
    }
}

