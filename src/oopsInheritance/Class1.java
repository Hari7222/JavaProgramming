package oopsInheritance;
public class Class1 {
	int j=0,i=0,k=10;
	String s="HAri";
	//ArrayList<String>
	 public Class1(int n) {
		this.j=n;
	}
	public Class1(String s) {
		this.s=s;
	}
	public int primNumber1() {
		return j;
	}
	public int primNumber() {
		return k; 
	}
	public String test() {
		j=32;
		return s;
	}
}
