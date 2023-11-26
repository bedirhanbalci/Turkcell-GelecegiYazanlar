package diziler2;

import java.util.Arrays;
import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {

		/*
		  int[][] numbers = new int[2][3]; 
		  numbers[0][0] = 1; 
		  numbers[0][1] = 2;
		  numbers[0][2] = 3;
		  
		  numbers[1][0] = 4; 
		  numbers[1][1] = 5; 
		  numbers[1][2] = 6;
		  
		  System.out.println(Arrays.toString(numbers));
		  
		  for (int i = 0; i < 2; i++) { 
		  	for (int j = 0; j < 3; j++) {
		  System.out.println(numbers[i][j]);
		  }
		   }
		 */

		String[][] ogrenciler = new String[3][3];
		ogrenciler[0][0] = "Bedirhan";
		ogrenciler[0][1] = "Emirhan";
		ogrenciler[0][2] = "Aziz";

		ogrenciler[1][0] = "Nilüfer";
		ogrenciler[1][1] = "Büşra";
		ogrenciler[1][2] = "Süheyla";
		
		ogrenciler[2][0] = "Ahmet";
		ogrenciler[2][1] = "Mehmet";
		ogrenciler[2][2] = "Murat";
		
		for(int i = 0; i < ogrenciler.length; i++) {
			for(int j = 0; j < ogrenciler.length; j++) {
				System.out.print(i + " " + j+":");
				System.out.println(ogrenciler[i][j]);
			}
		}

	}

}
