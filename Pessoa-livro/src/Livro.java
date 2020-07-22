import java.util.Random;

public class Livro implements publicacao {
    //Atributos:
    private String titulo;
    private  String autor;
    private Integer totalPag;
    private Integer pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    //Construtor

    public Livro(String titulo, String autor, Integer totalPag, Integer pagAtual, Boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }


    //Métodos especias


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(Integer totalPag) {
        this.totalPag = totalPag;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor.getNome();
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos abstratos

    public void detalhes(){
        System.out.println("Título: " +this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de páginas: " +this.getTotalPag());
        System.out.println("Página atual: "+this.getPagAtual());
        if (getAberto()) System.out.println("esta aberto");
        else System.out.println("Não esta aberto");
        System.out.println("Leitor: " +getLeitor());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        Random folhear = new Random();
        Integer pag = folhear.nextInt(this.totalPag+1);
        this.setPagAtual(pag);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() -1);
    }
}
