public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Paula",22, "F");
        Professor p2 = new Professor("George",36,"M","Biológicas",10500f);
        Aluno p3 = new Aluno("Emilly",24,"F",42382840,"Informática");
        Funcionario p4 = new Funcionario("Seu Zé",56,"M","Portaria",true);

        System.out.println("BEFORE");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        p2.aumento(2000f);
        p3.setMatr(2121212);
        p4.mudarTrabalho();

            System.out.println("AFTER");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
