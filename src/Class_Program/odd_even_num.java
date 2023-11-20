package Class_Program;
import java.util.Scanner;
public class odd_even_num {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		int sum=a+b;
		if(sum%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
