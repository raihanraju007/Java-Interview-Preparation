package top_interview_question;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input data: ");
        int data = sc.nextInt();
        System.out.println("Input data is: "+data);

//        if ( data == 1 || data == 0){
//            System.out.println("It's not prime number");
//        }
//        if ( data == 2){
//            System.out.println("It's not prime number");
//        }
//
//
//        if (data % 2 == 0){
//            System.out.println("It's not prime number");
//        }else {
//            System.out.println("Its prime number");
//        }

        if (isPrime(data) == true){
            System.out.println("Its prime number");
        }else {
            System.out.println("Its not prime number");
        }

    }

    public static boolean isPrime(int data){
        if ( data == 1 || data == 0){
            System.out.println("It's not prime number");
        }
        if ( data == 2){
            System.out.println("It's not prime number");
        }

        for (int i = 2; i <= data/2; i++){
            if (data % i == 0){
                return false;
            }
        }
        return true;
    }

}
