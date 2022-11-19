import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.

		String userName, password;
		int due = 5;
		int balance = 1200;
		int num;
		int vSelect = 0;
		do {
			Scanner inp = new Scanner(System.in);
			System.out.print("Please enter your user name: ");
			userName = inp.nextLine();

			System.out.print("Please enter your password:");
			password = inp.nextLine();
			if (userName.equals("hüseyinhanci") && password.equals("13579")) {
				System.out.println("Welcome to the HüseyinBank");
				do {

					System.out.println("Please select the action you want to do");
					System.out.println(
							"1-deposit process :\n" + "2-withdraw money:\n" + "3-balance inquiry:\n" + "4-Log out:");
					num = inp.nextInt();
					switch (num) {
					case 1:
						System.out.println("money quantity");
						int a = inp.nextInt();
						balance += a;
						System.out.println("your balance=" + balance);
						break;
					case 2:
						System.out.print("Enter the amount you want to withdraw");
						int b = inp.nextInt();
						if (b > balance) {
							System.out.println("insufficient balance");
							break;
						} else {
							balance -= b;
							System.out.println("your balance" + balance);
						}
						break;
					case 3:
						System.out.println("your current balance" + balance);
						break;
					case 4:
						System.out.println("Have a nice day. We are waiting for you again");

					}

				} while (num != 4);

			} else {
				due--;
				System.out.println("You entered an incorrect user or password, try again.");
				if (due == 0) {
					System.out.println("Your account has been blocked. Contact the bank");
				}
			}
		} while (due > 0 && vSelect != 1);
	}
}