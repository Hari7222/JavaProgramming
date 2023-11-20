
/*public class stack_heap {

	public static void main(String[] args) {
		String str1,str4;
		String str2=new String();
		String str3=new String("Welcome");
        str1="India";
        str2="Japan";
        str3="Raju";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        str4="Today is monday and yesterday is sunday";
        System.out.println(str4.length());
        System.out.println("sudha".length());
        System.out.println(str4.charAt(4));
        System.out.println("india".equals("INDIA"));
        System.out.println("india".equalsIgnoreCase("INDIA"));
        System.out.println(str4.substring(9));
        System.out.println(str4.substring(9,15));
        System.out.println(str4.concat(str2));
        System.out.println(str4.replace('a','*'));
        System.out.println(str4.toUpperCase());
        String str5="       hello        ";
        System.out.println(str5);
        System.out.println(str5.trim());
	}

}*/

//STRING BUFFER
public class stack_heap {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer(20);
		StringBuffer s3=new StringBuffer("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("qwerty uiop asdfg hjkl zxcv bnm 12");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.println(s1.reverse());
		//String Reverse
		String string="abcdef 1234";
		String reverse=new StringBuffer(string).reverse().toString();
		System.out.println("\nString b4 reverse:"+string);
		System.out.println("String after reverse:"+reverse);
		//Alternate way to reverse without buffer
		String i="abcdef";
		char[] c=i.toCharArray();
		for(int j=c.length-1;j>=0;j--)
			System.out.print(c[j]);
		//Contains will give boolean true or false
		String Text="The cat is on the table";
		System.out.println(("\n")+Text.contains("the"));

	}
}

//STRING COMPARE
/*public class stack_heap {

	public static void main(String[] args) {
		String str="Hello World";
		String str1="Hello";
		String str2=new String("Hello World");
		String s="Hello welcome, Hello world,Hello all";
		Object objstr=str;
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.compareTo(objstr.toString()));
		System.out.println(str.equals(str2));//Compare the values 
		System.out.println(str==str2);//compare the values and data types
		System.out.println(str==str2);
		int lastindex=s.lastIndexOf("Hello");//last occurance of hello
		if(lastindex==-1)
			System.out.println("Hello not found");
		else
			System.out.println("Last occurance of hello index:"+lastindex);
		
}
	
}*/