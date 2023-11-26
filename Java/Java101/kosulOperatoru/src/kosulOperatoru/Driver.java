package kosulOperatoru;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yaşınız:");
		int age = scanner.nextInt();
		
		// koşul operatoru 3 tane operanda ihtiyaç duymaktadır.
		// koşulun kendisi, true olması durumundaki değeri ve false olması durumundaki değeri
		// koşul sağlanıyorsa soru işaretinden sonraki ilk kısım çalıştırılır.
		// koşul sağlanmıyorsa iki noktadan sonra olan kısım çalıştırılır.
		System.out.println(age >= 18 ? "Ehliyet Alabilirsiniz." : "Ehliyet Alamazsınız!");

	}

}
