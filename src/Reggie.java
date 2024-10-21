import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        String ssn = getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$", "XXX-XX-XXXX");
        System.out.println("SSN is " + ssn);

        String stuMnum = getRegExString(in, "Enter your UC Student M Number", "^(M|m)\\d{5}$", "M*****");
        System.out.println("Your M number is: " + stuMnum);

        String menuChoice = getRegExString(in, "Enter a menu choice", "^[OoSsVvQq]$", "O/S/V/Q");
        System.out.println("You entered " + menuChoice + " as your menu choice.");

    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx, String format)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + "["+ format + "]: ");
            retVal = pipe.nextLine();
            Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(retVal);
            boolean matchFound = matcher.find();

            if(retVal.isEmpty())
            {
                System.out.println("You must enter an expression!");
            }
            else if(matchFound)
            {
                done = true;
            }

            else
            {
                System.out.println("You must enter an expression following the pattern " + "["+ format + "], not " + retVal);
            }


        }while(!done);

        return retVal;
    }
}
