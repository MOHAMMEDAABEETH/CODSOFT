import java.util.Scanner;
public class NumberGame 
{
    public static void main(String[] args)
    {
        int number = 89;

        System.out.println("Welcome to the Number Game!\n");
        System.out.println("You have 3 choices to guess the correct number\n");
        int count = 3;
        while (count > 0)
        {
            System.out.println("Enter a number between 1 and 100);
            Scanner s = new Scanner(System.in);
            int guessnum = s.nextInt();
            if (guessnum < number)
            {
                 System.out.println("Your guess is small\n");
                 int res1 = count-1;
                 System.out.println("You have "+res1+" chances left\n");
            }
            else if(guessnum > number)
            {
                 System.out.println("Your guess is high\n");
                 int res2 = count-1;
                 System.out.println("You have "+res2+" chances left\n");
            }
            else if(guessnum == number && count==3)
            {
                 System.out.println("You have found the number in first attempt.\n");
                 System.out.println("The luck of the draw.\n");
                 break;
            }
            else if(guessnum == number && count==2)
            {
                 System.out.println("You have found the number in second attempt.\n");
                 System.out.println("Cool.\n");
                 break;
            }
            else if(guessnum == number && count==1)
            {
                 System.out.println("You have found the number in third attempt.\n");
                 System.out.println("Not bad.\n");
                 break;
            }
            count--;
            if(count < 0)
            {
              System.out.println("You failed to guess the correct number.\n");
              System.out.println("The guess number is "+number+"!\n");
              System.out.println("Better luck next time!\n");
            }
        }
    }
}
