import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();                                      //Create new random object to create number
        System.out.println(ran.nextInt(10) + 1);                 //Test to make sure I'm able to create random number in a range

        Scanner sc = new Scanner(System.in);                            //Create new Scanner object to input information from the user
        System.out.println("Would you like to play a game? y/n...  ");  //Output text for the user with instructions
        String answer = sc.nextLine();                                  //Take in new string info from user

        do{                                                             //do-while loop to run as long as user selects y
            System.out.println("Test");                                 //prints "Test"
            System.out.println("Enter a value: ");                      //Asks for a new string
            answer = sc.nextLine();                                     //user decides to play again or not
        }while(answer.equals("y"));                                     //loops again or closes it out.
    }
}
