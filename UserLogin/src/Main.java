import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ödev Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını
		 * sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
		 * ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
		 * ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
		 * "Şifre oluşturuldu" yazan programı yazınız.
		 */

		// we defined the variables
		String userName, password, select;

		// we created the Scanner class.
		Scanner inp = new Scanner(System.in);
		System.out.print("Please enter your username: ");
		userName = inp.nextLine();
		System.out.print("Please enter your password: ");
		password = inp.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("You have successfully logged in.");
		} else {
			System.out.println("You entered wrong.");
			System.out.println("Would you like to reset your password? :" + " Write /Yes/ or /No/");
			select = inp.nextLine();
			if (select.equals("No")) {
				System.out.println("Please re-enter your password: ");
				password = inp.nextLine();
			} else if (select.equals("Yes")) {
				System.out.println("Please enter your new password: ");
				password = inp.nextLine();
				if (password.equals("java123")) {
					System.out.println("Please enter another password: ");
					password = inp.nextLine();
					System.out.println("The new password has been successfully created.");
				}

			}
		}

	}

}
