package switchBreak;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Haftanin gunu:");
		int gun = scanner.nextInt();

		switch (gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta içi");
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Yanlış değer girdiniz");
			break;
		}

	}

}
