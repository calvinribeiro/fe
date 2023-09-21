public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("joao", 22);
        Aluno a = new Aluno ("pedro",22, 2334);
        Professor prof = new Professor("erivaldo",35, 2599 );


        System.out.println("nome do aluno: " + a.getNome() + " ,idade : " + a.getIdade() + " ,matricula: " + a.getMatricula());
        System.out.println("nome do professor: " + prof.getNome() + " ,idade : " + prof.getIdade() + " ,salario: " + prof.getSalario());

    }
}
