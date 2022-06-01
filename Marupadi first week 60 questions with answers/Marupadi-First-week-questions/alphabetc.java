import java.util.*;
import java.util.Scanner;
class alphabetc
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to print alphabet 'C':");
       int number = sc.nextInt();
       for(int i=1;i<=number;i++)
         {
            System.out.print("*");
         }
      System.out.print("\n");
      
      int count = number/2;
      
      while(count!=0)
        {
          System.out.println("*");
          count--;
        }
      for(int i=1;i<=number;i++)
         {
            System.out.print("*");
         }
      }
  }