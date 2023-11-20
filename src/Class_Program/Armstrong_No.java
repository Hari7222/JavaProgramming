package Class_Program;

import java.util.Scanner;

public class Armstrong_No {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,len,sum=0,r;
		System.out.println("Enter the value:");
		a=s.nextInt();
		int t=a;
		String S=String.valueOf(a);
		System.out.println(S);
		len=S.length();
		System.out.println(len);
		while(a>0) {
			r=a%10;
			sum=(int)(sum+Math.pow(r, len));
			a=a/10;
		}
		System.out.println(sum);
		System.out.println(t);
		if(sum==t)
		System.out.println(t +" is an amstrong no");
		else
			System.out.println(t +" is not an amstrong no");
	}

}
