public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa( String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int Idade) {
        this.idade = idade;
    }
     public int getIdade() {
        return idade;
        }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

}
