package top_interview_question;

public class SwappingNumbersWithout3Variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping A: "+ a + " B: "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping A: "+ a + " B: "+b);
    }
}

