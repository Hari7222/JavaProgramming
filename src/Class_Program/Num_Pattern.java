/*package Class_Program;
import java.util.Scanner;
public class Num_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
		//for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}

}*/
/*package Class_Program;
import java.util.Scanner;
public class Num_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=s.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
		for(int space=n;space>i;space--)
		System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(k++ + " ");
			System.out.println();
		}
	}
}*/
package Class_Program;
import java.util.Scanner;
public class Num_Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int space=n;space>i;space--)
				System.out.print(" ");
				
		for(int j=1;j<=i;j++)
		System.out.print(j);
			for(int k=i-1;k>=1;k--)
				System.out.print(k);
			System.out.println();
		}
	}
}


