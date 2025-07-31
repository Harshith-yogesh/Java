package Conditionals;
import java.util.Scanner;
public class Reverse {
    static void Reverse(int a){
        while(a>0){
            int lastdigit=a%10;
            System.out.print(lastdigit+" ");
            a=a/10;

        }
        System.out.println("Reversed");
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=s.nextInt();
        Reverse(a);
    }
}
