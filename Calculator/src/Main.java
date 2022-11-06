import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// we defined the variables
		int n1, n2, select;

		// we created the Scanner class.
		Scanner inp = new Scanner(System.in);
		System.out.print("Write the first number: ");
		n1 = inp.nextInt();
		System.out.print("Write the second number: ");
		n2 = inp.nextInt();

		// We decide what action to take.
		System.out.println("1-Sum \n 2-Minus \n 3-Multiplication \n 4-Divided by");
		System.out.print("Choose: ");
		select = inp.nextInt();

		// We did four transactions.
		/*
		 * if (select == 1) { System.out.println("Sum = " + (n1 + n2)); } else if
		 * (select == 2) { System.out.println("Minius = " + (n1 - n2)); } else if
		 * (select == 3) { System.out.println("Multiplication = " + (n1 * n2)); } else
		 * if (select == 4) { if (n2 != 0) { System.out.println("Divided by = " + (n1 /
		 * n2)); }else { System.out.println("A number cannot be divided by zero."); }
		 * 
		 * } else { System.out.println("INVALID OPERATION"); }
		 */
		
		
		// We did four transactions.
		switch (select) {
		case 1:
			System.out.println("Sum = " + (n1 + n2));
			break;
		case 2:
			System.out.println("Minius = " + (n1 - n2));
			break;
		case 3:
			System.out.println("Multiplication = " + (n1 * n2));
			break;
		case 4:
			if (n2 != 0) {
				System.out.println("Divided by = " + (n1 / n2));
			}else {
				System.out.println("A number cannot be divided by zero.");
			}
			break;
		default:
			System.out.println("INVALID OPERATION");
			break;
		}

		System.out.println("\nThe proram is over.");
	}

}
