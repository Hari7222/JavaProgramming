package Class_Program; 
import java.util.Scanner;
public class Spy_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,rem,sum=0,x=1;
		
		System.out.println("Enter a:");
		a=s.nextInt();
		int z=a;
		while(a>0) {
			rem=a%10;
			sum=sum+rem;
			x=x*rem;
			a=a/10;
		}
		if(sum==x)
			System.out.println(z +" is a spy num");
		else
		    System.out.println(z +" is not a spy num");
	}

}
