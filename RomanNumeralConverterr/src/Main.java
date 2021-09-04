public class Main {

    public static String oneThousand = "M";
    public static String nineHundred = "CM";  public static String fiveHundred = "D";   public static String fourHundred = "CD";  public static String oneHundred = "C";
    public static String ninety = "XC";       public static String fifty = "L";         public static String forty = "XL";        public static String ten = "X";
    public static String nine = "IX";         public static String five = "V";          public static String four = "IV";         public static String one = "I";

    public static void main(String[] args) {
        System.out.println("Test");
        int testNumber = 8;
        int testDecidingNumber = 1;

        System.out.println(romanValue(testNumber, testDecidingNumber));
    }


    public static String finalCal(int userNumber){
        String output = "";


        return output;
    }

    public static String romanValue(int userNumber, int decidingnumber){
        String output = "";
        int tempNum = 0;

        if(userNumber >= 1000){
            tempNum = userNumber/decidingnumber;
            if(tempNum == 1){
                output += oneThousand;
            }else{
                for(int i = 0; i < tempNum; i++){
                    output += oneThousand;
                }
            }
        }else if(userNumber >= 100){
            tempNum = userNumber/decidingnumber;
            if(tempNum == 9){
                output += nineHundred;
            }else if(tempNum == 5){
                output += fiveHundred;
            }else if(tempNum == 4){
                output += fourHundred;
            }else if(tempNum == 1){
                output += oneHundred;
            }else if(tempNum > 5 && tempNum < 9){
                output += fiveHundred;
                tempNum -= 5;
                for(int i = 0; i < tempNum; i++){
                    output += oneHundred;
                }
            }else{
                for(int i = 0; i < tempNum; i++){
                    output += oneHundred;
                }
            }
        }else if(userNumber >= 10) {
            tempNum = userNumber / decidingnumber;
            if (tempNum == 9) {
                output += ninety;
            } else if (tempNum == 5) {
                output += fifty;
            } else if (tempNum == 4) {
                output += forty;
            } else if (tempNum == 1) {
                output += ten;
            } else if (tempNum > 5 && tempNum < 9) {
                output += fifty;
                tempNum -= 5;
                for (int i = 0; i < tempNum; i++) {
                    output += ten;
                }
            } else {
                for (int i = 0; i < tempNum; i++) {
                    output += ten;
                }
            }
        }else {
            tempNum = userNumber / decidingnumber;
            if (tempNum == 9) {
                output += nine;
            } else if (tempNum == 5) {
                output += five;
            } else if (tempNum == 4) {
                output += four;
            } else if (tempNum == 1) {
                output += one;
            } else if (tempNum > 5 && tempNum < 9) {
                output += five;
                tempNum -= 5;
                for (int i = 0; i < tempNum; i++) {
                    output += one;
                }
            } else {
                for (int i = 0; i < tempNum; i++) {
                    output += one;
                }
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
