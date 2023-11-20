/*package Class_Program;
import java.util.Scanner;
public class Swap_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char c[]=str.toCharArray();
		int l=str.length();
		if(l%2==0) {
			for(int i=0;i<l;i++) { 
				System.out.print(c[i+1]+""+c[i]);
			i++;}}
			else {	
				for(int i=0;i<l-1;i+=2) 
					System.out.print(c[i+1]+""+c[i]);
				System.out.print(c[l-1]);
		}
	}
}*/
/*for(int i=0;i<c.length;i++) {
//System.out.print(c[i+1]+""+c[i]);
//System.out.printf("%c%c",c[i+1],c[i]);
i++;*/
/*Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.
Sample Testcase :1
INPUT
3
2 6
OUTPUT
yes*/
/*package Class_Program;
import java.util.Scanner;
public class Swap_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,l,r;
		n=s.nextInt();
		l=s.nextInt();
		r=s.nextInt();
		if(n>l&&n<r)
			System.out.println("Yes");
		else
			System.out.println("No");
}
}*/
//i/p=6,ticket=110 139 154 175 198 130.date=22 if ticket divisible by date print 1 else 0
/*package Class_Program;
import java.util.Scanner;
public class Swap_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,k;
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
			a[i]=s.nextInt();
		k=s.nextInt();
		for(int i=0;i<n;i++) {
		if(a[i]%k==0)
			System.out.print("1 ");
		else
			System.out.print("0 ");}
	}
}*/
/*Given an array of N elements switch(swap) the element with the adjacent element and print the output.
Sample Testcase :
INPUT
5
3 2 1 2 3
OUTPUT
2 3 2 1 3
*/
/*package Class_Program;
import java.util.Scanner;
public class Swap_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		if(n%2==0) {
			for(int i=0;i<n;i+=2)
				System.out.print(a[i+1]+" "+a[i]+" ");
		}
		else {
			for(int i=0;i<n-1;i+=2)
				System.out.print(a[i+1]+" "+a[i]+" ");
			System.out.print(a[n-1]);
		}	}  }*/
/*Find the minimum among 10 numbers.
Sample Testcase :
INPUT
5 4 3 2 1 7 6 10 8 9
OUTPUT
1*/
package Class_Program;
import java.util.Scanner;
public class Swap_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),min; 
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		min=a[0];
		for(int i=1;i<n;i++) {
			if(min>a[i])
			min=a[i];
		}
		System.out.println("Minimum num is:"+min);
	}
}