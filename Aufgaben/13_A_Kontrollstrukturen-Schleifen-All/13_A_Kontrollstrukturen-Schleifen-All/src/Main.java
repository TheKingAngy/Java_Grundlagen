public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Use all of your knowledge for this tasks below. You are not restricted to certain loops anymore.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Calculate and print all the leap years from 0 to today's year.
        //
        //      A year is a leap year if it is divisible by 4.
        //      However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //
        //      Hint1: The divisibility by a particular number can be checked using the modulo operator.
        //
        //      Hint2: Check if your implementation is correct. For example; the Year 1900 is not a leap year.
            for(int i = 0; i <=2026; i++) {
                if (i % 4 == 0) {
                    if ( i % 100 !=0 || i % 400 == 0) {
                        System.out.println(" Ein Schaltjahr ist: " + i);
                    } else {
                        System.out.println (" Kein Schaltjahr ist leider: "+i);
                    }
                } else {
                    System.out.println (" Kein Schaltjahr ist leider: "+i);
                }
            }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Print out all numbers from 1-10.
        //      If a number is divisible by three, then print "Fizz".
        //      If a number is divisible by five, then print "Buzz".
        //      If a number is divisible by three and five, print "FizzBuzz".
        for (int i = 1; i<=100 ; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");


            } else if (i%5==0) {
                System.out.println("Buzz");

            }else if (i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println("It's nothing:" + i);
            }
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");  // Challenge!
        // 03.  Given a number n (n > 2 && n < 100), write a program which tells if n is a prime.
        //      Example: n = 7 -> "It's a prime number!"
        //      Example: n = 10 -> "It's not a prime number!"

        int n = 7; // change this value from prime to not prime to test
        // Your code here


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");  // Challenge+!
        // 04. Print all prime numbers from 2-100.
    }
}