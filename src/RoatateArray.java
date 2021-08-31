/*package whatever //do not write package name here */

import java.util.Scanner;

class RotateArray {

    void leftRotate(int[] arr, int n, int k){
        for(int i=0;i<k;i++){
            leftRotateByOne(arr, n);
        }
    }
    void leftRotateByOne(int[] arr, int n){
        int temp ;
        temp = arr[0];
        if (n - 1 >= 0) System.arraycopy(arr, 1, arr, 0, n - 1);

        arr[n-1] = temp;
    }

    void printArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String[] args) {
        //code
        RotateArray ll = new RotateArray();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int p=0;p<t;p++){
            int n = sc.nextInt();
            int d = sc.nextInt();

            int[] arr = new int[n];
            for(int s=0;s<n;s++){
                arr[s] = sc.nextInt();
            }

            ll.leftRotate(arr,n,d);
            ll.printArray(arr,n);
        }

    }
}