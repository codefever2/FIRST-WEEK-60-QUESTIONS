import java.util.*;

class largestarrayelement
  {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in an array:     ");
    int number = sc.nextInt();
    int largestelement=0;
    int[] array = new int[100];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < number; i++) 
    {
      array[i] = sc.nextInt();
      if(array[i]>largestelement)
      {
        largestelement=array[i];
      }
    }
    System.out.println("Largest array element is :"+largestelement);
  }
}