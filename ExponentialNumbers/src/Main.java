import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * Ödev Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
		 * "For Döngüsü" kullanarak yapınız.
		 */
		int n,  k, total=1;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Please enter the number n: ");
		n = inp.nextInt();
		System.out.print("Please enter the number k:");
		k = inp.nextInt();
		
		for(int i =1; i<=k; i++) {
			total*=n;
		}
		System.out.println("Answer: "+ total);
	}

}
