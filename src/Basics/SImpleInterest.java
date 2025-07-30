package Basics;
import java.util.*;
public class SImpleInterest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Calculation of the Simple Interest");
        System.out.println("Enter the Principal amount:");
        float amt=s.nextFloat();
        System.out.println("Enter the Rate of Interest:");
        float rate=s.nextFloat();
        System.out.println("Enter the Time in Years");
        int time=s.nextInt();
        time=365*24*60*60;

        float SI=(amt*time*rate)/100;
        System.out.println("The Simple Interest is "+SI);
    }
}
