import java.util.*;
import java.util.Scanner;
class areaofrectangle
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of a rectangle");
      float length = sc.nextFloat();
      System.out.println("Enter the breadth of a rectangle");
      float breadth = sc.nextFloat();
      System.out.println("Area of a square -> l*b = " + (length*breadth));
    }
  }