package Class_Program;
import java.util.Scanner;
public class GCD_LCM_Prog {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,gcd=0;
		System.out.println("Enter 2 no");
		a=s.nextInt();
		b=s.nextInt();
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		System.out.println("GCD of "+a +" and "+b+" is "+gcd);
		int lcm=(a*b)/gcd;
		System.out.printf("The LCM of %d and %d is %d",a,b,lcm);
	}
}
