package bhagi;

public class stringBasics {

	public static void main(String[] args) {
		
		//every string you create is actually an object of the String class
		//every string constants are actually string objects
		
		String str1 = "Storm";
		String str2 = "Born";
		String str3 = str1;
		
		//to join different strings or numbers and strings we use + operator
		System.out.println(str1+str2+1718);
		
		//String Methods:
		
		int length = str1.length(); //this gives the length of the string
		boolean equals = str1.equals(str2); // this checks weather two strings are equal;
		char atIndex = str1.charAt(2);//this returns the character at the index(i)
		
		System.out.println(length+"   "+atIndex);
		System.out.print(equals);
		
	}

}

package bhagi;

public class varlengthArgs {

	static void vatest(int ...v) {
		System.out.println("NUmber of args: "+v.length+" contents: ");
		
		for(int x : v) {
			System.out.print(x + " ");
		System.out.println();
		}
	}
	
	public static void main(String ...a) {
		
		vatest();
		vatest(1,2,3,4,5,6,7);
		vatest(0,0,0,0,1);
	}
}


package OopsConcepts;

public class nestedClasses {//outerclass
	
	int i = 15;
	
	void showInnerClass() {
		innerClass legit = new innerClass();
		legit.display();
	}
	
	class innerClass {
		
		void display() {
			System.out.println("iam inner class");
			System.out.println("i can access outer outer class's vars and meths "+i);
		}
	}

}

package OopsConcepts;

public class testingNestedClass {

	public static void main(String[] args) {
		
		var pegion = new nestedClasses();
		
		pegion.showInnerClass();

	}

}
