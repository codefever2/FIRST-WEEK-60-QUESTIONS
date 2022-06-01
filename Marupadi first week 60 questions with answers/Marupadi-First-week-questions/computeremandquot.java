import java.util.*;
class computeremandquot
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number to be divided:");
      int number = sc.nextInt();
      System.out.println("enter the divisor:");
      int divisor = sc.nextInt();
      int remainder = number %divisor;
      int quotient =  number/divisor;
      System.out.println("quotient is :"+quotient+"  Remainder is :"+remainder);
    }
  }