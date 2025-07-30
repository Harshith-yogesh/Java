package Basics;
import java.util.Scanner;

public class Palindrome {

    static void ISpalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Entered string is NOT a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Entered string IS a Palindrome");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To check if input is a Palindrome:");
        System.out.print("Enter a string: ");
        String a = s.nextLine();

        ISpalindrome(a);
    }
}