/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

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
