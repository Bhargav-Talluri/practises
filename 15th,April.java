//Multidimensional Arrays

package bhagi;

import java.util.Arrays;

public class arraytesting {

	public static void main(String[] args) {
		int twoD[][] = new int[5][5];
		int i,j;
		int k=11;
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				twoD[i][j]= k;
				k++;
			}
		}
				
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(twoD[i][j]+"  ");
				
			
		}System.out.println();
		System.out.println("");
				
		
	}
}}


// Control statements

package bhagi;

public class controlStatements {

	public static void main(String[] args) {
		int month = 4;//April
		String season;
		
		if ( month == 12 || month == 1|| month == 2)
			season = "winter";
		else if(month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if (month == 9 || month==10 || month == 11)
			season = "Autumn";
		else
			season = "Bonus month";
		
		System.out.println("April is in the "+season+".");

	}

}

