import java.util.*;
import java.util.Scanner;

class asciivalueofcharacter
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the character to find the ascii value:");
      char ch = sc.next().charAt(0);
      System.out.println((int)ch);
    }
  }