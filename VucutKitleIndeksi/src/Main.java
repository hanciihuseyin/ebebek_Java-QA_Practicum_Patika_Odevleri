import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
		 * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
		 * ekrana yazdırın.
		 */
		/*
		 * Formül 
		 * Kilo (kg) / Boy(m) * Boy(m)
		 */

		double boy, vKIndeksi ;
		int kilo;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz: ");
		boy = inp.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = inp.nextInt();
		
		vKIndeksi = kilo /( boy * boy); 
		
		System.out.print("Vücut ktle indeksiniz: " + vKIndeksi);
		
	}

}
