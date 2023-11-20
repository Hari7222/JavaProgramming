package Class_Program;
import java.util.Scanner;
public class Abundant_No {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int x=0;
		for(int i=1;i<a;i++) {
			if(a%i==0)
			x=x+i;	
		}
		if(x>a)
			System.out.println(a+" is an Abundant No.");
		else
			System.out.println(a+" is not an Abundant No.");
	}

}
