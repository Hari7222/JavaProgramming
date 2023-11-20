/*package Class_Program;
import java.util.Scanner;
public class two_Dimension_array {
				public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
			int cols=a[0].length;
			System.out.println(cols);
			int rows=a.length;
			System.out.println(rows);
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
					System.out.print(a[i][j]+" ");
				System.out.println();
			}
		}
	}*/

package Class_Program;
import java.util.Scanner;
public class two_Dimension_array {
				public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter no. of rows:");
			int rows=s.nextInt();
			System.out.println("Enter no. of cols:");
			int cols=s.nextInt();
			System.out.println("Enter the elements one by one");
			int a[][]=new int[rows][cols];
			int b[][]=new int[rows][cols];
			int c[][]=new int[rows][cols];
			System.out.println("Matric A");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
				 a[i][j]=s.nextInt();
				}
			}
			System.out.println("Matric B");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
				 b[i][j]=s.nextInt();
				}
			}
			System.out.println("Array Matrix A");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++)
					System.out.print(a[i][j]+" ");
					System.out.println();
			}
			System.out.println("Array Matrix B");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) 
					System.out.print(b[i][j]+" ");
					System.out.println();
			}
			System.out.println("Sum of A & B");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++)
					System.out.print(a[i][j]+b[i][j]+" ");
				System.out.println();
			}
}}