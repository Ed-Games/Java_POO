public class Main {
    public static void main(String[] args) {
       // Pessoa pedro = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Professor p1 = new Professor();
        p1.setNome("Angela");
        p1.setIdade(24);
        p1.setSexo("F");
        p1.setSalario(10000f);
        p1.setEspecialidade("Medicina");
        System.out.println(p1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Joãozin");
        a1.setIdade(12);
        a1.setSexo("M");
        a1.setCurso("Agricultura");
        a1.setMatricula(12390127);
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setBolsa(70f);
        b1.setNome("Priscila");
        b1.setSexo("F");
        b1.setIdade(15);
        b1.setCurso("Dança");
        b1.setMatricula(147240);
        System.out.println(b1.toString());

        Tecnico t1 = new Tecnico();
        t1.setNome("Fernando");
        t1.setIdade(17);
        t1.setSexo("M");
        t1.setCurso("Robótica");
        t1.setMatricula(212244);
        t1.setRegistroProfissional("Engenheiro Mecatronico");
        System.out.println(t1.toString());
    }
}

