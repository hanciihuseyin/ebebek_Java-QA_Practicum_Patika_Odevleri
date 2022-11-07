import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner. 
		 * Sıcaklık 5 ve 15 arasında ise"Sinema" etkinliğini öner. 
		 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
		 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
		 */
		int weather;
		
		Scanner inp = new Scanner(System.in); 
		
		System.out.print("Please specify the weather: ");
		weather = inp.nextInt();
		
		if(weather<5) {
			System.out.println("You can ski.");
		}else if(5<=weather && weather<=15){
			System.out.println("You can go to the cinema.");
		}else if(15<weather && weather<=25) {
			System.out.println("You can go to the picnic.");
		}else {
			System.out.println("You can go swimming.");
		}
		
		
		
	}

}
