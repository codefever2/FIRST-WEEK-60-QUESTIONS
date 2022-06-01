import java.util.*;
import java.util.Scanner;
class positiveornegativenumber
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to check even or 
       odd :");
       int number = sc.nextInt();
       if(number<0)
       {
         System.out.println("Negative number");
       }
        else if (number == 0)
        {
          System.out.println("Neither Negative nor positive 
          number");
        }
       else
       {
          System.out.println("Positive number");
       }
    }
  }