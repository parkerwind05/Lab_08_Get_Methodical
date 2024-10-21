import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int favInt = getInt(in, "Enter your favorite integer");

        double favDouble = getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite integer is " + favInt);
        System.out.println("Your favorite double is " + favDouble);
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }
        }while(!done);

        return retVal;

    }


    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }
        }while(!done);

        return retVal;

    }


}
