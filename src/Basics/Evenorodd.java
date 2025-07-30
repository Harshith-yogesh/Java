package Basics;
import java.util.*;
public class Evenorodd {
    public static void main(String[] args) {
        System.out.println("To check the number is even or odd");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("The Entered number is Even:"+n);
        }
        else{
            System.out.println("The Entered number is Odd:"+n);
        }
    }
}
