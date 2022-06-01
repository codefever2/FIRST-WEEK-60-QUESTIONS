import java.util.*;
import java.util.Scanner;
class areaofsquare
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of side of a square");
      float sidelength = sc.nextFloat();
      System.out.println("Area of a square -> a*a = " + (sidelength*sidelength));
    }
  }