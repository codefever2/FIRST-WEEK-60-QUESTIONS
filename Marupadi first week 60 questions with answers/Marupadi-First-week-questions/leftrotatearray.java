import java.util.*;

  class leftrotatearray
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of times the array should be rotated");
    int number = sc.nextInt();
    System.out.println("Enter the array length :");
    int length=sc.nextInt();
    int[] array = new int[length];
    
    if(number > length)
    {
        number=number%length;
    }

    System.out.println("Enter the array elements : ") ;
    for(int i =0;i<length;i++)
      {
        array[i]=sc.nextInt();
      }
    while(number>0)
      {
          int temp=array[0];
          for(int j=0;j<length-1;j++)
            {
              array[j]=array[j+1];
            }
          array[length-1]=temp;
        number--;
      }
      for(int i =0;i<length;i++)
      {
        System.out.println(array[i]);
      }
      }
  }