import java.util.*;
class largestofthreenumbers
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the three numbers to find the largest:");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int largestnumber;
      
      if((num1 >=num2) && (num1>=num3))
      {
        largestnumber=num1;
      }
      else if((num2 >=num1) && (num2>=num3))
      {
        largestnumber=num2;
      }
      else
      {
        largestnumber=num3;
      }
      System.out.println("Largest number:"+largestnumber);
      }
  }