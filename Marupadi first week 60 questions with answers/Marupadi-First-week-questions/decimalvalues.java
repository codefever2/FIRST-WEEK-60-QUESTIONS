//print 7.50 without using strings
import java.util.Scanner;
import java.util.*;
class decimalvalues
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      Float number = sc.nextFloat();
      System.out.printf("the number is : %.2f",number);
    }
  }