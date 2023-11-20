package Class_Program;
import java.util.Scanner;
public class Tech_Num {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,x,l;
		System.out.println("Enter the number:");
		a=s.nextInt();
		String S=String.valueOf(a);//Convert int to string
		l=S.length();//shows the length of the number
		if(l==4)
		{
		b=a%100;
		c=a/100;
		x=(b+c)*(b+c);
		if(a==x)
			System.out.println(a+" is a Tech Number");
		else
			System.out.println(a+" is not a Tech Number");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
