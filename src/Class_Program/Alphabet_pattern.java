package Class_Program;

import java.util.Scanner;

public class Alphabet_pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++)
				System.out.print(ch++);
			System.out.println();
	}

	}}
