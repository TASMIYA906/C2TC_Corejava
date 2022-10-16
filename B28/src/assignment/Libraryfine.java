package assignment;
import java.util.Scanner;


public class Libraryfine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fine=new Scanner(System.in);
        System.out.println("Enter the days you returned the books late :");
        int days=fine.nextInt();
        if(days>0&&days<=5)
        System.out.println("The fine is :"+days*1);
        else if(days>5&&days<=10)
        System.out.println("The fine is :"+days*5);
        else
         System.out.println("The fine is :"+days*10);
    
	}

}
