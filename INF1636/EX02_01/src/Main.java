public class Main {
    public static void main(String[] args) {
        Vetor vetor1 = new Vetor();
        vetor1.setX(2.0);
        vetor1.setY(4.0);
        Vetor vetor2 = new Vetor();
        vetor2.setX(8.0);
        vetor2.setY(6.0);
        System.out.println(vetor1.getX());
        System.out.println(vetor1.getY());
        System.out.println(vetor2.getX());
        System.out.println(vetor2.getY());
        System.out.println(vetor1.modulo());
        System.out.println(vetor2.modulo());
    }
}