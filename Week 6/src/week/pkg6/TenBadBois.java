package week.pkg6;
import java.util.Scanner;


public class TenBadBois {
    public int print(){
        Scanner n = new Scanner(System.in);
        System.out.println("give me a number");
        int userNumber = n.nextInt();
        int loopcounter = 1;
        while(loopcounter < 10){
            System.out.println(userNumber * loopcounter);
            loopcounter++;
        }
        return 0;
    }
}
