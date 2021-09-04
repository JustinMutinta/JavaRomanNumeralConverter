import java.util.Scanner;

public class Main {


    public static String[][] romanArray =   {{"\u1e40"+"\u1e40"+"\u1e40"+"\u1e40"+"\u1e40"+"\u1e40"+"\u1e40"+"\u1e40"+"\u1e40", "\u1e40"+"\u1e40"+"\u1e40"+"\u1e40"+"\u1e40", "\u1e40"+"\u1e40"+"\u1e40"+"\u1e40", "\u1e40"}, //9M, 5M, 4M, 1M
                                            {"\u010a"+"\u1e40", "\u1e0a", "\u010a"+"\u1e0a", "\u010a"},     //900K, 500K, 400K, 100K
                                            {"\u1e8a"+"\u010a", "\u1e38", "\u1e8a"+"\u1e38", "\u1e8a"},    //90,000 , 50,000, 40,000, 10,000
                                            {"M"+"\u1e8a", "\u1e7c", "M"+"\u1e7c", "M"},       //9000, 5000, 4000, 1000
                                            {"CM", "D", "CD", "C"},         //900, 500, 400, 100
                                            {"XC", "L", "XL", "X"},         //90, 50, 40, 10
                                            {"IX", "V", "IV", "I"}};        //9, 5, 4, 1


    public static void main(String[] args) {
        System.out.println("Convert a number to roman numerals, or enter '0' to quit:  ");
        Scanner sc = new Scanner(System.in);

        int testNumber = sc.nextInt();

        while(testNumber != 0){
            System.out.println(finalCal(testNumber));
            System.out.println("Enter another number, or enter '0' to quit:   ");
            testNumber = sc.nextInt();
        }

        System.out.println(finalCal(testNumber));
    }


    public static String finalCal(int userNumber){
        String output = "";
        int decidingNumber = 1_000_000;

        while(decidingNumber != 0){
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
        if(userNumber >= 1_000_000){
            array1 = 0;
        }else if(userNumber >= 100_000){
            array1 = 1;
        }else if(userNumber >= 10_000){
            array1 = 2;
        }else if(userNumber >= 1000){
            array1 = 3;
        }else if(userNumber >= 100){
            array1 = 4;
        }else if(userNumber >= 10){
            array1 = 5;
        }else{
            array1 = 6;
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