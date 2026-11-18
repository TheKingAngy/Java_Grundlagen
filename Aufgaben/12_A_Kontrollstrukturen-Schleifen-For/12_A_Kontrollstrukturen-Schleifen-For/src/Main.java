public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      for (int iteratorEx1 = 0; iteratorEx1 < 10; ) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      Es wird endlos weitergehen.
        //      2. Why does this behavior occur?
        //      Weil es fehlt die Anweisung z.B. iterarorEx1 ++ am ende der Codeblock
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
            for (int number1 = 0 ; number1 <= 100; number1++) {
                System.out.println(number1);
            }
        //      02-02. 42 to 100
            for (int number2 = 42; number2 <= 100; number2++) {
                System.out.println(number2);
            }
        //      02-03. 42 to 123
            for (int number3 = 42; number3 <= 123; number3++){
                System.out.println(number3);
            }
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
            for (int number4 = 0 ; number4 <= 10; number4 +=2){
                System.out.println(number4);
            }
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
            for (int number5 = 1; number5 <=10; number5 +=3){
                System.out.println(number5);
            }
        //      02-06. -10 to 20
            int number6 = -10;
            for (number6 = -10; number6 <=20 ; number6++){
                System.out.println(number6);
            }
        //      02-07. 35 to 0 (descending)
            for (int number7 = 35; number7 >= 0; number7--){
                System.out.println(number7);
            }
        //      02-08. 15 to -20 (descending)
            for (int number8 = 15 ; number8>=-20; number8--){
                System.out.println(number8);
            }
        //      02-09. Even numbers from 10 to -10 (descending)
            for (int number9 = 10; number9 >= -10; number9 -=2 ){
                System.out.println(number9);
            }
        //      02-10. Odd numbers from 10 to -10 (descending)

            for (int number10 = 9; number10>= -10; number10-=3){
                System.out.println(number10);
            }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.
        int sum = 0;
    for (int i = 0; i<=100; i++){

        sum = sum+i;
    }
        IO.println(sum); //5050


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_04 = 0;

        // Your code here
        for (int i =0; i<=100; i+=2){
            forSum_04 = forSum_04+i;
        }

        System.out.println(forSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_05 = 0;

        // Your code here
        for(int i= 1; i<=100; i+=2){
            forSum_05 = forSum_05 + i;
        }
        System.out.println(forSum_05); // Should be 2500

    }
}