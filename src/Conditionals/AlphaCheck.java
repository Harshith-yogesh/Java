package Conditionals;
import java.util.Scanner;
public class AlphaCheck {

    static void Alphabet(char a){
       if(a >= 'a' && a <= 'z'){
           System.out.println("Lower Case");
       }
       else{
           System.out.println("Upper Case");
       }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char a=s.next().trim().charAt(0);
      Alphabet(a);
    }
}
