package top_interview_question;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(stringContainVowels(data));
    }

    public static boolean stringContainVowels(String data){
        return data.toLowerCase().matches(".*[aeiou].*");
    }
}
