import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class sortascendingdescending
  {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in an array:     ");
    int number = sc.nextInt();
    int[] a = new int[100];
    System.out.println("Enter the elements of the array: ");
    
    for (int i = 0; i < number; i++) 
    {
      a[i] = sc.nextInt();
    }

    int i=0;
    while(i<number-2)
      {
         if(a[i]<a[i+2])
         {
            if(i==0)
            {
              int temp=a[i];
              a[i]=a[i+2];
              a[i+2]=temp;
            }
           else if (i>0)
           {
             for(int k=i+2;k<number;k+=2)
               {
                 if((a[k]>a[i]) && (a[k]<a[i-2]))
                   {
                     int tempo=a[i];
                      a[i]=a[k];
                      a[k]=tempo;
                     break;
                   }
               }
           }
         }
           i+=2;
      }
      i=1;
      while(i<number-2)
      {
         if(a[i]>a[i+2])
         {
            if(i==1)
            {
              int temp=a[i];
              a[i]=a[i+2];
              a[i+2]=temp;
            }
           else if (i>1)
           {
             for(int k=i+2;k<number;k+=2)
               {
                 if((a[k]<a[i]) && (a[k]>a[i-2]))
                   {
                     int tempo=a[i];
                      a[i]=a[k];
                      a[k]=tempo;
                     break;
                   }
               }
           }
         }
           i+=2;
      }
    for (int l=0;l < number;l++) 
    {
      System.out.println(a[l]);
    }

  }
}