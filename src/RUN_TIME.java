import java.util.Scanner;

public class RUN_TIME {
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		int a,b,c;
		String x;
		System.out.print("Enter a:");
		a=z.nextInt();
		System.out.println("a="+a);
		System.out.print("Enter b:");
		b=z.nextInt();
		System.out.println("b="+b);
		c=a+b;
		System.out.println("Sum="+c);
		System.out.print("Enter x:");
		x=z.next();
		System.out.println("x="+x);
	}
}
