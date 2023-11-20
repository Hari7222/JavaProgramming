/*package Class_Program;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int a,b;
        double x;
        char c;
        System.out.print("Enter 1st num:");
        a=s.nextInt();
        System.out.print("Enter 2st num:");
        b=s.nextInt();
        System.out.print("Enter operation(+,-,*,/,%):");
        c=s.next().charAt(0);
        switch(c) {
        case '+':
        	x=a+b;
        	System.out.printf("Addition:%f",x);
        	break;
        case '-':
        	System.out.println("Subtraction:"+(a-b));
        	break;
        case '*': 
        	System.out.println("Multiplication:"+(a*b));
        	break;
        case '/':
        	System.out.println("Divition:"+(a/b));
        	break;
        case '%':
        	System.out.println("Modulus:"+(a%b));
        	break;	
        default:
        	System.out.println("Invalid");
        }
        //1System.out.println("Result = %ld",);
	}

}*/
//Perfect Square
package Class_Program;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();double x;
        x=Math.sqrt(a*b);
        System.out.println(x);
        if(x%1==0)
        	System.out.println("Perfect Square");
        else
        	System.out.println("Not a perfect square");   
	}
}
