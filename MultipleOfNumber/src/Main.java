import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ödev Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
		 * ekrana yazdıran programı yazıyoruz.
		 */

		int n;

		Scanner inp = new Scanner(System.in);

		System.out.print("Please enter the number: ");
		n = inp.nextInt();

		for (int i = 0; i <= n; i += 4) {
			System.out.println("Numbers that are multiples of 4: " + i);
		}
		System.out.println("");
		for(int i=0; i<=n; i+=5) {
			System.out.println("Numbers that are multiples of 5: "+ i);
		}

	}

}
