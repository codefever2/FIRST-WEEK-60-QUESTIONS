import java.util.*;
import java.util.Scanner;
class diffbtwnum
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to find the difference :");
       int number = sc.nextInt();
       int reversednumber=0 ;
       int duplicate = number ;
       int mod;
       while(duplicate != 0 )
       {
         mod = duplicate%10;
         duplicate = duplicate/10;
         
         reversednumber = (reversednumber*10)+mod;
       }

       System.out.println("difference :" + (number-reversednumber));
    }
  }