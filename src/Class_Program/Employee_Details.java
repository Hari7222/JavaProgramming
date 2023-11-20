package Class_Program;
import java.util.Scanner;
public class Employee_Details {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,mob,sal,net=0;
		String name,add;
		id=s.nextInt();
		name=s.next();
		s.nextLine();
		add=s.nextLine();
		mob=s.nextInt();
        sal=s.nextInt();
        //System.out.println("Salary: "+sal);
        if(sal>40000)
        	net=sal+8000;        
        else if(sal>30000)
        	net=sal+7000;
        else if(sal>20000)
        	net=sal+5000;
        else if(sal>10000)
        	net=sal+3000;
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Address: "+add);
        System.out.println("Contact: "+mob);
        System.out.println("Net Salary: "+net);
	}

}
