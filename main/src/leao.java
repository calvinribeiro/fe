public class leao extends animal {
    private String pelo;

    public leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getPelo() {
        return pelo;
    }
}
