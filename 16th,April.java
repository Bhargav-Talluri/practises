
//for loop
package bhagi;

public class forlooping {

	public static void main(String[] args) {
		
		//Test for primes
		
		int number = 13;
		boolean isPrime = true;
		
		for(int i=2; i < number;i++) {
			if(number%i == 0) {
				isPrime = false;
				break;
			}
		}
			
		if(isPrime == true  )
			System.out.println("the number "+number+" is prime");
		else
			System.out.println("the number "+number+" is not a prime number");
			
				
		
				
			
		}
		
		
	}

//for each loop
package bhagi;

public class foreachlooping {
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int x : nums) {
			System.out.println("Value is: "+x);
			sum +=x;
		}
		
		System.out.println("Sum of values = "+sum);
	}

}

//while loop

package bhagi;

public class whileLooping {

	public static void main(String[] args) {
		int n = 10;
		
		while(n>0) {
			System.out.println("Tick "+n);
			n--;
		}

	}

}


// Do while loop
package bhagi;

public class DoWhileLoopin {

	public static void main(String[] args) {
		
		int n=10;
		
		do {			
			System.out.println("tick "+n);
			n--;
		}while(n>11);

	}

}




