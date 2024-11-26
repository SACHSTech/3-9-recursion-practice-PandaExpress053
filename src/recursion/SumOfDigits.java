package recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }
        return sumOfDigits(n / 10) + n % 10;
    }


    public static void main(String[] args) {
        System.out.println(sumOfDigits(15986)); // Output: 1 2 3 4 5
    }
    
}