
package week.pkg6;
import java.util.Scanner;

public class Week6 {
    public static void main(String[] args) {
        
        HowdyThere nameReturn = new HowdyThere();
        NumberSum numberAddition = new NumberSum();
        Division division = new Division();
        QuickMaths quickMaths = new QuickMaths();
        ProductMaths productMaths = new ProductMaths();
        allMath AllMath = new allMath();
        TenBadBois tenBadBois = new TenBadBois();
        JavaPrint ART = new JavaPrint();
        MathPartTwoElectricBoogaloo mathPartTwoElectricBoogaloo = new MathPartTwoElectricBoogaloo();
        TheFinalMath theFinalMath = new TheFinalMath();
        
        int completeCounter = 0;
        while(completeCounter == 0){
        System.out.println("Pick a number from 1-10 to run the desired challenge. Picking 11 will end the program.");
        Scanner n = new Scanner(System.in);
        int userInput = n.nextInt();
        switch (userInput) {
                case 1: String name = nameReturn.print("Noah Vaillancourt"); // Challenge 1
                        break;
                case 2: int newNumber = numberAddition.print(7, 9); // Challenge 2
                        break;
                case 3: int divideformedaddy = division.print(50, 3); //Challenge 3
                        break;
                case 4: int dosomemathsohya = quickMaths.print(); //Challenge 4
                        break;
                case 5:  int multiplythemboi = productMaths.print(25,5); //Challenge 5
                        break;
                case 6: int allthemathstuff = AllMath.print(); //Challenege 6
                        break;
                case 7: int challenge7 = tenBadBois.print(); //Challenge 7
                        break;
                case 8: String challenge8 = ART.print(); //Challenge 8
                        break;
                case 9: int mathpartTwoElectricBoogaloo = mathPartTwoElectricBoogaloo.print(); //Challenge 9
                        break;
                case 10: int thefinalMath = theFinalMath.print(); //Challenge 10
                         break;
                case 11: completeCounter++;
                         break;
            }
        }
    }
    
}
