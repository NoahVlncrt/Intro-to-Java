package week.pkg6;
import java.util.Scanner;

public class allMath {
    public int print(){
        //Let's get some user input
        Scanner n = new Scanner(System.in);
        System.out.println("I'll need two numbers now: ");
        
        int a = n.nextInt();
        int b = n.nextInt();
        
        // Ouput for math
        System.out.println("Addition: " + (a+b));        
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        return 0;
    }
}
