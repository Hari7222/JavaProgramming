
public class testingArray {
	int arr[]= {9,7,8,6,3,1,12,2,5},b=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(b<arr[i]) {
			b=arr[i];
		}
	}
	System.out.println("Biggest num is: "+b);

	}

