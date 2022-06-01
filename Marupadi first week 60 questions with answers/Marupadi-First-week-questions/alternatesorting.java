import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class alternatesorting {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in an array:     ");
    int number = sc.nextInt();
    int[] array = new int[100];
    
    ArrayList<Integer> alist = new ArrayList<Integer>(); //using arraylist to insert the value at specified position
    
    System.out.println("Enter the elements of the array: ");
    
    for (int i = 0; i < number; i++) 
    {
      array[i] = sc.nextInt();
      alist.add(array[i]);
    }
    //sorting array
    for (int i=0;i < number-1;i++) 
    {
      for(int j=i+1;j<number;j++)
        {
          if (alist.get(i)>alist.get(j))
          {
            int temp = alist.get(i);
            alist.set(i,alist.get(j));
            alist.set(j,temp);
          }
        }
    }
    
    int j=number-1,p=number-1;
    int count=number/2;
    if(number%2!=0)
    {
     count = number/2+1;
    }
    int i=0;
     while(p>=count) 
    {
           System.out.println("add:"+alist.get(j));
            alist.add(i,alist.get(j));
            i+=2;
            alist.remove(number);
            p--;
    }

    for (i=0;i<alist.size(); i++)
    {
            array[i] = alist.get(i);
            System.out.println("Array["+i+"]="+array[i]);
    }
  }
}