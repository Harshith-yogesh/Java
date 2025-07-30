package Conditionals;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Maxelement {


    static void Largest(int A,int B ,int C){
      int  max=A;
      if(A>B){
          System.out.println(A+" is the Maximum Element");
      }else if(B>A && B>C){
          System.out.println(B+" is the Maximum Element");
      }
      else {
          System.out.println(C+" is the Maximum Element");
      }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the for A");
        int A = s.nextInt();
        System.out.println("Enter the for B");
        int B = s.nextInt();
        System.out.println("Enter the for C");
        int C = s.nextInt();

        Largest(A,B,C);


    }
}
