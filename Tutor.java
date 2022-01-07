import java.util.*;     //for random class and Scanner class

/**
 * This is a driver class to the Fraction class. It has only one method which is main()
 * It asks the user to choose from 1 of the 4 options to sharpen their calculating fraction skills
 * This class has a while loop which will make sure it runs until the user asks for it to stop.
 * This class also has a for loop which will make sure the user is given 5 problems.
 *
 * @author Shiroya R.
 * @version 03-19-2020
 */

public class Tutor  //class tutor
{
    // this class will have only a main() method.
    public static void main(String[] args)
    {
        Fraction F3;        // declaring Fraction reference
        Fraction[] frac = new Fraction[10]; // to create an array of Fraction
        Scanner keyboard = new Scanner(System.in);      // creating an object of Scanner class.

        char goAgain = 'y'; // a character validation for the loop

        while(goAgain == 'y')       // a loop to make sure the loop keeps running unless the user asks to quit the program.
        {
            // to display the options to the user they can practice
            System.out.println("What category do you want to practice?");
            System.out.println("1. Adding.");
            System.out.println("2. Subtracting.");
            System.out.println("3. Multiplying.");
            System.out.println("4. Dividing.");
            System.out.println("5. Quit.");
            System.out.print("Please press any number from 1-5: ");
            int opt = keyboard.nextInt();   // to read and hold the int value of option selected by the user.
            if(opt == 1)    // an if else statement based on the option selected by the user.

            {
                for(int i=0; i<5; i++)  // a for loop which will run 5 times to give the user 
                                        // five random fraction problems.
                {
                    // generating two random fractions to perform the function.
                    frac[i] = Fraction.random();    // calling the random() method.
                    frac[i+1] = Fraction.random();      // calling the random() method.

                    System.out.println("Please answer the following question: " +
                            frac[i]+" + " + frac[i+1]  );

                    System.out.print("Numerator: "  );
                    int num = keyboard.nextInt();       // to read and hold the int value entered by the user
                    System.out.print("Denominator: ");
                    int den = keyboard.nextInt();       // to read and hold the int value entered by the user
                    F3 = new Fraction(num,den);     // Fraction object to hold the Fraction value entered by the user.
                    // to validate whether the answer entered by the user is correct or not and also
                    // displaying the corect answer.
                    System.out.println("The correct answer is: " + frac[i].sum(frac[i+1]) +
                            " & The answer you inputted is: " + F3.equals(frac[i].sum(frac[i+1])) );
                }
            }
            else if(opt == 2)   // if the user selects 2
            {
                for(int i=0; i<5; i++)  // a for loop which will run 5 times to give the user 
                // five random fraction problems.
                {
                    // generating two random fractions to perform the function.
                    frac[i] = Fraction.random();    // calling the random() method.
                    frac[i+1] = Fraction.random();      // calling the random() method.

                    System.out.println("Please answer the following question: " +
                            frac[i]+" - " + frac[i+1]  );

                    System.out.print("Numerator: "  );
                    int num = keyboard.nextInt();       // to read and hold the int value entered by the user
                    System.out.print("Denominator: ");
                    int den = keyboard.nextInt();       // to read and hold the int value entered by the user
                    F3 = new Fraction(num,den);     // Fraction object to hold the Fraction value entered by the user.
                    // to validate whether the answer entered by the user is correct or not and also
                    // displaying the corect answer.
                    System.out.println("The correct answer is: " + frac[i].subtract(frac[i+1]) +
                            " & The answer you inputted is: " + F3.equals(frac[i].subtract(frac[i+1])) );
                }
            }
            else if(opt == 3)   // if the user selects 3
            {
                for(int i=0; i<5; i++)  // a for loop which will run 5 times to give the user 
                // five random fraction problems.
                {
                    // generating two random fractions to perform the function.
                    frac[i] = Fraction.random();    // calling the random() method.
                    frac[i+1] = Fraction.random();      // calling the random() method.

                    System.out.println("Please answer the following question: " +
                            frac[i]+" x " + frac[i+1]  );

                    System.out.print("Numerator: "  );
                    int num = keyboard.nextInt();       // to read and hold the int value entered by the user
                    System.out.print("Denominator: ");
                    int den = keyboard.nextInt();       // to read and hold the int value entered by the user
                    F3 = new Fraction(num,den);     // Fraction object to hold the Fraction value entered by the user.
                    // to validate whether the answer entered by the user is correct or not and also
                    // displaying the corect answer.
                    System.out.println("The correct answer is: " + frac[i].multiply(frac[i+1]) +
                            " & The answer you inputted is: " + F3.equals(frac[i].multiply(frac[i+1])) );
                }
            }
            else if(opt == 4)   // if the user selects 4
            {
                for(int i=0; i<5; i++)  // a for loop which will run 5 times to give the user 
                // five random fraction problems.
                {
                    // generating two random fractions to perform the function.
                    frac[i] = Fraction.random();    // calling the random() method.
                    frac[i+1] = Fraction.random();      // calling the random() method.

                    System.out.println("Please answer the following question: " +
                            frac[i]+" / " + frac[i+1]  );

                    System.out.print("Numerator: "  );
                    int num = keyboard.nextInt();       // to read and hold the int value entered by the user
                    System.out.print("Denominator: ");
                    int den = keyboard.nextInt();       // to read and hold the int value entered by the user
                    F3 = new Fraction(num,den);     // Fraction object to hold the Fraction value entered by the user.
                    // to validate whether the answer entered by the user is correct or not and also
                    // displaying the corect answer.
                    System.out.println("The correct answer is: " + frac[i].divide(frac[i+1]) +
                            " & The answer you inputted is: " + F3.equals(frac[i].divide(frac[i+1])) );
                }
            }
            else if(opt == 5)   // if the user selects 5
            {
                System.out.print("Thank You. Please Come Again.");  // a thank you message,
                goAgain = 'n';  // changing the character of the variable will make the loop stop as the user asked to.
            }
            else    // when the user does not enters a number from 1-5
                System.out.print("Please enter a number from 1-5: ");   // a message to enter the number in range 1-5

        }
    }
}   // end
