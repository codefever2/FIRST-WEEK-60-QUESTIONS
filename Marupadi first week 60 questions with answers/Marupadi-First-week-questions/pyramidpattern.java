import java.util.*;
import java.util.Scanner;
class pyramidpattern
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the maximum number of pyramid:");
       int number = sc.nextInt();
       
       int count =1,j=1,rows=0;int h=1;
       while(count<=number)
       {
           count=count+j;
           j++;
           rows++;
       }
    //   System.out.print(rows);
       int space = rows-1;
       count=0;j =1;
       while(rows>=1)
       {
           int x=1;
           while(x<=space)
           {
               System.out.print(" ");
               x++;
           }
           count = count+j;
           for(int i=h;i<=count;i++)
           {
               System.out.print(i);
               System.out.print(" ");
           }
           h=count+1;
           j++;
           rows--;
           space--;
           System.out.print("\n");
       }
    }
  }