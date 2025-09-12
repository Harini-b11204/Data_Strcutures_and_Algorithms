package STRINGS;
import java.util.*;
public class First_repeating_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        // Use a HashSet to track seen characters; when we see a character
        // that is already in the set, it's the first repeating one.
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Consider only letters; preserve original case when printing
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (seen.contains(lower)) {
                    System.out.println(ch);
                    return;
                }
                seen.add(lower);
            }
        }
        System.out.println("-1");
    }
}
