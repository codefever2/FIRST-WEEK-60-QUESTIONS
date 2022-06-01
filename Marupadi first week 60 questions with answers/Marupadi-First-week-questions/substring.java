import java.util.*;
import java.util.Scanner;
class substring
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first string:");
       String one = sc.nextLine();
      System.out.println("Enter the second string to find substring:");
      String two = sc.nextLine();
      
      int index=0;int temp =0;
      
      for(int i=0;i<one.length();i++)
      {
          int k =0;temp=0;
        char chone = one.charAt(i);
        char chtwo = two.charAt(0);
        
          if(chone==chtwo)
          {
              index=i;
              k=i+1;
              for(int j=1;j<two.length();j++)
              {
                char chinone = one.charAt(k);
                char chintwo = two.charAt(j);
               
                  if(chinone!=chintwo)
                  {
                      temp = 1;
                      break;
                  }
                  k++;
              }
              if (temp==0)
              {
                  temp=2;
                  System.out.println("Fisrt index of a substring :"+index);
                  break;
              }
          }
          
      }
      if (temp!=2)
      {
             System.out.println("Substring is not found -1");
      }
      }
  }