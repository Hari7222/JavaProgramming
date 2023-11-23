package weeklyAssesment;
	
public class PairSum {
    public static int sumSecondElements(List<Pair<Integer, Integer>> list) {
	        int sum = 0;
	        for (Pair<Integer, Integer> pair : list) {
	            sum += pair.second;
	        }
	        return sum;
	    }

    public static void main(String[] args) {
	       //enter your code here4
//	    	List arr=new ArrayList<Pair<Integer, Integer>>();
//	    	//List<Pair<Integer, Integer>> arr = new ArrayList<>();
//	    	arr.add(new Pair<Integer, Integer>(1,2));
//	    	arr.add(new Pair<Integer, Integer>(3,4));
//	    	arr.add(new Pair<Integer, Integer>(5,6));
//	    	arr.add(new Pair<Integer, Integer>(7,8));
//	    	arr.add(new Pair<Integer, Integer>(9,10));
//	    	System.out.println(sumSecondElements(arr));
    }

   public class Pair<F, S> {
	   F first;
       S second;
	        
    public Pair(F first1, S second1) 
    {
    	this.first= first1;
    	this.second = second1;
	}

	        
    }
}

