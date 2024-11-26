package recursion;

public class OccurrencesOfCharacter {
    public static int countChar(String s, char c){
        if (s.length() == 0){
            return 0;
        }
        if (s.charAt(0) == c){
            return countChar(s.substring(1, s.length()), c) + 1;
        }
        return countChar(s.substring(1, s.length()), c);
    }


    public static void main(String[] args) {
        System.out.println(countChar("hello", 'l')); // Output: 1 2 3 4 5
    }
    
}