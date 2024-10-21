import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {

        System.out.println("Celsius     Fahrenheit");
        System.out.println("_____________________");
        for(double celsius = -100; celsius<=100 ; celsius++)
        {
            System.out.println(celsius + "      " + CtoF(celsius));
        }

    }

    public static double CtoF(double Celsius)
    {
        double fahrenheit = 0;
        fahrenheit = (Celsius * 9.0 / 5.0) + 32;

        return fahrenheit;
    }

}