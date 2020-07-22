import org.omg.PortableInterceptor.INACTIVE;

public class Fighter {

    //ATRIBUTOS:

    private String nome;
    private String nacionalidade;
    private  Integer idade;
    private Float altura;
    private Float peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    //CONSTRUTOR:

    public Fighter(String nome,
                   String nacionalidade,
                   Integer idade,
                   Float altura,
                   Float peso,
                   Integer vitorias,
                   Integer derrotas,
                   Integer empates)
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //MÈTODOS ESPECIAS:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(Float peso) {
        if(this.peso<52.7){
            this.categoria = "invalido";
        } else if (this.peso <=70.3){
            this.categoria = "Peso leve";
        } else if (this.peso <=83.9){
            this.categoria = "Peso médio";
        } else if (this.peso<=120.2){
            this.categoria = " Peso Pesado";
        } else {
            this.categoria = "inválido";
        }
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    //MÈTODOS EXCLUSIVOS:

    public void apresentar(){
        System.out.println("E agora com vocês o lutador " +this.nome);
        System.out.println("Ele veio direto do(a) " +this.nacionalidade);
        System.out.println("Tem " +this.idade+ " anos, com altura de "+this.altura+"m e pesando "+this.peso+"kg");
        System.out.println("Esse "+this.categoria+" é dotado de:\n"+this.vitorias+" vitórias \n" +this.derrotas+" derrotas " +
                "\ne "+this.empates+" empates");
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("È um: "+getCategoria() );
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Derrotas:" +getDerrotas());
        System.out.println("Empate: "+getEmpates());
    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }


}
