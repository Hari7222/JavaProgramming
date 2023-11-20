package oopsInheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 exp=new Class1(10);
		Class1 exp1=new Class1("HariPriya");
		Class2 childexp=new Class2();
		
		System.out.println("Print 1:"+exp.primNumber());
		System.out.println("Print 2:"+exp.primNumber1());
		System.out.println("Print 3:"+exp.test());
		System.out.println("Print 4:"+exp1.test());
		System.out.println("Print 5:"+childexp.test());
		System.out.println("Print 1:"+exp.primNumber1());
		System.out.println("Print 6:"+childexp.test2(29));
	}

}
