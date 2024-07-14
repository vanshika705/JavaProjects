// ATM INTERFACE

import java.util.Scanner;

public class Atm
{
    public static void main(String [] args)
    {

        System.out.println("Please enter your name :");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello "+name+"!");

        String message="Welcome ! How may i help you ! \nPlease select any one option ! \nEnter 1 to check the balance. \nEnter 2 to deposit. \nEnter 3 to withdraw.";
        System.out.println(message);

        System.out.println("Please enter your option :");
        int task=sc.nextInt();
        // AVAILABLE AMOUNT IN THE BANK ACCOUNT
        double available_amount=5000;

        if (task>=1 && task<=3)
        {
            System.out.println("Welcome to our virtual bank !");
            // FOR CHECKING THE CURRENT BALANCE IN THE ACCOUNT
            if (task==1)
            {
                System.out.println("Your available amount is "+available_amount+".");
            }
            // TO DEPOSIT THE AMOUNT IN THE ACCOUNT 
            else if (task==2)
            {
                System.out.println("Please enter amount to deposit !");
                double deposit_amount=sc.nextDouble();
                if (deposit_amount>=500)
                {
                   available_amount+=deposit_amount;
                   System.out.println("Your amount has successfully deposited .");
                   System.out.println("Your  total available amount is "+available_amount+".");
                }
                else
                {
                    System.out.println("Minimum amount to deposit should be  Rs.500 !");
                }
            }
            // TO WITHDRAWL THE AMOUNT FROM THE ACCOUNT 
            else
            {
                System.out.println("Please enter amount to withdrawl !");
                double withdrawl_amount=sc.nextDouble();
                if (withdrawl_amount>5000)
                {
                    System.out.println("Maximum amount can be withdrawl is Rs. 5000 !");
                }
                else
                {
                   available_amount-=withdrawl_amount;
                   System.out.println("Your amount has successfully withdrawl .");
                   System.out.println("Your  total available amount is "+available_amount+".");
                    
                }
            }
        }
        // IF INVALID OPTION IS SELECTED BY USER
        else
        {
            System.out.println("Please enter valid option !");
        }
    }
}