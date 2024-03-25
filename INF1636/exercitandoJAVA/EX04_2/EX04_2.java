package EX04_2;

public class EX04_2{
	public static void main(String[]args) {
		Vetor v1,v2;
		v1 = new Vetor(4.0,9.0);
		v2 = v1.Clone();
		System.out.println(v1.toString());
		System.out.println(v2.toString());
	}
}