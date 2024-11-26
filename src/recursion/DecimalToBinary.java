package recursion;

public class DecimalToBinary {
    public static int toBinary(int n){
        if (n == 0){
            return 0;
        }
        return n % 2 + 10 * toBinary(n / 2);
    }


    public static void main(String[] args) {
        System.out.println(toBinary(100)); // Output: 1 2 3 4 5
    }
    
}