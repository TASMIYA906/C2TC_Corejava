package assignment;
import java.util.Scanner;
public class Sumofnaturalnumbers
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int num=sc.nextInt();
	        int i,sum=0;
	        System.out.println("The natural numbers are :");
	        for(i=1;i<=num;++i)
	         sum=sum+i;
	         System.out.println(num);
	         System.out.println("The sum of natural numbers are "+sum);  
	}

}
