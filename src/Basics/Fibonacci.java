package Basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("The Fibonacci Sequence is");
        int n=10;
        int a=0,b=1;
        for(int i=0;i<=n;i++){
            System.out.println(a+" ");
            int nxt=a+b;
            a=b;
            b=nxt;

        }
    }
}
