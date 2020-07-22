public abstract class Pessoa {
    protected String nome;
    protected Integer idade;
    protected Character sexo;
    protected Integer xp;

    public Pessoa(String nome, Integer idade, Character sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.xp = 0;
    }

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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    protected void ganharXP(){
        this.setXp(this.getXp()+1);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", xp=" + xp +
                '}';
    }
}
