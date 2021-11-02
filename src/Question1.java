import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        longest(s);
    }

    private static void longest(String s) {
        if (s.equals("")) System.out.println("enter a string");
        else{
            int startIndex=0, endIndex=0, maxLength=0;
            Set set = new HashSet();
            while (endIndex < s.length()){
                if (set.add(s.charAt(endIndex))){
                    endIndex++;
                    maxLength = Math.max(maxLength, set.size());
                } else {
                    set.remove(s.charAt(startIndex));
                    startIndex++;
                }
            }
            System.out.println("Max length: " + maxLength);
        }
    }
}
