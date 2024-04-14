package Voo;
public class Voo {
    private int nFila;
    private Assento assentos [][];
    private int nAssentos;
    public Voo(int nf,int na) {
        char as;
        nFila = nf;
        nAssentos = na;
        assentos = new Assento[nf][na]; //alocação dinâmica da matriz
        for (int i = 0; i < nf; i++) {
            as = 'A';
            for (int j = 0; j < na; j++) {
                assentos[i][j] = new Assento(i + 1, as);
                as++;
            }

        }
    }
    public void imprimeMapa() {

        System.out.printf("     ");
        for(int j = 0;j < nAssentos;j++)
            System.out.printf("%c ",'A'+j);

        for(int i = 0;i < nFila;i++) {
            System.out.println();
            System.out.printf("%02d - ",i+1);
            for(int j = 0;j < nAssentos;j++)
                if(assentos[i][j].getEstado())
                    System.out.printf("L ");
                else
                    System.out.printf("X ");
        }
    }

    public boolean reserva(int f,char a) {
        int i=f-1;
        int j=a-'A';

        if(f < 0 || f > nFila)
            return false;
        if(j < 0 || j > nAssentos-1)
            return false;

        if(!assentos[i][j].getEstado())
            return false;

        assentos[i][j].reserva();
        return true;
    }

}
