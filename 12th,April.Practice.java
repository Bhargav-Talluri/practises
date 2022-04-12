//fibonacii number/

class Fibonacci{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);
    
 for(i=2;i<count;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  



//2.Reverse the number 

public class ReverseNumber  
{  
public static void main(String[] args)   
{  
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  



//3.ATM functionality 


import java.util.Scanner;  
  
 public class ATMExample  
{   
    public static void main(String args[] )  
    {  
       
        int balance = 100000, withdraw, deposit;  
          
    
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                       
        withdraw = sc.nextInt();  
                      
        if(balance >= withdraw)  
        {  
       
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        deposit = sc.nextInt();  
                      
    
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
 
        System.exit(0);  
            }  
        }  
    }  
}  




