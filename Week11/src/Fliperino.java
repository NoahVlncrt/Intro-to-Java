


import java.util.Scanner;

public class Fliperino {
    public int print() {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        System.out.println("Please enter a string");
        String flippedString = new StringBuilder(userInput).reverse().toString();
        
        int result = userInput.compareTo(flippedString);
        if(result == 0){
            System.out.println("the string is the same");
        } else {
            System.out.println("string is not the same");
        }
        return 0;
    }
}
