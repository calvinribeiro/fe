
public class main {
    public static void main(String[] args) {
        leao l = new leao("mamifero","patas", "juba");
        arara a = new arara("aves", "garras", 6);

        System.out.println("info da arara");
        System.out.println(a.getClasse());
        System.out.println(a.getLocomocao());
        System.out.println(a.getQtdovos());

        System.out.println("informacoes do leao");
        System.out.println(l.getClasse());
        System.out.println(l.getPelo());
    }


}
