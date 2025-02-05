//Import Scanner
import java.util.Scanner;

public class BirthMonth {
    int birthMonth = 0;
    String incorrectInput = "";

    public void getBirthMonth(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month [1-12]:");

        //Check for valid input from user
        if (in.hasNextInt()){
            birthMonth = in.nextInt();
            in.nextLine();

            // Check is BirthMonth is between 1 and 12 inclusive
            if (birthMonth >= 1 && birthMonth <= 12){
                System.out.println("Your birth month is: " + birthMonth);
            }
            else{
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }
        //Invalid Entry
        else{
            incorrectInput = in.nextLine();
            System.out.println("\n" + incorrectInput + " is not a valid entry. Run the program again and enter a valid integer [1-12]!");
        }


    }
}
