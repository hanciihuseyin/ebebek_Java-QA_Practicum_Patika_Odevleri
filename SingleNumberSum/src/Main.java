import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
	/* Ödev
		 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
		 * kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
		 * ekrana basan programı yazıyoruz.
		 * 
		 */
		
		int n;
		int total = 0;
		
		Scanner inp = new Scanner(System.in);
		
		do {
			System.out.print("please enter the number: ");
			n = inp.nextInt();
			if(n % 4 == 0 ) {
				total+=n;
			}
			
			
		} while (n % 2 ==0);
		
		System.out.println("Total: " + total);
	}

}
