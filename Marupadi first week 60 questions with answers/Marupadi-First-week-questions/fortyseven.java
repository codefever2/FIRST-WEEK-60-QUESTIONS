import java.util.*; //inverted number pyramid

class fortyseven
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to form inverted star pyramid : ");
      int number=sc.nextInt(); //number = 9
      String[][] array=new String[number][number*2-1];
      int mid=number-1;
      int max = mid;
      int min=mid;
      for(int i=0;i<number;i++)
        {
            array[i][mid]=String.valueOf(i+1);
          for(int j=0;j<number*2-1;j++)
            {
                if((j>=min)&&(j<mid))
                {
                    int x= Integer.valueOf(array[i][mid]);
                      array[i][j]=String.valueOf(x-(mid-j));
                }
                else if((j>mid)&&(j<=max))
                {
                    int x= Integer.valueOf(array[i][mid]);
                      array[i][j]=String.valueOf(x-(j-mid));
                }
                else if(j!=mid)
                {
                    array[i][j]=" ";
                }
            }
            min--;max++;
          }
      
//printing output array
       for(int i=0;i<number;i++)
        {
          for(int j=0;j<number*2-1;j++)
            {
              System.out.print(array[i][j]+" ");
            }
           System.out.print("\n");
        }
    }
  }