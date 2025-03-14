package top_interview_question;

import java.util.Scanner;

public class ReverseStringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter original string: ");
        String originalString = sc.nextLine();

//        char[] reverseString = originalString.toCharArray();
//        for (int i = reverseString.length -1; i>=0; i--){
//            System.out.print(reverseString[i]);
//        }

        String reverseString = "";

        for (int i = 0; i< originalString.length(); i++){
            reverseString = originalString.charAt(i) + reverseString;
        }
        System.out.println(reverseString);

    }
}
