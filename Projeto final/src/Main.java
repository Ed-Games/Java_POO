public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Java Advanced - aula 00");
        v[1] = new Video("Java Advanced - aula 01");
        v[2] = new Video("Java Advanced - aula 02");

        /*System.out.println(v[0].toString());*/

        Gafanhoto g[] = new Gafanhoto[2];
        g[0]= new Gafanhoto("Pedrinho",27,'M',"pedrin@enoix");
        g[1]= new Gafanhoto("Ana",26,'F',"beautifullPrincess_14");

        Visualizacao vz[] = new Visualizacao[2];
        vz[0] = new Visualizacao(g[1],v[2]);
        vz[0].avaliar();
        System.out.println(vz[0].toString());

        vz[1] = new Visualizacao(g[1],v[1]);
        vz[1].avaliar(9);
        System.out.println(vz[1].toString());

    }
}
