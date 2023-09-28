public class arara extends animal {
    private int qtdovos;

    public arara(String classe, String locomocao, int qtdovos) {
        super(classe, locomocao);
        this.qtdovos = qtdovos;
    }

    public void setQtdovos(int qtdovos) {
        this.qtdovos = qtdovos;
    }

    public int getQtdovos() {
        return qtdovos;
    }
}
