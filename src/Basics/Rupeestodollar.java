package Basics;
import java.util.Scanner;
public class Rupeestodollar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Currency in the Rupees:");
        int rupees=s.nextInt();
        float dollar=(float) ((rupees)/(87.71));
        System.out.println("The rupees to dollar is "+dollar );
    }
}
