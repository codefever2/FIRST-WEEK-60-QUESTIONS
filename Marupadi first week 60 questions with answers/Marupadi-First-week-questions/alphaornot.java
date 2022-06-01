import java.util.*;

class alphaornot
  {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter the character to check it is alphabet or not :");
      System.out.println((int)'A');
      char ch = sc.next().charAt(0);
      if ( ((int)ch>=65 && (int)ch<=90) || ((int)ch>=97 && (int)ch<=122))
          {
            System.out.println("It is a alphabet");
          }
      else
      {
        {
            System.out.println("It is not a alphabet");
          }
      }
    }
  }