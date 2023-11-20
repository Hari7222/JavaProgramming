package Class_Program;
import java.util.Scanner;
public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int a=0,b=1,c,n;
        System.out.println("Enter total no. of generation:");
        n=s.nextInt();
        System.out.print(a+" "+b+" ");
        //b=s.nextInt();
        for(int i=2;i<=n;i++)
        {
        	c=a+b;
        	System.out.print(c+" ");
        	a=b;
        	b=c;        	
        }
	}

}
