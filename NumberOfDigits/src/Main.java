import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ödev Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
		 * 
		 * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
		 */

		int k, total = 0;
		Scanner inp = new Scanner(System.in);
		System.out.print("enter the number :");
		k = inp.nextInt();

		while (k != 0) {
			total += (k % 10);
			k /= 10;
		}
		System.out.println("Digit Sum= " + total);
	}

}
