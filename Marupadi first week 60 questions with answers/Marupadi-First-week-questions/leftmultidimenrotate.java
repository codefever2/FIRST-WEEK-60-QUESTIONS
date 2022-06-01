import java.util.*; //inverted number pyramid

class leftmultidimenrotate
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows of a multidimensional array-> condition:(column=row)");
      int row=sc.nextInt();
      int column=row ;//number = 9
      int[][] array={{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
      //Transpose of a,matrix
      int i=1,x=0;
      if(row==column)
      {
          while(i<=row)
          {
              int j=0;
              while((j<=x)&&(x<row-1))
              {
                  int temp =array[i][j];
                  array[i][j]=array[j][i];
                  array[j][i]=temp;
                  j++;
              }
              x++;
              i++;
          }
      }
    
      //reversing each row
      for(i=0;i<row;i++)
      {
          int f=row-1;
          for(int j=0;j<=row/2-1;j++)
          {
              int temp=array[i][j];
              array[i][j]=array[i][f];
              array[i][f]=temp;
              f--;
          }
     }

      
      //printing output
      for(i=0;i<row;i++)
      {
          for(int j=0;j<column;j++)
          {
              System.out.print(array[i][j]+" ");
          }
          System.out.print("\n");
      }
      
    }
  }