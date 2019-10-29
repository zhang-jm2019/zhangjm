package ex4;

//BinarySearch.java
public class ex07 {
	public static void main(String[] args) {
		int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
		int i = ex07.binarySearch(list,2);  //returns 0
		int j = ex07.binarySearch(list,11); //returns 4
		int k = ex07.binarySearch(list,12); //returns -6
		int l = ex07.binarySearch(list,1); //returns -1
		int m = ex07.binarySearch(list,3); //returns -2
		
		System.out.println("i is " + i);
		System.out.println("j is " + j);
		System.out.println("k is " + k);
		System.out.println("l is " + l);
		System.out.println("m is " + m);
	}
	/**Use binary search to find the key in the list*/
	public static int binarySearch(int[] list,int key) {
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low) {
			int mid = (low + high) / 2;
			if(key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return - low -1; //Now high < low,key not found
	}

}
