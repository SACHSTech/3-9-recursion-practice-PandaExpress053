package recursion;

public class ReverseString {
    public static String reverse(String s){
        if (s.length() == 0){
            return "";
        }
        
        return s.substring(s.length()-1, s.length()) + reverse(s.substring(0,s.length()-1));
    }


    public static void main(String[] args) {
        System.out.println(reverse("thick of it")); // Output: 1 2 3 4 5
    }
    
}