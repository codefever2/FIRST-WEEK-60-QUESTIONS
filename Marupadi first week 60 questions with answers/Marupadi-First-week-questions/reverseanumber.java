import java.util.*;
import java.util.Scanner;
class reverseanumber
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to be reversed :");
       int number = sc.nextInt();
       int reversednumber=0 ;
       int mod;
       while(number != 0 )
       {
         mod = number%10;
         number = number/10;
         
         reversednumber = (reversednumber*10)+mod;
       }
      System.out.println("reversed number :"+reversednumber);
    }
  }