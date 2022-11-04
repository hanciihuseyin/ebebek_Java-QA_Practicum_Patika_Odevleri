import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class Main {

	public static void main(String[] args) {
		//Değişkenlerimizi oluşturalım
		int a,b;
		double c;
		//Kullanıcıdan değerleri alalım
		Scanner inp = new Scanner(System.in);
		System.out.print("1. kenarı giriniz: ");
		a = inp.nextInt();
		System.out.print("2. kenarı giriniz: ");
		b = inp.nextInt();
		
		c= Math.sqrt((a*a)+(b*b));
		System.out.print("Hipotenüs: "+ c);
		

	}

}
