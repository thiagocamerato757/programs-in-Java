public class Main {
    public static void main(String[] args) {
        System.out.println(Matematica.pi(100000));
        //System.out.println(Matematica.obtemPi(10000)); o metodo pi() eh estatico e esta sendo
        // chamado por outro metodo nao estatico !!!! Da erro de compilacao !!!!!!
    }
    public double obtemPi(int n){
        return Matematica.pi(n);
    }
}