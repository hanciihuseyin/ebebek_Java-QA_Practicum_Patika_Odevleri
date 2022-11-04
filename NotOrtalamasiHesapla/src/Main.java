import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Değişkenleri oluştur
		int mat, fizik, kimya, turkce, tarih, muzik;

		// scanner sınıfımızı tanımladık.
		Scanner inp = new Scanner(System.in);

		// kullanıcıdan değerleri al

		System.out.print("Matematik Notunuz:");
		mat = inp.nextInt();

		System.out.print("Fizik Notunuz:");
		fizik = inp.nextInt();

		System.out.print("Kimya Notunuz:");
		kimya = inp.nextInt();

		System.out.print("Turkce Notunuz:");
		turkce = inp.nextInt();

		System.out.print("Tarih Notunuz:");
		tarih = inp.nextInt();

		System.out.print("Müzik notunuz:");
		muzik = inp.nextInt();

		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double ortalama = toplam / 6;

		System.out.println("Ortalamanız: " + ortalama);

		String sonuc = ortalama > 60 ? "Geçti" : "Kaldı";
		System.out.println(sonuc);
	}

}
