public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(3,4);
        Vetor v2 =new Vetor(7,6);
        v1.exibe();
        v2.exibe();
        Vetor v3 = Vetor.soma(v1,v2);
        v1.soma(v2);
        v1.exibe();
        v3.exibe();

    }
}