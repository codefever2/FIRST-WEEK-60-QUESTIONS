import java.util.*;
import java.lang.Math;

class areaoftwoconcentricircle
  {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the unit :");
    String s = sc.nextLine();
    
    System.out.print("Enter the radius of two concentric circle : ");
    double radius1 = sc.nextDouble();
    double radius2 = sc.nextDouble();
    double pi = 3.14;
    
   
    double area1 = pi*radius1*radius1;
    double area2 = pi*radius2*radius2;
    float difference = (float)Math.abs(area1-area2);
    System.out.println("area enclosed between concentric circle :"+difference+s);
    }
  }