import java.util.*;
class alphabettriangle
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the character to print the triangle:");
      char ch = sc.next().charAt(0);
     int count =  (int)ch - 64;
      while(ch >= 'A')
        {
            int n = 1;
            // System.out.print(" ");
          while(n <= count)
            {
              System.out.print(ch);
              n++;
            }
          System.out.print("\n");
          ch--;
          count--;
          }
    }
  }