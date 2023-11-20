//Palindrome in number
/*import java.util.Scanner;
public class palindrome_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt(),p,pal=0,t=n;
        while(n>0) {
        p=n%10;
        pal=(pal*10)+p;
        n=n/10;
        } 
        if(t==pal)
        System.out.println("Palindrome");
        else
        	System.out.println("Not a Palindrome");
	}

}*/
//Palindrome in String 
/*import java.util.Scanner;
public class palindrome_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int len=str.length();
		StringBuilder str1=new StringBuilder(len);
		for(int i=len-1;i>=0;i--) {
			str1.append(str.charAt(i));
		}
		String S=str1.toString();
			if(S.equals(str))
				System.out.println("Palindrome");
			else
				System.out.println("Not a palaindrome");
}
}*/

import java.util.Scanner;

public class palindrome_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for a case-insensitive check
      //  String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Use StringBuilder to reverse the string
        StringBuilder reversedInput = new StringBuilder(input);
        reversedInput.reverse();

        // Check if the reversed string is equal to the original cleaned string
        if (input.equals(reversedInput.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

