import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        Scanner userinput = new Scanner(System.in);
        System.out.println("Give me a number betwenn 1 and 7.");
        int number = userinput.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a weekday");

        }
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a weekday");
        }
        ;
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.
        Scanner exercise2 = new Scanner(System.in);
        System.out.println("Give me a month.");
        String month = exercise2.nextLine();

        String result = switch (month) {
            case "December", "January", "February" -> "Winter";
            case "March", "April", "May" -> "Spring";
            case "June", "July", "August" -> "Summer";
            case "September", "October", "November" -> "Autumn";
            default -> "Not a month";
        };
        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                result = "Not a mount";
                break;
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        Scanner exercise3 = new Scanner(System.in);
        System.out.println("Give me a month number (1-12)");
        int monthNumber = exercise3.nextInt();
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("That month have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("That month have 30 days");
                break;
            default:
                System.out.println("That month have 28 days");
        }
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("That month have 31 days");
            case 4, 6, 9, 11 -> System.out.println("That month have 30 days");
            default -> System.out.println("That month have 28 days");
        }
        ;

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"
        Scanner exercise4 = new Scanner(System.in);
        System.out.println("Select a class ( 1-Warrior, 2-Mage, 3-Rogue and 4-Cleric)");
        int classSelector = exercise4.nextInt();
        switch (classSelector) {
            case 1 -> System.out.println("Warrior (Strength:9, Agility:5, Intelligence:2)");
            case 2 -> System.out.println("Mage (Strength: 3, Agility: 4, Intelligence: 9)");
            case 3 -> System.out.println("Rogue (Strength: 4, Agility: 9, Intelligence: 3)");
            case 4 -> System.out.println("Cleric (Strength: 5, Agility: 3, Intelligence: 8)");
            default -> System.out.println("That is not an charakter!");
        }
        ;


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi
        Scanner exercise5 = new Scanner(System.in);
        System.out.println("Which digit do you want to translate (1-9)?");
        int translateDigit = exercise5.nextInt();
        System.out.println("In which language do you want to translate your digit ( 1-german, 2-english, 3-japanese)?");
        int translateLanguages = exercise5.nextInt();
        switch (translateDigit) {
            case 1:
                if (translateLanguages == 1) {
                    System.out.println("eins");
                } else if (translateLanguages == 2) {
                    System.out.println("one");
                } else if (translateLanguages == 3) {
                    System.out.println("ichi");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 2:
                if (translateLanguages == 1) {
                    System.out.println("zwei");
                } else if (translateLanguages == 2) {
                    System.out.println("two");
                } else if (translateLanguages == 3) {
                    System.out.println("ni");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 3:
                if (translateLanguages == 1) {
                    System.out.println("drei");
                } else if (translateLanguages == 2) {
                    System.out.println("three");
                } else if (translateLanguages == 3) {
                    System.out.println("san");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 4:
                if (translateLanguages == 1) {
                    System.out.println("vier");
                } else if (translateLanguages == 2) {
                    System.out.println("four");
                } else if (translateLanguages == 3) {
                    System.out.println("shi");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 5:
                if (translateLanguages == 1) {
                    System.out.println("fünf");
                } else if (translateLanguages == 2) {
                    System.out.println("five");
                } else if (translateLanguages == 3) {
                    System.out.println("go");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 6:
                if (translateLanguages == 1) {
                    System.out.println("sechs");
                } else if (translateLanguages == 2) {
                    System.out.println("six");
                } else if (translateLanguages == 3) {
                    System.out.println("roku");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 7:
                if (translateLanguages == 1) {
                    System.out.println("sieben");
                } else if (translateLanguages == 2) {
                    System.out.println("seven");
                } else if (translateLanguages == 3) {
                    System.out.println("nana");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 8:
                if (translateLanguages == 1) {
                    System.out.println("acht");
                } else if (translateLanguages == 2) {
                    System.out.println("eight");
                } else if (translateLanguages == 3) {
                    System.out.println("hachi");
                } else {
                    System.out.println("Language not available");
                }
                break;
            case 9:
                if (translateLanguages == 1) {
                    System.out.println("neun");
                } else if (translateLanguages == 2) {
                    System.out.println("nine");
                } else if (translateLanguages == 3) {
                    System.out.println("kyuu");
                } else {
                    System.out.println("Language not available");
                }
                break;
            default:
                System.out.println("not an number between 1 and 9 ,Mukō na sūchi ");
                break;
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!
        Scanner calculator = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numberOne = calculator.nextInt();

        System.out.println("Enter the second number:  ");
        int numberTwo = calculator.nextInt();

        System.out.println("Enter an operation (+, -, *, /");
        String operation = calculator.nextLine();

        if (operation.equals("/") && numberTwo == 0) {
            System.out.println("Warning: number two must not be 0");
        } else {
            int end = switch (operation) {
                case "+ (additon)" -> numberOne + numberTwo;
                case "- (subtraction)" -> numberOne - numberTwo;
                case "* (multiplication)" -> numberOne * numberTwo;
                case "/ (division)" -> numberOne / numberTwo;
                default ->  System.out.println("invalid operation");
            };


            //--------------------------------------------------------------------------------------------------------------
            System.out.println("Optional exercises");
            // 01.  Try to come up with a program on your own and the tools you
            //    know so far. Try to implement user input.
        }
    }
}