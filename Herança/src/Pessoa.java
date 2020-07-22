public class Pessoa {
    //Atributos:
    private String nome;
    private Integer idade;
    private String sexo;

    //Construtor:

    public Pessoa(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa:" +
                "nome=" + nome + '\'' +
                "idade=" + idade +
                "sexo=" + sexo ;
    }

    //Métodos especias:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Métodos abstratos:

    public void fazerAniversario(){
        this.setIdade(getIdade()+1);
    }
}
