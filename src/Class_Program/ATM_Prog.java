package Class_Program;
import java.util.Scanner;
public class ATM_Prog {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bal=20000,choice,amt,dep;
		char c;
		do {
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Enter the choice");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				amt=s.nextInt();
				bal=bal-amt;
				System.out.println("Balance="+bal);
				break;
			case 2:
				dep=s.nextInt();
				bal=bal+dep;
				System.out.println("Balance="+bal);
				break;
			case 3:
				System.out.println("Balance="+bal);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
			}
			System.out.println("Do you want to continue:? Y or N");
			c=s.next().charAt(0);
		}while(c=='y'||c=='Y');
		System.out.println("Thank you");
	}

}
