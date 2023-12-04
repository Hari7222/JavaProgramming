package linearBinarySearch;

public class li_bi_func {
   public int linear(int[] x,int y) {
	   for(int i=0;i<x.length;i++) {
		   if(x[i]==y) {
			   return i;
		   }
	   }
	   return -1;
   }
   public int binary(int[] x,int y) {
	   int a=x.length/2;
	   if(y<=x[a]) {
		   for(int i=a;i<x.length;i--) {
			   if(x[i]==y) {
				   return i;
			   }
		   }
	   }
	   else if(y>=x[a]) {
		   for(int i=a;i<x.length;i++) {
			   if(x[i]==y) {
				   return i;
			   }
	       }
	   }
	   return -1;  
   }
   public int binary(int[] x) {
	   int left = 0,y=77;
	    int right = x.length - 1;
	    while (left <= right) {
	        int midValue = left + (right - left) / 2;
	        if (x[midValue] == y) {
	            return midValue;
	        }
	        if (y < x[midValue]) {
	            right = midValue - 1; 
	        } else {
	            left = midValue + 1; 
	        }
	    }
	   return -1;
   }
}