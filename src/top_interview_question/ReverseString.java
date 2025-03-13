package top_interview_question;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter String: ");
        String inputString = input.nextLine();

        System.out.println(" Input sting is: " + inputString);

//        char[] reverseString = inputString.toCharArray();
//         for (int i = reverseString.length - 1; i >= 0; i--){
//             System.out.print(reverseString[i]);
//         }
                 String reverseString = "";

                 for (int i =0; i<inputString.length(); i++){
                     reverseString = inputString.charAt(i) + reverseString;
                 }
                System.out.print("Reverse string is: " +reverseString);
    }
}
