import java.util.*;
import java.util.Scanner;
class areaofcylinder
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the height of a cylinder");
      float height = sc.nextFloat();
      System.out.println("Enter the radius of a cylinder");
      float radius = sc.nextFloat();
      System.out.println("Total surface area of a cylinder -> 2r*pi*(h+r) = " +         
      (2*3.14*radius*(height+radius)));
    }
  }