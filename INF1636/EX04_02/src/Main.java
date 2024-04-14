public class Main {
    public static void main(String[] args) {
        Vetor vet = new Vetor(3.0,7.0);
        Vetor copy = vet.clone();
        System.out.println(vet.toString());
        System.out.println(copy.toString());

    }
}