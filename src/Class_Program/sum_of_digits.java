package Class_Program;

import java.util.Scanner;

public class sum_of_digits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int remainder,suum=0;
		while(n>0)
		{
			remainder=n%10;
			
			//System.out.print(remainder);
			suum=suum*10+remainder;
			n=n/10;
		}
		System.out.println(suum);
		s.close();
	}
}
