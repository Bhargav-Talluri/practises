//problem 1 (on using int datatype)
package bhagi;


// Compute distance  light travels using long variables.
public class Light {
	public static void main(String[] args) {
		int lightSpeed;
		short days;
		long seconds;
		long distance;
		
		//Speed of light in miles/sec.
		lightSpeed = 1_86_000;
		days = 1000;
		seconds = days*24*60*60;
		
		//by using speed = distance/time
		distance = lightSpeed*seconds;
		
		//Output
		System.out.println("In "+days+ " days light will travel about "+distance+ " miles.");
		
	}

}


//problem2 (on using float datatype)

package bhagi;
//Calculate the area of a circle
public class area {

	public static void main(String[] args) {
		double pi,radius,area;
		pi = 3.1416;
		radius = 10.8;
		
		// area of circle = pi*r^2.
		area = pi*radius*radius;
		
		//output
		System.out.println("Area of the circle is "+area);

	}

}


