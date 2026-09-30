public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; // Valid

        // int firstNumber; // Valid

        // int tryThisNumber; // Valid

        // int _myNumber; // Valid

        // int int; // Not Valid, int is a risreved keyboard

        // int _number_; // Not Valid, starts with a special character

        // int i; // Valid

        // int number1; // Valid

        // int .product; // Not Valid, start with a special character

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; // recommended
        int speed; // recommended
        int JustANUmber; // not recommended, start with capital letter
        int justAnotherNumber; // recommended
        int _weather; // not recommended, start with special character
        int _Id; // not recommended, start with special character
        int $Money; // not recommended, start with special character
        int moneyinthebankaccount; // not recommended, false formate
        int aLotOfmoneyonbankAccount; // recommended
        int circumstanceEarthInKM; // not recommended, false formate
        int circumstanceEarth_KM; // recommended

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        short meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B';

        float meineNegativeGleitkommaZahl = -14.612f;

       double meineGrosseGleitkommaZahl = 50.1234567890123d;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

       boolean meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int moneyInBankAccount = 100_000; // not final because money on a personal bank

        final short MYBIRTHYEAR = 2001; // final because not change

        final byte AMOUNTOFMONTH = 12; // final

        final float GRAVITYFORCE = 9.81f; // final

        final byte AMOUNTOFMINUTSPERHOUERS = 60; // final

        final short AMOUNTOFSECONDSPERHOUER = 3600; // final

        final float pi = 3.14159f; // final

        short amountOfStudents = 167; // not final because if someone new come it change

        //--------------------------------------------------------------------------------------------------------------
    }
}