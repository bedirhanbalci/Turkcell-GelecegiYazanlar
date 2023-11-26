package ifBlogu;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		  int number = -10;
		  
		  boolean result = number > 0;
		  
		  if (result) { System.out.println("Number pozitif bir sayıdır");
		  System.out.println("2."); } else {
		  System.out.println("Number negatif bir sayıdır"); }
		  
		  System.out.println("Burası her zaman çalıştırılacak");
		 */

		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz:");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("Çift sayi");
		} else {
			System.out.println("Tek sayi");
		}*/
		
		/*int number = 10;
		
		if(number < 100) {
			System.out.println("sayi 100 den kucuk");
			if (number > 50) {
				System.out.println("sayi 50 den buyuk");
			}
		}*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz:");
		int number = scanner.nextInt();
		if (number < 100 && number >= 10) {
			System.out.println("Girdiğiniz sayi 2 basamakli");
		}else if (number < 1000 && number >= 100){
			System.out.println("Girdiğiniz sayi 3 basamakli");
		}else if(number < 10000 && number >= 1000) {
			System.out.println("Girdiğiniz sayi 4 basamakli");
		}else {
			System.out.println("Girdiğiniz sayi 1 & 9999 arasinda değil");
		}
		
	}

}
