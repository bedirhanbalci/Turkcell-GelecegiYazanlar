package iliskiselOperatorlerLab;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		boolean sonuc = 9 != 8;
		System.out.println(sonuc);

		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();

		// System.out.println(str1 == str2); string ilkel bir tip olmadığı için böyle kullanılamaz.
		System.out.println(str1.equals(str2));
	}

}
