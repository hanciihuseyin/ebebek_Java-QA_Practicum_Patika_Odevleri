import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * Taksimetre tutarını ekrana yazdıran program 
		 * -Taksimetre km başına 2.20 TL tutmaktadır. 
		 * -Minimum ödenecek tutar 20 TL dir. 20 TL altındaki ücretlerde
		 * yine 20 Tl alınacaktır. 
		 * -Taksimetre açılış ücreti 10 tldir.
		 */
		int aU= 10, gidilenKm;
		double km = 2.20;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		 gidilenKm = inp.nextInt();
		 
		double toplamOdeme= aU + (gidilenKm*km);
		
		toplamOdeme = (toplamOdeme < 20) ? 20 : toplamOdeme;
		
		System.out.print("Taksiciye ödenecek tutar: ");
		System.out.println(toplamOdeme);
		
		
		
		
		
		
		
	}

}
