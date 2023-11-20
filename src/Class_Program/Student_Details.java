package Class_Program;

import java.util.Scanner;

public class Student_Details {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,m1,m2,m3,tol,avg;
		String name;
		System.out.print("Student id: " );
		id=s.nextInt();
		System.out.print("Student name: " );
		name=s.next();
		System.out.print("Mark 1: " );
		m1=s.nextInt();
		System.out.print("Mark 2: " );
		m2=s.nextInt();
		System.out.print("Mark 3: " );
		m3=s.nextInt();
		tol=m1+m2+m3;
		avg=tol/3;
		System.out.println("Total: "+tol);
		System.out.println("Average: "+avg);
		if(avg>=90)
			System.out.println("Remark: Excellent");
		else if(avg>=80)
			System.out.println("Remark: Very Good");
		else if(avg>=70)
			System.out.println("Remark: Good");
		else if(avg>=60)
			System.out.println("Remark: Has to improve");
		else if(avg>=50)
			System.out.println("Remark: Work hard");
		else
			System.out.println("Remark: Fail");
		s.close();
		}
	}


