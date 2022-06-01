import java.util.*;
import java.lang.Math;

class polynomial
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the co-efficient value of polynomial equation ax^2+bx+c=0 respectively : ");
      double a=sc.nextDouble();
      double b=sc.nextDouble();
      double c=sc.nextDouble();
      double x1 = (((-b)+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a));
      double x2 = (((-b)-Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a));
      System.out.println("the x values are : "+x1+"   "+x2);
   }
  }
