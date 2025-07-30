package Conditionals;
import java.util.Scanner;
public class Salary {


    static void Salary(float salary){
         if(salary>=10000){
             salary=salary+2000;
             System.out.println("Your Updates Salary is "+salary);
         }
         else{
             salary=salary+1000;
             System.out.println("Your Updates Salary is "+salary);
         }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Salary and Bonus");
        System.out.println("Enter the Salary");
        float salary=s.nextFloat();

       Salary( salary);


//        System.out.println("Enter the Value of n");
//        int n=s.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println(i);

//        int n=1;
//        while(n<=10){
//            System.out.println(n);
//            n++;
//        }
    }
}
