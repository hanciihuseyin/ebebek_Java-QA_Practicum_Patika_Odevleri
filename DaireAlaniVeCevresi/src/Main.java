import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Değişkenleri tanımlayalım

		int r;
		double pi = 3.14, alan, cevre;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Dairenin yarı çapını giriniz: ");
		r = inp.nextInt();
		
		alan = pi*r*r;
		cevre = 2*pi*r;
		
		System.out.println("Dairenin alanı: " + alan);
		System.out.println("Dairenin çevresi: " + cevre);
		
		

	}

}
