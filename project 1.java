/******************************************************************************

Create a program that accepts indefinite amount of integer and stores it in a array. 
The program should accept integer endlessly until the user provides -1 as a input. 
Display all the number stored, size of the array.

*******************************************************************************/
import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);  
	    ArrayList inputValues = new ArrayList();
	    
	    int inputValue;
		
		//infinite loop until the user provides -1 as a input
		while(true){
		    inputValue= sc.nextInt(); 
		    if(inputValue == -1){
		        break;
		    }else{
		        //to store the values entered by the user 
		        inputValues.add(inputValue);
		        
		    }
		    
		    
		}
		//input array
		System.out.println(inputValues);
		// size of the input array
		System.out.println(inputValues.size());
		
		
		
		
	}
}
