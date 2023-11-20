package Class_Program;
import java.util.Scanner;
public class Sunny_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;double b,x;
		System.out.print("Enter a:");
		a=s.nextInt();
		b=Math.sqrt(a+1);
		x=b-Math.floor(b);
		//System.out.println(b);
		//x=b%1;
		//System.out.println(x);
		//if((b%1)==0) 
		if(x==0){
			System.out.println("Its a sunny number");
		}
		else {
			System.out.println("Its not a sunny number");
		}
			
	}

}
