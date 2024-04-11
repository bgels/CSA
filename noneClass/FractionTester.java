import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        
        Fraction x = new Fraction(1, 2);
        
        // Ask for input
        System.out.println("Enter the numerator:");
        int n = input.nextInt();
        System.out.println("Enter the denominator:");
        int d = input.nextInt();
        input.close();
        
        Fraction y = new Fraction(n, d);
        
        String sum = (x.getNumerator() * y.getDenominator() + x.getDenominator() * y.getNumerator()) + "/" + (x.getDenominator() * y.getDenominator());
        System.out.println(x.getNumerator() + "/"+ x.getDenominator() + " + " + y.getNumerator() + "/" + y.getDenominator() + " = " + sum);
        
        // Create a new Fraction with the user's input
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        
        
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        
        
    }
}