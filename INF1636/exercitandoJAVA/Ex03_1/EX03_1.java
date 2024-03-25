package Ex03_1;

public class EX03_1{
	public static void main(String[]args) {
		Vetor v1,v2;
		v1 = new Vetor(3.0,4.0);
		v2 = new Vetor(7.0,6.0);
		v1.exibe();
		v2.exibe();
		Vetor v3;
		v3 = Vetor.soma(v1,v2);
		v3.exibe();
	}
}