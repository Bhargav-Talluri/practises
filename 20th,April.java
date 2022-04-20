package OopsConcepts;

public class recursion {

	public static void main(String[] args) {
		
		var Recursion = new recursionTesting();
		
		Recursion.factorial(5);

	}

}
package OopsConcepts;

public class recursionTesting {
	
	int factorial(int i){
		
		int result;
		
		if (i==1) return 1;
		result = factorial(i-1)*i;
		System.out.println(result);
		return result;
				
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

package OopsConcepts;

public class UseStatic {
	static int a = 50;
	static int b = 100;
	
	static void meth() {
		System.out.println("a = "+a);
	}
}
package OopsConcepts;

public class TestingStatic {

	public static void main(String[] args) {
		
		//can access static methods without creating any object
		// syntax :-  classname.method();
		
		UseStatic.meth();
		
		// can access static variables without creating any object
		//syntax :- classname.var;
		
		System.out.println("b= "+UseStatic.b);

	}

}
