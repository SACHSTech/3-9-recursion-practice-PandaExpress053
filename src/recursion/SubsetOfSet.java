package recursion;

public class SubsetOfSet {
    public static void generateSubsets(String s, String current){
        if (s.length() == 0){
            System.out.println(current);
            return;
        }
        generateSubsets(s.substring(1), current + s.charAt(0));
        generateSubsets(s.substring(1), current);
    }


    public static void main(String[] args) {
        generateSubsets("abc", "");
    }
    
}