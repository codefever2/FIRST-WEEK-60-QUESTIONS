import java.util.*;

class swaptwonumbers
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the two numbers to be swapped:");
      int num1 = sc.nextInt();
      int num2=sc.nextInt();
      System.out.println("Before swapping - num1:"+num1+" num2:"+num2);
      int temp = num1;
      num1=num2;
      num2=temp;
      System.out.println("After swapping  - num1:"+ num1 +" num2:"+num2);
    }
  } 