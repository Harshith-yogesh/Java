package Conditionals;
import java.util.Scanner;
public class noofoccurence {

    static void Occurence(int a){
        int count=0;
        while(a>0){
            int rem=a%10;
            if(rem==5){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        Occurence(a);
    }
}
