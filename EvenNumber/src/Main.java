import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan
		 * programı yazıyoruz.
		 * 
		 * Ödev Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
		 * tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
		 */
		int number, counter=0,total=0;
		double average;
		Scanner inp = new Scanner(System.in);
		System.out.print("Please enter the a number: ");
		number = inp.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				total += i;
				counter++;
			}
		}
		average= total/counter;
		System.out.println("Numbers divisible by 3 and 4: " + average);

	}

}
