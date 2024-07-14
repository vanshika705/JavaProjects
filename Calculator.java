import java.util.Scanner;
public class Calculator 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of subjects :");
        int total_sub=sc.nextInt();
        
       
        
        int total_marks=0;
        for(int i=1;i<=total_sub;i++)
        {
            System.out.println("Enter marks obtain in subject "+i+" :");
            int marks=sc.nextInt();
            total_marks+=marks;
        }
        
        System.out.println("Total marks of all subjects are :"+ total_marks);
        // percentage calculation 
        double percentage=total_marks/total_sub;
        System.out.println("Percentage of student is :"+percentage+" %");

        //  Grade calculation 
        if (percentage<=100 && percentage>=85)
        {
            System.out.println("Grade is A !");
        }
        else if(percentage<85 && percentage>=70)
        {
            System.out.println("Grade is B !");
        }
        else if(percentage<70 && percentage>=50)
        {
            System.out.println("Grade is C !");
        }
        else if(percentage<50 && percentage>=35)
        {
            System.out.println("Grade is D !");
        }
        else
        {
            System.out.println("FAIL !");
        }
    }
}
