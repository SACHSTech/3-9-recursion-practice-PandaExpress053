package recursion;

public class FindMax {
    public static int findMax(int[] arr, int n){
        if (n == 0){
            return 0;
        }
        return Math.max(arr[n-1], findMax(arr, n-1));
    }


    public static void main(String[] args) {
        System.out.println(findMax(new int[] {1, 27, 3, 4}, 4)); // Output: 1 2 3 4 5
    }
    
}