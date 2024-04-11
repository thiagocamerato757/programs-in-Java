public class Socio {
    private String nome;
    private String endereco;
    private String dtNasc;
    private int matric;
    public Socio(int x){
        matric = x;
    }
    public String getEndereco() {
        return endereco;
    }

    public String getDtNasc() {
        return dtNasc;
    }
    public int getMatri(){
        return matric;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatric(){
        return Integer.toString(matric/10)+"-"+Integer.toString(matric%10);
    }
}
