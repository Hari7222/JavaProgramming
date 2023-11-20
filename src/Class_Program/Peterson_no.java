package Class_Program;
import java.util.Scanner;
public class Peterson_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,temp,fact,out=0;
		System.out.println("Enter a:");
		a=s.nextInt();
		temp=a;
		while(a>0)
		{
			b=a%10;
			fact=1;
			for(int i=b;i>=1;i--) {
				fact=fact*i;
			}
			out=out+fact;
			a=a/10;
		}
		if(out==temp)
		{System.out.println("Peterson number");}
		else
		{System.out.println("Not a Peterson number");}
	}
}
