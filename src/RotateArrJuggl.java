
public class RotateArrJuggl {
	
	void RotateArray(int arr[],int d,int n) {
		d = d%n;
		
		int i,j,k,temp;
		
		int gcd = calgcd(d,n);
		for(i=0;i<gcd;i++) {
			
			temp = arr[i];
			j=i;
		while(true) {
			
			k =(j+d)%n;
			
			if (k==i)
				break;
			arr[j]= arr[k];
			j=k;
			
		}
		arr[j] = temp;
		}
	}
	
	void printArr(int arr[], int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	int calgcd(int a,int b) {
		if(b==0)
			return a;
		else
			return calgcd(b,a%b);
	}
	
	public static void main(String[] args) {
		
		 RotateArrJuggl rotate = new RotateArrJuggl();
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	        rotate.RotateArray(arr, 2, 7);
	        rotate.printArr(arr, 7);

		
	}

}
