package funcAS;
public class funcClass<A extends Number> {
	
	public int add(A a,A b) {
		return a.intValue()+b.intValue();
	}
	public int sub(A a,A b) {
		return a.intValue()-b.intValue();
	}
	public int mul(A a,A b) {
		return a.intValue()*b.intValue();
	}
	public int div(A a,A b) {
		if(b.intValue()==0) {
			System.out.println("Can't divide by zero");
		}
		return a.intValue()/b.intValue();
	}
}
