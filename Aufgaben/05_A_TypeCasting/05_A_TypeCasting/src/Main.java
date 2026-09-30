public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        // Your code here
        byte myByte= 10;

        short myShort=myByte;
        int myInt=myByte;
        long myLong=myByte;
        float myFloat=myByte;
        double myDouble= myByte;
        //char myChar= (char) myByte;
        short myShort1=20;
        int myInt1=myShort1;
        long myLong1=myShort1;
        float myFloat1=myShort1;
        double myDouble1=myShort1;
        //char myChar= (char) myShort1
        int myInteger=30;
        long myLong2=myInteger;
        float myFloat2=myInteger;
        double myDouble2=myInteger;
        //char myChar= (char)myInteger;
        long myLong3=1234567890;
        float myFloat3=myLong3;
        double myDouble3=myLong3;
        //char myChar=(char)myLong3;
        float myFloat4=100f;
        double myDouble4=myFloat4;




        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here
        long firstVariable=1234567890;
        int secondVariable= (int) firstVariable;
        System.out.println(secondVariable);
        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        // System.out.println(myNumber);

        // Can you explain what is happening?
         // the first variable is added to the second variable for covert it in an text.






        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        // int houseNumber = houseNumberInString;
        // System.out.println(houseNumber);
        // Use the Integer.parseInt() method to convert the String into an int.
        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Write down here
        // I think it will crash out because
        // can only process numbers and doesn't know what mathematical value to assign to letters, spaces, or text.
    }
}