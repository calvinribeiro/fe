import java.util.Scanner;

public class principal {
    public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);
    aluno a = new aluno();
    professor p = new professor();

        System.out.println("digite sua idade:");
        a.setIdade (sc.nextInt());

        System.out.println("digite sua nota 1 :");
        a.setNota1(sc.nextInt());

        System.out.println("digite sua nota 2:");
        a.setNota2( sc.nextInt());
        a.calcularMed();
        System.out.println("sua media é " + a.getMedia());



    }
}
