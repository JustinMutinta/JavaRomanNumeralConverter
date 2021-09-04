import java.util.Scanner;

public class Main {


    public static String[][] romanArray =   {{"M"},                     //1000
                                            {"CM", "D", "CD", "C"},     //900, 500, 400, 100
                                            {"XC", "L", "XL", "X"},     //90, 50, 40, 10
                                            {"IX", "V", "IV", "I"}};    //9, 5, 4, 1


    public static void main(String[] args) {
        System.out.println("Convert a number to roman numerals.\nKindy enter a number between 1 and 4999");
        Scanner sc = new Scanner(System.in);

        int testNumber = sc.nextInt();

        while(testNumber <= 4999){
            System.out.println(finalCal(testNumber));
            System.out.println("Enter another number: ");
            testNumber = sc.nextInt();
        }

        System.out.println(finalCal(testNumber));
    }


    public static String finalCal(int userNumber){
        String output = "";
        int decidingNumber = 1000;

        while(decidingNumber > 0){
            if(userNumber > 4999){
                System.out.println("Can't convert that number...yet.\nGood bye");
                break;
            }
            output += romanValue1(userNumber, decidingNumber);
            userNumber %= decidingNumber;
            decidingNumber = decidingNumber / 10;
        }

        return output;
    }

    public static String romanValue1(int userNumber, int decidingNumber){
        String output = "";
        int array1 = 0;
        int array2 = 0;
        if(userNumber >= 1000){
            array1 = 0;
            array2 = 0;
            for(int i = 0; i < userNumber/decidingNumber; i++){
                output += romanArray[array1][0];
            }
            userNumber %= 1000;
        }else if(userNumber >= 100){
            array1 = 1;
        }else if(userNumber >= 10){
            array1 = 2;
        }else{
            array1 = 3;
        }

        int tempNum = 0;
        tempNum = userNumber/decidingNumber;
        if(tempNum == 9){
            output += romanArray[array1][0];
        }else if(tempNum == 5){
            output += romanArray[array1][1];
        }else if(tempNum == 4){
            output += romanArray[array1][2];
        }else if(tempNum == 1){
            output += romanArray[array1][3];
        }else if(tempNum > 5 && tempNum < 9){
            output += romanArray[array1][1];
            tempNum -= 5;
            for(int i = 0; i < tempNum; i++){
                output += romanArray[array1][3];
            }
        }else{
            for(int i = 0; i < tempNum; i++){
                output += romanArray[array1][3];
            }
        }

        return output;
    }


    }



/*
Take input from user. Between 1 and 4999
Divide by 1000.
    If result is 1 - 4, then return value of M * number
Divide by 100.
    If result is 1, 4, 5, 9 then return C, CD, D, CM
    All others, add C.
    But then what about numbers between 5 and 9?
    if statement---get value of 5 and remainder is then * C.
Then divide by 10.
    If result is 1, 4, 5, 9 then return X, XL, L, XC
    if value between 1 and 4, then simply * X
    if statement for between 5 and 9. Add related value and then multiply remainder by X. for example LX for 60
Then divide by 1.
    If result is 1, 4, 5, 9 then return I, IV, V, IX
 */
