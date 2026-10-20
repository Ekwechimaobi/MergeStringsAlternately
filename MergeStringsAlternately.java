import java.util.Scanner;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();
        
       
        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();
        
       
        String merged = mergeAlternately(word1, word2);
        
        
        System.out.println("Merged string: " + merged);
        
       
        scanner.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n1 = word1.length();
        int n2 = word2.length();
        
        
        while (i < n1 || i < n2) {
            
            if (i < n1) {
                result.append(word1.charAt(i));
            }
            
            if (i < n2) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        
        return result.toString();
    }
}