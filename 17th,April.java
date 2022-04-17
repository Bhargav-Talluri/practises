package PracticeProblems;
import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		
		//Displaying multiplication table using for loop
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		System.out.println("Here is the multiplication table:");
		for(int i = 1;i<=10;i++) {
			
			System.out.println(n+" * "+i+" = "+ n*i);
		}
		
		

	}

} 


package PracticeProblems;

import java.util.*;
public class problem2 {

	public static void main(String[] args) {
		// Sum of upto n numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		int sum=0;
		
		System.out.println("sum of integers upto "+n+" is:");
		for(int i =1;i<=n;i++) {
			
			sum = sum+i;
			
			
		}
		
		System.out.println(sum);

	}

}



package PracticeProblems;
import java.util.*;
public class problem3 {
	
	public static void main(String[] args) {
		
		// factorial of a number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		int factorialOfn = 1;
		
		System.out.println("factorial of the number is :");
		for(int i=n;i>0;i--) {
			
			factorialOfn = factorialOfn*i;
			
		}
		System.out.println(factorialOfn);
	}
}


package PracticeProblems;
import java.util.*;
public class problem4 {

	public static void main(String[] args) {
		// To find if the given number is positive or negative
			 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println(n+" is a positive integer");
		}else if(n<0){
			
			System.out.println(n+" is a negative integer");
		}else
			System.out.println("its 0");
	}

}


package PracticeProblems;
import java.util.*;
public class problem5 {

	public static void main(String[] args) {
		//even or odd
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		if(n>0) {
			if(n%2 == 0) {
				System.out.println(n+" is even");
			}else{
				System.out.println(n + " is odd");
			}
		}else
			System.out.println("enter a valid number");

	}

}



package PracticeProblems;
import java.util.*;
public class problem6 {

	public static void main(String[] args) {
		// sum of numbers in a given range
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1:");
		int n1 = sc.nextInt();
		System.out.println("enter number2:");
		int n2 = sc.nextInt();
		
		int sum = 0;
		
		System.out.println("sum of numbers between " +n1+ " and "+n2+" is:");
		for(int i = n1 ; i <= n2 ; i++){
			sum = sum+i;
		}
		 
		System.out.println(sum);
		

	}

}


package PracticeProblems;
import java.util.*;
public class problem7 {

	public static void main(String[] args) {
		// greatest of two numbers
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1 +" is greater than " +n2);
		}else if(n2>n1) {
			System.out.println(n2 +" is greater than " +n1);
			}else
				System.out.println("both numbers are equal");
			
		
		

	}

}



package PracticeProblems;
import java.util.*;
public class problem8 {

	public static void main(String[] args) {
		// greatest of three numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number1:");
		
		int n1 = sc.nextInt();
		System.out.println("enter the number2:");
		int n2 = sc.nextInt();
		System.out.println("enter the number3:");
		int n3 = sc.nextInt();
		
		int largestNumber ;
		
		if(n1>n2) {
			if(n1>n3) {
				largestNumber = n1;
			}else
				largestNumber = n3;
		}
		else if(n2>n3) {
			largestNumber = n2;
		}
		else
			largestNumber = n3;
		
		System.out.println(largestNumber+" is the largest number");

	}

}



package PracticeProblems;
import java.util.*;
public class problem9 {

	public static void main(String[] args) {
		// leap year or not
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year:");
		int year = sc.nextInt();

	    if (year % 400 == 0)
	       System.out.println (year + " is a Leap Year");

	    else if (year % 4 == 0 && year % 100 != 0)
	       System.out.println (year + " is a Leap Year");

	    else
	         System.out.println (year + " is not a Leap Year");	  

		
			   
			   
			 
	}

}


package PracticeProblems;
import java.util.*;
public class problem10 {

	public static void main(String[] args) {
		// prime number or not
		
		var sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		boolean isPrime = true;
		
		
		if(n>2) {
			for(int i = 2;i<n;i++) {
			if(n%i == 0)
				isPrime = false;
			}
		}else if(n<2) {
			isPrime = false;
		}
		
		if(isPrime)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
		
		

	}

}


package PracticeProblems;
import java.util.*;

public class problem11{
	public static void main(String[] args) {
		
		// find prime numbers between two numbers
		
		var sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("enter the second number:");
		int n2 = sc.nextInt();
		
		for(int i =n1; i<n2;i++) {
			int l = 0;
			
			if(i>2) {
				for(int j=2;j<i;j++) {
					if(i%j == 0) {
						l++;
					}
					}
			}else if (i<2) {
				l = 1;
			}
			
			if(l==0) {
				System.out.println(i);
			}
		}
	}
}


package PracticeProblems;

import java.util.*;

public class problem12 {
	
	/* find prime numbers between two numbers
	   another method
	 */
	static boolean method(int n) {
		
		boolean isPrime = true;
		
		
		if(n>2) {
			for(int i = 2;i<n;i++) {
			if(n%i == 0)
				isPrime = false;
			}
		}else if(n<2) {
			isPrime = false;
		}
		
		return isPrime;
		
	}
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("enter the second number:");
		int n2 = sc.nextInt();
		
		
	
		for(int i =n1; i<n2;i++) {
			if(method(i))
				System.out.println(i);
		}
	}

}
