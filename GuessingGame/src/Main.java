import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();                                      //Create new random object to create number

        Scanner sc = new Scanner(System.in);                            //Create new Scanner object to input information from the user
        System.out.print("Would you like to play a game? y/n...  ");  //Output text for the user with instructions
        String answer = sc.nextLine();                                  //Take in new string info from user

        //while(answer.equals("y")){                                     //while loop to run as long as user selects y
        do{
            int numToGuess = ran.nextInt(10) + 1;               //create new random number
            int user_guess = 0;
            int counter = 1;

            do{
                System.out.print("What do you think the number is?...");
                user_guess = sc.nextInt();
                if(user_guess > numToGuess){
                    System.out.println("Too high");
                    counter++;
                }else if(user_guess < numToGuess){
                    System.out.println("Too low");
                    counter++;
                }else{
                    System.out.println("That was Correct!!!");
                }
            }while(user_guess != numToGuess);

            System.out.println("Number of tries..." + counter);
            System.out.println("Would you like to play again? y/n...");  //Asks for a new string
            answer = sc.nextLine();                                     //user decides to play again or not
        }while(answer.equals("y"));
    }
}
