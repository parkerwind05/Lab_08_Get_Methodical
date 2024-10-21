import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        String username = getNonZeroLenString(in, "Enter your username");
        System.out.println("Your username is: " + username);
    }



    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal= pipe.nextLine();
            if(retVal.isEmpty())
            {
                System.out.println("You must enter at least 1 character!");
            }
        }while(retVal.isEmpty());

        return retVal;
    }
}
