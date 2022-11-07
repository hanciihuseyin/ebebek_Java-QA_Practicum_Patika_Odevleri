import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Koç Burcu : 21 Mart - 20 Nisan
		 * 
		 * Boğa Burcu : 21 Nisan - 21 Mayıs
		 * 
		 * İkizler Burcu : 22 Mayıs - 22 Haziran
		 * 
		 * Yengeç Burcu : 23 Haziran - 22 Temmuz
		 * 
		 * Aslan Burcu : 23 Temmuz - 22 Ağustos
		 * 
		 * Başak Burcu : 23 Ağustos - 22 Eylül
		 * 
		 * Terazi Burcu : 23 Eylül - 22 Ekim
		 * 
		 * Akrep Burcu : 23 Ekim - 21 Kasım
		 * 
		 * Yay Burcu : 22 Kasım - 21 Aralık
		 * 
		 * Oğlak Burcu : 22 Aralık - 21 Ocak
		 * 
		 * Kova Burcu : 22 Ocak - 19 Şubat
		 * 
		 * Balık Burcu : 20 Şubat - 20 Mart
		 * 
		 * Ödev Aynı örneği switch-case kullanmadan yapınız.
		 * 
		 */

		int day, month;

		Scanner inp = new Scanner(System.in);

		System.out.print("Please enter the day you were born: ");
		day = inp.nextInt();
		System.out.print("Please enter the month you were born: ");
		month = inp.nextInt();

		if (month == 1) {
			if (day <= 21) {
				System.out.println("Capricorn.");
			} else if (day >= 22) {
				System.out.println("Aquarius.");
			}
		} else if (month == 2) {
			if (day <= 19) {
				System.out.println("Aquarius.");
			} else if (day >= 20) {
				System.out.println("Pisces.");
			}
		} else if (month == 3) {
			if (day <= 20) {
				System.out.println("Pisces.");
			} else if (day >= 21) {
				System.out.println("Aries.");
			}
		} else if (month == 4) {
			if (day <= 20) {
				System.out.println("Aries.");
			} else if (day >= 21) {
				System.out.println("Taurus.");
			}
		} else if (month == 5) {
			if (day <= 21) {
				System.out.println("Taurus.");
			} else if (day >= 22) {
				System.out.println("Twins.");
			}
		} else if (month == 6) {
			if (day <= 22) {
				System.out.println("Twins.");
			} else if (day >= 23) {
				System.out.println("Crab.");
			}
		} else if (month == 7) {
			if (day <= 22) {
				System.out.println("Crab.");
			} else if (day >= 23) {
				System.out.println("Leo.");
			}
		} else if (month == 8) {
			if (day <= 22) {
				System.out.println("Leo.");
			} else if (day >= 23) {
				System.out.println("Virgo.");
			}
		} else if (month == 9) {
			if (day <= 22) {
				System.out.println("Virgo.");
			} else if (day >= 23) {
				System.out.println("Scales.");
			}
		} else if (month == 10) {
			if (day <= 22) {
				System.out.println("Scales.");
			} else if (day >= 23) {
				System.out.println("Scorpion.");
			}
		} else if (month == 11) {
			if (day <= 21) {
				System.out.println("Scorpion.");
			} else if (day >= 22) {
				System.out.println("Sagittarius.");
			}
		} else if (month == 12) {
			if (day <= 21) {
				System.out.println("Sagittarius.");
			} else if (day >= 22) {
				System.out.println("Capricorn.");
			}
		} else {
			System.out.println("Please enter a correct day and a correct month.");
		}

	}

}
