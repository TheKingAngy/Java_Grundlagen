import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!

         String name =IO.readln("What is your name?\n ");
         IO.println("Your name is "+name);
         String lastName=IO.readln("What is your last name?\n ");
         IO.println("Your last name is "+lastName);
         String age=IO.readln("How old are you?\n ");
         IO.println("Your age is "+age);
         String birthsday=IO.readln("When is your birthsday? \n");
         IO.println("Your birthsday is "+birthsday);
         String students=IO.readln("Are you an students?\n");
         IO.println("The answer is "+students);
         IO.println("Thank you for your input, "+name);
         IO.println(2026*365+9*30-17*365+9*30);


        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
            Scanner userInput=new Scanner(System.in);
            //String twoNumber=("Can you give me please two number?");
            IO.println("Can you give me please two numbers?");
            IO.println("Your number one is?");
            float numberOne=userInput.nextFloat();
            IO.println(numberOne);
            IO.println("Your number two is?");
            float numberTwo=userInput.nextFloat();
            IO.println(numberTwo);
            float sum= numberOne+numberTwo;
            float difference= numberOne-numberTwo;
            float quatient = numberOne/numberTwo;
            float product= numberOne*numberTwo;

            IO.println("The sum is:" + sum);
            IO.println("The difference is:"+difference);
            IO.println("The quotient is:"+ quatient);
            IO.println("The product is:"+product);



        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
            IO.println("Your weight(kg) and height(m) is:");
            IO.println("Your weight(kg)is?");
            float weight= userInput.nextFloat();
            IO.println(weight);
            IO.println("Your height(m) is?");
            float height= userInput.nextFloat();
            IO.println(height);
             quatient=weight/(height*height);
            IO.println("Your BMI is"+quatient);

        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
            IO.println("Give me a number of minutes:");
            IO.println("The number is:");
            int number= userInput.nextInt();
            IO.println(number);
            int hours=(number/60);
            int minute=number%60;
            IO.println("The result is:"+hours);
            IO.println(minute);


        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
            IO.println("Input a radius:");
            IO.println("The radius is:");
            double radius= userInput.nextDouble();
            IO.println(radius);
            double calculation=2*Math.PI*2;
            double area=Math.PI*radius*radius;
            IO.println(calculation);
            IO.println(area);
        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
            IO.println("input a bill-amount and tip-amount(percentage)");
            IO.println("Input a bill-amount:");
            float billAmount= userInput.nextFloat();
            IO.println(billAmount);
            IO.println("Input a tip-amount in percentage");
            float tipAmount= userInput.nextFloat();
            IO.println(tipAmount);
            float total=billAmount+tipAmount;
            IO.println(total);
            IO.println("The total is\n"+total);
        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
            IO.println("How many is your monthly and yearly salary?");
            IO.println("What is your hourly wage?");
            float hourlyWage= userInput.nextFloat();
            IO.println(hourlyWage);
            IO.println("How many hours do you work a week?");
            float hoursWeekly= userInput.nextFloat();
            IO.println(hoursWeekly);
            float monathlyWage=(hoursWeekly*hourlyWage)*4;
            IO.println(monathlyWage);
            float yearlySalary=monathlyWage*12;
            IO.println(yearlySalary);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!
        IO.println("Welcome to my quiz about Cars!");
        String car =IO.readln("\"Q 01: What Car have an V12 engine\n ");
        IO.println("The Car is "+car);
        String fastAndFurious=IO.readln("Do you remember what car drove Brian in Fast1?\n ");
        IO.println("The Car is"+fastAndFurious);

        userInput.close();













        // Make sure you didn't forget to close the scanner :)
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);