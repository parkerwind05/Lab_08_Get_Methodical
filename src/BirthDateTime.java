import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int dayHigh = 0;

        int year = getRangedInt(in, "Enter the year you were born ", 1950,2015);
        int month = getRangedInt(in, "Enter the month you were born ", 1,12);

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayHigh = 31;
                break;
            case 4: case 6: case 9: case 11:
                dayHigh = 30;
                break;
            case 2:
                dayHigh = 28;
                break;
            default:
                System.out.println("Invalid day number");
        }

        int day = getRangedInt(in, "Enter the day you were born ", 1,dayHigh);
        int hour = getRangedInt(in, "Enter the hour you were born ", 1,24);
        int minute = getRangedInt(in, "Enter the minute you were born ", 1,59);

        System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);

    }








    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println(prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal>= low && retVal <= high) {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid int in range [" + low + " - " + high + "]");
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not, " + trash);
            }
        }while(!done);

        return retVal;

    }

}
