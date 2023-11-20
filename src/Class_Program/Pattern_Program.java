/*package Class_Program;
import java.util.Scanner;
public class Pattern_Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value for n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println();
			//for(int j=n;j>=i;j--) {//reverse pattern
			for(int j=1;j<=i;j++) {	//normal pattern
			System.out.print("*");
			}}
			for(int i=1;i<=n;i++) {
				System.out.println();
				for(int j=(n-1);j>=i;j--) {//reverse pattern
				//for(int j=1;j<=i;j++) {	//normal pattern
				System.out.print("*");
				
			}
		}
	}
}*/

/*package Class_Program;
import java.util.Scanner;
public class Pattern_Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value for n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println();
			for(int j=n;j>=i;j--) {
			System.out.print("*");
		}}
		for(int i=2;i<=n;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {	
			System.out.print("*");
			}}	
		}
	}*/
package Class_Program;
import java.util.Scanner;
public class Pattern_Program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value for n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println();
			//for(int j=1;j<=i;j++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j);
		}}
}
}