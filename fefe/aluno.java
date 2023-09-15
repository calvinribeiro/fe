public class aluno extends  pessoa{
    private int nota1;
    private int nota2;
    private double media;

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public void calcularMed(){
        media = (nota1 + nota2 ) / 2;
    }

    public double getMedia() {
        return media;

    }
}
