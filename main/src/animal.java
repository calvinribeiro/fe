public class animal {
    protected String classe;
    protected String locomocao;

    public animal (String classe, String locomocao) {
        this.classe = classe;
        this.locomocao = locomocao;
    }
    public void setClasse (String classe) {
        this.classe = classe;
    }
    public String getClasse() {
        return classe;
    }
    public void setLocomocao (String locomocao) {
        this.locomocao = locomocao;
    }
    public String getLocomocao() {
        return locomocao;
    }


}
