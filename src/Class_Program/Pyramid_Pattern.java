//Pyramid pattern
/*package Class_Program;
import java.util.Scanner;
public class Pyramid_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {//Forward triangle
			for(int space=n;space>i;space--) {
				System.out.print(" ");}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {//Reverse triangle
			for(int space=1;space<i;space++) {
				System.out.print(" ");}
			for(int j=n;j>=i;j--) {
				System.out.print("* ");}
			System.out.println();
		}	
	}
}*/
/*
 output:***** 
         *****
          ***** 
           *****
            *****
*/
/*package Class_Program;
import java.util.Scanner;
public class Pyramid_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {//Forward triangle
			for(int space=1;space<i;space++) {
				System.out.print(" ");}
			for(int j=1;j<=n;j++) {
				System.out.print("*");}
			System.out.println();
		}
	}
}*/
/*package Class_Program;
import java.util.Scanner;
public class Pyramid_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {//Forward triangle
			for(int space=n;space>i;space--) {
				System.out.print(" ");}
			for(int j=1;j<=n;j++) {
				System.out.print("*");}
			System.out.println();
		}
	}
}*/
package Class_Program;
import java.util.Scanner;
public class Pyramid_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {//Forward triangle
		   for(int j=1;j<=n;j++)
		   {
			   if(i==1||i==n||j==1||j==n)
				   System.out.print("* ");
			   else
				   System.out.print("  ");}
		   System.out.println(); }
	}
}