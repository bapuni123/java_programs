public class GFG {

    // Returns XOR of all subarray xors
    static int getTotalXorOfSubarrayXors(int[] arr, int N)
    {


        int res = 0;


        for (int i = 0; i < N; i++)


            for (int j = i; j < N; j++)
                for (int k = i; k <= j; k++)
                    res = res ^ arr[k];

        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        int N = arr.length;

        System.out.println(getTotalXorOfSubarrayXors(arr, N));
    }
}
