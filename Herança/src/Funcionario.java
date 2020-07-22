public class Funcionario extends Pessoa{
    //ATRIBUTOS:
    private String  setor;
    private Boolean trabalhando;

    //CONSTRUTOR:

    public Funcionario(String nome, Integer idade, String sexo,String setor,Boolean trabalhando) {
        super(nome, idade, sexo);
        this.setTrabalhando(trabalhando);
        this.setSetor(setor);
    }

    @Override
    public String toString() {
        return "Funcionario:\n" +
                "Nome=" + getNome() +
                "\nIdade=" + getIdade() +
                "\nsexo=" + getSexo() +
                "\nsetor=" + setor  +
                " \ntrabalhando=" + trabalhando;
    }

    //MÈTODOS ESPECIAIS:

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //MÈTODOS ABSTRATOS:
    public void mudarTrabalho(){
        this.setTrabalhando(! this.getTrabalhando());
    }
}
