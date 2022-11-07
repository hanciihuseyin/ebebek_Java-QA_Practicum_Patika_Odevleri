import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
		
		int n1,n2,n3;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter number one: ");
		n1 = inp.nextInt();
		System.out.print("Please enter number two: ");
		n2 = inp.nextInt();
		System.out.print("Please enter number three: ");
		n3 = inp.nextInt();
		
		if(n1<n2 && n1<n3) {
			if(n2<n3) {
				System.out.println("n1<n2<n3");
			}else {
				System.out.println("n1<n3<n2");
			}
		}else if(n2<n3 && n2<n1) {
			if(n3<n1) {
				System.out.println("n2<n3<n1");
			}else {
				System.out.println("n2<n1<n3");
			}
		}else if(n3<n1 && n3<n2) {
			if(n1<n2) {
				System.out.println("n3<n1<n2");
			}else {
				System.out.println("n3<n2<n1");
			}
		}

	}

}
