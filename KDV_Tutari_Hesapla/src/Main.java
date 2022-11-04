import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double tutar, kdvOran= 0.18, kdvTutari, kdvliTutar;
		Scanner inp = new Scanner(System.in);
		System.out.print("Ücret tutarını giriniz: ");
		tutar = inp.nextDouble();
		
		kdvTutari=tutar*kdvOran;
		kdvliTutar= tutar+kdvTutari;
		
		System.out.println("KDV' siz fiyatı: ");
		System.out.println(tutar);
		
		System.out.println("KDV' li fiyatı: ");
		System.out.println(kdvliTutar);
		System.out.println("KDV oranı: ");
		System.out.println(kdvTutari);

	}

}
