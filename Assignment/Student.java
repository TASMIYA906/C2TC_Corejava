package assignment;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner obj=new Scanner(System.in);
	    String name=obj.nextLine();
	    int age=obj.nextInt();
	    int sub1_mark=obj.nextInt();
	    int sub2_mark=obj.nextInt();
	    int sub3_mark=obj.nextInt();
	    int total=sub1_mark + sub2_mark + sub3_mark;
	    float average=total/3;
	    System.out.println("Enter the Name :"+name);
	    System.out.println("Enter the Age :"+age);
	    System.out.println("Enter the Sub1_mark:"+sub1_mark);
	    System.out.println("Enter the sub2_mark:"+sub2_mark);
	    System.out.println("Enter the sub3_mark:"+sub3_mark);
	    System.out.println("Total :"+total);
	    System.out.println("Average :"+average);

	}

}
