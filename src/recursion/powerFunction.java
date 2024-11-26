package recursion;

public class powerFunction {
    public static int power(int base, int exponent){
        if (exponent == 0){
            return 1;
        }
        return (base * power(base, exponent - 1));
    }


    public static void main(String[] args) {
        System.out.println(power(1, 3)); // Output: 1 2 3 4 5
    }
    
}