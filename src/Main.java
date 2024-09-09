/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Allen Wang
*****************************************************************************************************
*/

//maintest isnt working so i wrote my own tests in the main

public class Main {

    public static void main(String[] args) {
        int sum2 = add(10, 20);
        int sum4 = add(1, 2, 3, 4);
        String morningGreet = morningGreeting("teacher");
        String afternoonGreet = afternoonGreeting("teacher");
        String triplet = triple("test");
        double halfed = half(9.25);
        int roundedpos1 = roundPositiveValueToNearestInteger(8.5);
        int roundedpos2 = roundPositiveValueToNearestInteger(8.49);
        int roundedpos3 = roundPositiveValueToNearestInteger(8.9);
        int roundedneg1 = roundNegativeValueToNearestInteger(-1.5);
        int roundedneg2 = roundNegativeValueToNearestInteger(-1.49);
        int roundedneg3 = roundNegativeValueToNearestInteger(-1.9);
        System.out.println(sum2); //test for 1. add
        System.out.println(sum4); //test for 2. add
        System.out.println(morningGreet); //test for 3. morningGreeting
        System.out.println(afternoonGreet); //test for 4. afternoonGreeting
        System.out.println(triplet); //test for 5. triple
        System.out.println(halfed); //test for 6. half
        System.out.println(roundedpos1 + "\n" + roundedpos2 + "\n" + roundedpos3); //test for 7. roundposint
        System.out.println(roundedneg1 + "\n" + roundedneg2 + "\n" + roundedneg3); //test for 8. roundednegint


    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(add(add(a, b), c), d);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好， " + name;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好， " + name;
    }

    // 5. triple
    public static String triple(String triple){
        return triple + triple + triple;
    }

    // 6. half
    public static double half(double half){
        return half/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a+0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) (a-0.5);
    }

}
