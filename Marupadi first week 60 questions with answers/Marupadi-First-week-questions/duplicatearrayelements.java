import java.util.*;
class duplicatearrayelements
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter the array length :");
      int number = sc.nextInt();
      int[] array = new int[number];
      
      for(int i=0;i<number;i++)
        {
          array[i]=sc.nextInt();
        }
      System.out.println("The duplicate elements are :"); 

      for(int i=0;i<(number-1);i++)
        {
          for(int j=i+1;j<number;j++)
            {
              if(array[i]==array[j])
              {
                System.out.println(array[j]);
                 break;
              }
            }
        } 
    }
  }