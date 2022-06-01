import java.util.*; //inverted number pyramid

class fourtynine
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to form inverted star pyramid : ");
      int number=sc.nextInt();
      String[][] array=new String[number][number*2];
      int min = 0;
      int max=number*2-1;
      for(int i=0;i<number;i++)
        {
          for(int j=0;j<number*2;j++)
            {
              if((j>=min)&&(j<=max))
              {
                array[i][j]="*";
                if (j < number*2-1)
                {
                   j++;
                  array[i][j]=" ";
                }
              }
              else
              {
                array[i][j]=" ";
              }
            }
            min++;max--;
        }
//printing output array
       for(int i=0;i<number;i++)
        {
          for(int j=0;j<number*2;j++)
            {
              System.out.print(array[i][j]);
            }
           System.out.print("\n");
        }
    }
  }