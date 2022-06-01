import java.util.*;
class sumofnaturalnumbers
  {
    public static void main(String[] args)
    {
       sacnner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which sum hasto be calculated:");
      int number = sc.nextInt();
      int sum=0;
      for(int i=1;i<=number;i++)
        {
          sum=sum+i;
        }
      System.out.println("Sum of natural numbers :"+sum);
      int largestdigit=0;
      while(sum!=0)
        {
          int mod=sum%10;
          sum=sum/10;
          if(mod > largestdigit)
          {
            largestdigit=mod;
          }
        }
      System.out.println("Largest didgit :"+largestdigit);
    }
  }