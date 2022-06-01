import java.util.*;
import java.util.Scanner;
class oddorevennumber
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to check even or 
       odd :");
       int number = sc.nextInt();
       if(number%2 == 0)
       {
         System.out.println("Even number");
       }
       else
       {
          System.out.println("odd number");
       }
    }
  }
  