import java.util.*;
/**
 * The Fraction class has methods to perform calculations on Fractions and
 * a toString method to convert the numerator and denominator in Fractions.
 * It has a method which will reduce the fractions to the simplest form.
 * It has methods to perform addition, subtraction, multiplication, and division.
 * It also has a compareTo and equals method to compare two fractions.
 * It also has a method which converts the fraction into decimals.
 * And finally it has a method which generates random numerator and denominator 
 * seperately and then convert it to fraction
 *
 * @author Shiroya R.
 * @version 03-19-2020
 */
public class Fraction       //class Fraction
{
    // declaring the fields outside the methods.
    private int denominator;        // to hold the numerator value
    private int numerator;      // to hold the denominator value


    // this is a default constructor which makes sures that the default values of
    // numerator is set to 0 and the denominator to 1.
    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }
    /** an overloaded constructor method with parameters numerator and denominator.
     * This method also has reduce() to reduce the fraction to simplest form.
     * @param inNum, numerator of the fraction
     * @param inDen, denominator of the fraction
     */
    public Fraction(int inNum,int inDen)
    {
        numerator = inNum;
        if (inDen == 0)     // an if else statement to make sure that the value of denominator is not 0.
            denominator = 1;
        else
            denominator = inDen;
        reduce();   // to reduce the numerator and denominator to simplest form.
    }

    /**
     * To reduce the fraction to simples form possible.
     * First determines whether the denominator or numerator is smallest.
     * Then it finds the lcm(numerator,denominator) by using a while loop.
     * The value of min keeps reducing by 1 until the modulo becomes 0.
     * And finally after finding the lcm, the numerator and denominator are both divided by it.
     */
    private void reduce()
    {
        int min;
        int absNum = Math.abs(numerator);
        int absDen = Math.abs(denominator);
        if(absNum <= absDen)    // an if else statement to determing which is smaller num or denom
            min = absNum;       // then the value of min is given accordingly to the loop
        else
            min = absDen;

        while (absNum % min != 0 || absDen % min != 0)  // a while loop to determing the lcm(numerator, denominator)
            min--;
        numerator = numerator/min;  // to get the numerator and denominator in the simplest form.
        denominator = denominator / min;
    }

    /**
     * Displays the numerator and denominator as a fraction value.
     * @return  a Fracction, as a fraction value made from numerator and denominator
     */
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    /**
     * TO multiply two fractions and get an answer
     * @param other, Second Fraction as per the function
     * @return a new Fraction obtained by multiplying this and other fraction
     */
    public  Fraction multiply(Fraction other)
    {
        return new Fraction(this.numerator * other.numerator,
                this.denominator * other.denominator);
    }

    /**
     * to divide two fractions and get an answer
     * @param other, second fraction as per the function
     * @return a new fraction obtained by divide this and other fradtion
     */
    public  Fraction divide(Fraction other)
    {
        return new Fraction(this.numerator * other.denominator,
                this.denominator * other.numerator);
    }

    /**
     * to add two fractions and get an answer
     * @param other, second fraction as per the function
     * @return a new fraction obtained by adding this and other fraction
     */
    public  Fraction sum(Fraction other)
    {
        return new Fraction((this.numerator * other.denominator) +
                (other.numerator * this.denominator)  , (this.denominator*
                other.denominator));
    }

    /**
     * to subtract two fractions and get an answer
     * @param other, a second fraction as per the function
     * @return a new fraction obtained by subtracting two fraction
     */
    public  Fraction subtract(Fraction other)
    {
        return new Fraction(((this.numerator * other.denominator) -
                (other.numerator * this.denominator)) , (this.denominator*
                other.denominator));
    }

    /**
     * a compareTo method which compares two method
     * @param other, a second fraction as per the fraction
     * @return  a fraction this or other depending on which one is greater
     */
    public Fraction compareTo(Fraction other)
    {
        double frac1 = this.numerator/this.denominator;
        double frac2 = other.numerator/other.denominator;
        if(frac1 > frac2)   // an if else statement to determine which one is greater than the other
            return this;
        else
            return other;
    }

    /**
     * an equals() method to determing if two fractions are equal to each other or not
     * @param other, second fraction as per the function
     * @return true or false depending upon whether this and other fractions are equal or not
     */
    public boolean equals(Fraction other)
    {
        return this.denominator * other.numerator == this.numerator * other.denominator;
    }

    /**
     * to convert the fractions into decimal values
     * @return double, a decimal value of a fraction
     */
    public double decimal()
    {
        return (numerator*1.0) / denominator;
    }

    /**
     * to generate a random numerator and denominator seperately and convert it to a random fraction
     * 
     * @return a fraction which is random on the range of 1-20
     */
    public static Fraction random()
    {
        Random rng = new Random();  // to create a new object of random class.
        // to generate random numbers ranging from 1 to 20, and most importantly
        // to stop random() to generate a 0.
        int rand1 = rng.nextInt(20) + 1;
        int rand2 = rng.nextInt(20) + 1;
        if(rand1 >= rand2)  
            return new Fraction(rand2, rand1);
        else
            return new Fraction(rand1, rand2);
    }



}   // end
