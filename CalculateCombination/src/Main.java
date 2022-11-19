import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ödev N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
		 * grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li
		 * kombinasyonu C(n,r) şeklinde gösterilir.
		 * 
		 * Java ile kombinasyon hesaplayan program yazınız.
		 * 
		 * Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
		 */

		/*
		 * int n; Scanner inp = new Scanner(System.in);
		 * System.out.print("Please enter the number: "); n = inp.nextInt(); int
		 * total=1; for(int i = 1; i<=n; i++) { total = total*i; }
		 * System.out.println("Faktöriyel:  "+ total);
		 */
		
		int n, r, total = 1, total1 = 1, total2 = 1, result;

		Scanner inp = new Scanner(System.in);
		System.out.print("Please enter the number n: ");
		n = inp.nextInt();
		System.out.print("Please enter the number r: ");
		r = inp.nextInt();
		
		if (n >= r) {

			for (int i = 1; i <= n; i++) {
				total = total * i;
			}

			for (int i = 1; i <= r; i++) {
				total1 = total1 * i;
			}
			for (int i = 1; i <= n - r; i++) {
				total2 = total2 * i;
			}
			result = total / (total1 * total2);
			System.out.println(n + " Combination of " + r + " = " + result);

		} else {
			System.out.println("You entered an incorrect number!");
		}

	}

}
