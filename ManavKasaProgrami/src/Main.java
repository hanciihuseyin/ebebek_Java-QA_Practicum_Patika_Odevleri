import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Main {

	public static void main(String[] args) {
		/*
		 * Manav Kasa Programı Java ile kullanıcıların manavdan almış oldukları
		 * ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı
		 * yazın.
		 * 
		 * Meyveler ve KG Fiyatları
		 * 
		 * Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00
		 * TL
		 */
		// Müşterinin üründen kaç kilogram aldığını başında
		// a harfi olan değişlenlere atadım.
		double aArmut, armut = 2.14, aElma, elma = 3.67, aDomates, domates = 1.11, 
				aMuz, muz = 0.95, aPatlıcan, patlıcan = 5.00, total;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Kaç kilogram armut alındı: ");
		aArmut = inp.nextDouble();
		
		System.out.print("Kaç kilogram elma alındı: ");
		aElma = inp.nextDouble();
		
		System.out.print("Kaç kilogram domates alındı: ");
		aDomates = inp.nextDouble();
		
		System.out.print("Kaç klogram muz alındı: ");
		aMuz = inp.nextDouble();
		
		System.out.print("Kaç kilogram patlıcan alındı: ");
		aPatlıcan = inp.nextDouble();
		
		total = (aArmut*armut)+(aElma*elma)+(aDomates*domates)+(aMuz*muz)
				+(aPatlıcan*patlıcan);
		
		System.out.println("Toplam ödemeniz gereken tutar: " + total);
	}

}
