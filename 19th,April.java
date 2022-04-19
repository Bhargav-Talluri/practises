//"finding the number of days between two given dates."

package PracticeProblems;
import java.util.*;
public class problem14Renewed {

	static boolean leapyear(int year) {
		boolean leap;
		if (year % 400 == 0)
		       leap = true;

		    else if (year % 4 == 0 && year % 100 != 0)
		       leap = true;

		    else
		         leap = false;
		return leap;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the start day");
		int day1 = sc.nextInt();
		System.out.println("enter the start month");
		int month1 = sc.nextInt();
		System.out.println("enter the start year");
		int year1  = sc.nextInt();
		System.out.println("enter the end day");
		int day2 = sc.nextInt();
		System.out.println("enter the end month");
		int month2 = sc.nextInt();
		System.out.println("enter the end year");
		int year2 = sc.nextInt();
		
		System.out.println("your start date is: "+day1+"/"+month1+"/"+year1);
		System.out.println("your end date is: "+day2+"/"+month2+"/"+year2);
		
		int[] numberOfDaysInaMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		int sum=0;

		for(int i = year1+1; i <year2; i++) {
			if (leapyear(i)){
				sum = sum+366;
			}else{
				sum = sum+365;
				}
	   
		}
		 //System.out.println(sum); //7305
	
			for(int k = 1; k<=month2;k++) {
				sum = sum + numberOfDaysInaMonth[k];
			}
			//System.out.println(sum); //7425
			sum = sum - ( numberOfDaysInaMonth[month2] - (day2-1)) ;
			//System.out.println(sum); //7413
			for(int p = 12 ;p>=month1;p--) {
				sum = sum + numberOfDaysInaMonth[p];
			}
			//System.out.println(sum); //7474
			sum = sum - (day1-1);   
			//System.out.println(sum);//7449
		
		
		
		
		
		
		System.out.println("The number of days between "+day1+"/"+month1+"/"+year1+" and "+day2+"/"+month2+"/"+year2+" is: "+sum);
		
		
	}

}


// Oops concept 

package OopsConcepts;

public class Box {
	double width;
	double height;
	double depth;
	
	void setDimensions(double w,double h,double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width*height*depth;
	}
	
	
}

package OopsConcepts;

public class BoxDemo {
	
	
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		mybox1.setDimensions(10, 20, 15);
		mybox2.setDimensions(3, 6, 9);
		
		//volume of firstbox
		
		System.out.println("volume is "+mybox1.volume());
		
		// volume of secondbox
		
		System.out.println("volume is "+mybox2.volume());
	}
}


// using constructor

package OopsConcepts;

public class Box {
	double width;
	double height;
	double depth;
	
	
	public Box(double w,double h,double d) {
		
		this.width = w;
		this.height = h;
		this.depth = d;
		
	}
	double volume() {
		return width*height*depth;
	}
	
	
	
}


package OopsConcepts;

public class BoxDemo {
	
	
	public static void main(String[] args) {
		Box mybox1 = new Box(10,10,10);
		Box mybox2 = new Box(3,6,9);
		
		//volume of firstbox
		
		System.out.println("volume is "+mybox1.volume());
		
		// volume of secondbox
		
		System.out.println("volume is "+mybox2.volume());
	}
}

package OopsConcepts;

public class stack {
	int stck[] = new int[10];
	int tos;

	public stack() {
		tos =-1;
	}
	
	void push(int item) {
		if(tos==9) {
			System.out.println("Stack is full");
		}else {
			stck[++tos] = item;
		}
		}
		
	int pop(){
		if(tos<0) {
			System.out.println("Stack underflow");
			return 0;
		}else {
			return stck[tos--];
		}
	}
		
	}

package OopsConcepts;

public class TestStack {

	public static void main(String[] args) {
		stack myStack1 = new stack();
		stack myStack2 = new stack();
		
		for(int i = 0 ; i<10; i++) {
			myStack1.push(i);
		}
		
		for(int i = 10;i<20;i++) {
			myStack2.push(i);
		}
		
		System.out.println("stack in mystack1:");
		for(int i = 0;i<10;i++) {
			System.out.println(myStack1.pop());
		}
		
		System.out.println("stack in mystack2:");
		for(int i = 0;i<10;i++) {
			System.out.println(myStack2.pop());
		}

	}

}

