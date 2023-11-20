package Class_Program;
import java.util.Scanner;
public class Test_case_Charecter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int cl=0,sl=0,v=0,con=0,d=0,sp=0,ws=0;
		String str=s.nextLine();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(Character.isLetter(c[i])||Character.isDigit(c[i])) {
		 		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'
						||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'
						||c[i]=='U')
		 		{
					if(v==0)
						v=i+1;
				}
		 			else if(con==0)
					con=i+1;
			if(Character.isUpperCase(c[i])&&cl==0)	
				cl=i+1;
			else if(Character.isLowerCase(c[i])&&sl==0)	
				sl=i+1;
			else if(Character.isDigit(c[i])&&d==0)
				d=i+1;
			}
			else if(Character.isWhitespace(c[i])&&ws==0)
			 ws=i+1;
			else if(sp==0)
		 				sp=i+1;
				}
		System.out.println("Capital Letter:"+cl);
		System.out.println("Small Letter:"+sl);
		System.out.println("Vowel:"+v);	
		System.out.println("Consonent:"+con);
		System.out.println("Digit:"+d);	
		System.out.println("Special Character:"+sp);
		System.out.println("White Space:"+ws);
	}
}