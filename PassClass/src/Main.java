import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
		 * 
		 * Geçme Notu : 55
		 * 
		 * Ödev Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya
		 * katılmasın.
		 */
		int math, physics, turkish, chemistry, music;

		Scanner inp = new Scanner(System.in);

		System.out.print("Please enter your math grade: ");
		math = inp.nextInt();
		System.out.print("Please enter your physics grade: ");
		physics = inp.nextInt();
		System.out.print("Please enter your turkish grade: ");
		turkish = inp.nextInt();
		System.out.print("Please enter your chemistry grade: ");
		chemistry = inp.nextInt();
		System.out.print("Please enter your music grade: ");
		music = inp.nextInt();

		double avarage = (math + physics + turkish + chemistry + music) / 5;

		if (avarage >= 55) {
			System.out.println("You passed the class.");

		} else {
			System.out.println("You did not pass the class.");

		}
		System.out.println("Avarage" + avarage);
	}

}
