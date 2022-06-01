import java.util.*;

class sumofarrayelements
  {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of array elements :");
     int number = sc.nextInt();
     int[] array = new int[100];
     System.out.println("Enter the elements of the array: ");
     int sum =0 ;
        for (int i = 0; i < number; i++) 
        {
          array[i] = sc.nextInt();
          sum=sum+array[i];
        }
        System.out.println("sum of array elements:"+sum);
    }
  }
