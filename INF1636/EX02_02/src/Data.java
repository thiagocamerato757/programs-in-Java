public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int i, int i1, int i2) {
        setDia(i);
        setMes(i1);
        setAno(i2);
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int get(int e){
        if(e == 1){
            return getDia();
        }else if(e == 2){
            return getMes();
        }else if(e == 3){
            return getAno();
        }
        return -1;
    }

    public String getString() {
        return Integer.toString(getDia())+"/"+Integer.toString(getMes())+"/"+Integer.toString(getAno());
    }
}
