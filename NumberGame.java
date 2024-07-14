import java.util.Scanner;
public class NumberGame
{
    public static void main(String[]args) {
        System.out.println("Enter any number between 1 to 100 : ");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <= 2) {

        int num = sc.nextInt();
        int numToGuess = 46;

            if (num == numToGuess) {
                System.out.println("YOU GUESS THE CORRECT NUMBER ! ");
                System.out.println("GAME ENDED !");
                break;
            } else if (num > numToGuess) {
                System.out.println("YOUR NUMBER IS LARGER THEN THE GUESSING NUMBER ! ");
                System.out.println("TRY AGAIN ! \n ENTER NEW NUMBER BETWEEN 1 TO 100 :");
            } else if (num < numToGuess) {
                System.out.println("YOUR NUMBER IS SMALLER THEN THE GUESSING NUMBER ! ");
                System.out.println("TRY AGAIN ! \n ENTER NEW NUMBER BETWEEN 1 TO 100 :");
            } else {
                System.out.println(" PLEASE ENTER VALID NUMBER :");

            }
        i++ ;
       }
    }
}