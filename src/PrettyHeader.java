public class PrettyHeader
{
    public static void main(String[] args)
    {
        String header = prettyHeader("Message Centered Here.");

    }

    public static String prettyHeader(String msg)
    {
        boolean done = false;
        int headerLength = msg.length();
        do{

            if(msg.isEmpty())
            {
                System.out.println("You must enter a message!");
            }
            else if(headerLength>54)
            {
                System.out.println("Your header cannot exceed 54 characters");
            }

            else
            {
                for (int i = 1; i <= 60 ; i++) {
                    System.out.print("*");
                }
                System.out.println();

                for (int i = 1; i <= 3 ; i++) {
                    System.out.print("*");
                }

                int indent = (54-headerLength)/2;

                for(int i=1; i<=indent ; i++){
                    System.out.print(" ");
                }
                System.out.print(msg);
                for(int i=1; i<=indent ; i++){
                    System.out.print(" ");
                }
                for (int i = 1; i <= 3 ; i++) {
                    System.out.print("*");
                }

                System.out.println();

                for (int i = 1; i <= 60 ; i++) {
                    System.out.print("*");
                }
                done = true;

            }


        }while(!done);

        return msg;



    }
}
