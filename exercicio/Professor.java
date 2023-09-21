public class Professor extends Pessoa {
    private int salario;

    public Professor(String nome, int idade, int salario) {
        super(nome, idade);
        this.salario = salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }
}
