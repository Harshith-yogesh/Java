package Harshith;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your temperature in FDegree Celcius");
        float temp=sc.nextFloat();
        float tempF=(temp*9/5)+32;
        System.out.println("Your temperature in Fahrenheit Celcius:"+tempF);
    }
}
