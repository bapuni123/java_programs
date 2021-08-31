/* 

ROTATING ARRAY USING REVERSE ALGORITHM

*/
public class leftRotate {
	
	 void leftrotate(int arr[],int n,int d) {
		if(d==0)
			return;
		d = d%n;
		reversearr(arr,0,d-1);
		reversearr(arr,d,n-1);
		reversearr(arr,0,n-1);
	}
	 
	 void reversearr(int[] arr, int start, int end) {
		 int temp;
		 while(start<end) {
			 temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 start++;
			 end--;
			 
		 }
		 
	 }
	 
	 void printArr(int[] arr) {
		 for(int i = 0; i< 7; i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }
	
	public static void main(String[] args) {
		leftRotate lr = new leftRotate();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		lr.leftrotate(arr,7,2);
		lr.printArr(arr);
		
	}

}
