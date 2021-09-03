public class Main {

    public static void main(String[] args) {
        System.out.println("Test");
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
