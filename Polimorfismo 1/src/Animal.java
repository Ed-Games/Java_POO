public abstract class Animal {
    //atributos:

    protected Float peso;
    protected Integer idade;
    protected Integer membros;

    //métodos especias:

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }

    //métodos abstratos

    public  abstract void locomover();
    public  abstract void alimentar();
    public abstract void  emitirSom();
}
