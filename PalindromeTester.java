import java.util.Scanner;

public class PalindromeTester {
    public static void main(String [] args){
        String s;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string to test: ");
        s = scan.nextLine().toLowerCase();

        String answer = palindrome(s);
    }
    public static String palindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        if (s.length() <= 2){
            System.out.println(s + " is a palindrome.");
        }
        else{
            while ((s.charAt(left) == s.charAt(right)) && left < right){
                left++;
                right--;
            }
            if (left < right){
                System.out.println(s + " is not a palindrome.");
            }
            else {
                System.out.println(s + " is a palindrome.");
            }
        }
        return null;
    }
}
