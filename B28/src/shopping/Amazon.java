package shopping;
import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
	       Amazon ob1=new Amazon();
	       ob1.display();
	       ob1.log();
	       ob1.product();
	       ob1.placeorder();
	       System.out.println("Thankyou for using our online shopping platform");
	   }
	
	void display()
	   {
	       System.out.println("Welcome to online shopping"+"\n");
	   }
	void log()
	   {
	       try
	       {
	           Scanner inpt=new Scanner(System.in);
	           System.out.println("Enter the user name :");
	           String name=inpt.nextLine();
	           System.out.println("Enter the password :");
	           var password=inpt.next();
	         
	       }
	       catch(Exception e)
	       {
	           System.out.println("Entered user name and password is in correct");
	             throw null;
	       }
	       
	   }
	void product()
	   {
	       System.out.println("search the product :");
	       Scanner att=new Scanner(System.in);
	       String color = att.nextLine();
	       System.out.println("Enter the color of product:");
	       String size = att.nextLine();
	       System.out.println("Enter the size of product:");
	       String type = att.nextLine();
	       System.out.println("Enter the type of account:");
	       String account = att.nextLine();
	       if(account.equals("Prime"))
	       {
	           System.out.println("No delivery charge"+"\n");
	       }
	       else
	       {
	           int a=90;
	           System.out.println("Delivery charge is"+a+"Rupees");
	       }
	       
	       
	   }
	void placeorder()
	{
	   Scanner order=new Scanner(System.in);
	   System.out.println("Enter the mode of payment : ");
	   String payment=order.nextLine();
	   if(payment.equals("Cash on delivery"))
	   {
	       System.out.println("pay after receiving the product");
	   }
	   else
	   {
	       System.out.println("pay through online"+"\n");
	   }



	// TODO Auto-generated method stub

	}

	}