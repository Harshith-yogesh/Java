package Basics;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a=s.nextInt();
        System.out.println("Enter the second number:");
        int b=s.nextInt();
        if(a<b){
            System.out.println(b+" is the Largest number");
        }
        else{
            System.out.println(a+" is the Largest number");
        }

    }
}
