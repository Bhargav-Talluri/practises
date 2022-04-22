package OopsConcepts;

public class methodOverRiding {
	double dimension1;
	double dimension2;
	
	public methodOverRiding(double a, double b) {
		dimension1 = a;
		dimension2 = b;
	}


	double area() {
		System.out.println("no area");
		return 0;
	}
}

package OopsConcepts;

class rectangle extends methodOverRiding{
	rectangle(double a, double b){
		super(a,b);
	}
	
	double area(){
		return dimension1*dimension2;
	}
}

package OopsConcepts;

class triangle extends methodOverRiding{
	triangle(double a, double b){
		super(a,b);
	}
	
	double area() {
		return dimension1*dimension2/2;
	}
		
}

package OopsConcepts;

public class areasTesting {

	public static void main(String[] args) {
		var figure = new methodOverRiding(2,4);
		var rectangle = new rectangle(5,5);
		var triangle = new triangle(10,8);
		
		
		System.out.println(figure.area());
		System.out.println(rectangle.area());
		System.out.println(triangle.area());
		
		

	}

}

