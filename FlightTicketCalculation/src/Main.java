import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
		 * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
		 * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
		 * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
		 * aşağıdaki indirimleri uygulayın ;
		 * 
		 * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
		 * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
		 * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir. Kişi 12 yaşından
		 * küçükse bilet fiyatı üzerinden %50 indirim uygulanır. Kişi 12-24 yaşları
		 * arasında ise bilet fiyatı üzerinden %10 indirim uygulanır. Kişi 65 yaşından
		 * büyük ise bilet fiyatı üzerinden %30 indirim uygulanır. Kişi
		 * "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim
		 * uygulanır.
		 */
		// normalAmount discountAmount /*TypeOfTripAmount*/
		int km, age, typeOfTrip;
		double nAmount = 0, dAmount = 0, aAmount = 0/* ageAmount */, tAmount = 0, totalAmount = 0;

		Scanner inp = new Scanner(System.in);
		System.out.print("Write down how many kilometers the passenger will travel: ");
		km = inp.nextInt();
		System.out.print("How old is the passenger?: ");
		age = inp.nextInt();
		System.out.print("Please enter the type of travel: (1 => One Direction " + ", 2 => Departure and Return): ");
		typeOfTrip = inp.nextInt();

		if (km > 0 && age > 0 && (typeOfTrip == 1 || typeOfTrip == 2)) {

		} else {
			System.out.println("You Entered Wrong Data!");
		}

		nAmount = km * 0.1;

		if (age < 12) {
			dAmount = nAmount * 0.5;
			aAmount = nAmount - dAmount;
			if (typeOfTrip == 2) {
				tAmount = aAmount * 0.2;
				totalAmount = (aAmount - tAmount) * 2;
			} else {
				totalAmount = aAmount;
			}

		} else if (age >= 12 && age <= 24) {
			dAmount = nAmount * 0.1;
			aAmount = nAmount - dAmount;
			if (typeOfTrip == 2) {
				tAmount = aAmount * 0.2;
				totalAmount = (aAmount - tAmount) * 2;
			} else {
				totalAmount = aAmount;
			}
		} else if (age > 65) {
			dAmount = nAmount * 0.3;
			aAmount = nAmount - dAmount;
			if (typeOfTrip == 2) {
				tAmount = aAmount * 0.2;
				totalAmount = (aAmount - tAmount) * 2;
			} else {
				totalAmount = aAmount;
			}
		} else if (age > 24 && age <= 65) {
			nAmount = km * 0.1;
			if (typeOfTrip == 2) {
				tAmount = nAmount * 0.2;
				totalAmount = (nAmount - tAmount) * 2;
			}else {
				totalAmount = nAmount;
			}

		}

		// System.out.println("Total: " + aAmount);
		System.out.println("Total: " + totalAmount);
	}
}
