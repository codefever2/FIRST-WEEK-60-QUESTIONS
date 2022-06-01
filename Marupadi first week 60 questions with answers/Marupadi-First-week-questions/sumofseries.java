import java.util.*;
import java.util.Scanner;
class sumofseries
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of iterations to form a series:");
       int number = sc.nextInt();
       long sum = 0;
       long a = 0;
       for(int i =1;i<=number;i++)
       {
           a = (a*10) + 1;
           sum = sum + a;
       }
        System.out.println("Sum :"+sum);
    }
  }