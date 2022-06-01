import java.util.*;
import java.lang.Math;

class rootsofquad
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the co-efficient value of polynomial equation ax^2+bx+c=0 respectively : ");
      double a=sc.nextDouble();
      double b=sc.nextDouble();
      double c=sc.nextDouble();
      double find = (Math.pow(b,2)) - (4*a*c);
      double x1,x2;
      if (find > 0)
      {
      x1 = (((-b)+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a));
      x2 = (((-b)-Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a));
        System.out.println("the roots values are : "+x1+"   "+x2);
      }
      else if (find<0)
      {
        double real=(-b/(2*a));
        double imag = (Math.sqrt(-((Math.pow(b,2))-(4*a*c))))/(2*a);
        
        System.out.println("the roots values are : "+"root 1:"+real+"+i"+imag+"     "+"root 1:"+real+"-i"+imag);
      }
      else
      {
        x1=x2=(-b/(2*a));
        System.out.println("the roots values are : "+x1+"   "+x2);
      }   
    }
  }