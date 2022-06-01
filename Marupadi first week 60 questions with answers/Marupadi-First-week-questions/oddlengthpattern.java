import java.util.*; //no:57
import java.util.Scanner;
class oddlengthpattern
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first string:");
       String s = sc.nextLine();
       int n = s.length();
       char[][] array = new char[n][n]; 
      
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
                char ch=s.charAt(i);
                
                if (i==j)
                {
                    array[i][j]=ch;
                }
               else if ((i+j)==n-1)
               {
                 array[i][j]=ch;
               }
                else
               {
                 array[i][j]=' ';
               }
           }
       }
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               System.out.print(array[i][j]);
           }
           System.out.print("\n");
       }
      
      }
  }