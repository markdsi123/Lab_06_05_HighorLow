import java.util.Random;
import java.util.Scanner;



public class Main
{

    public static void main(String[] args)
    {



        Random random = new Random();



        Scanner scanner = new Scanner(System.in);



        int number = random.nextInt(11);
        int guess = -1;



        while (guess!=number)
        {



            System.out.print("Enter your guess - ");


            guess = scanner.nextInt();



            if (guess<number)
            {

                System.out.println("Too low, please try again");

            }
            else if (guess>number)
            {

                System.out.println("Too high, please try again");

            }
            else
            {


                System.out.println("Correct, the number was " + number);
            }
        }
    }

}