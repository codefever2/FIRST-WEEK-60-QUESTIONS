import java.util.*;

class startprogram
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to print the pattern: ");
      int number =sc.nextInt();
      String[][] array = new String[number*2-1][number*2];
      number=number*2;
      int min=number/2-1;
      int max=number/2;
      int temp =0;int k=2;
      int count=number-1;
      
      for(int i=0;i<number-1;i++)
        {
          for(int j=0;j<number;j++)
            {
                 if(temp==0)
                {
                    if((j<=min)||(j>=max))
                      {
                        array[i][j]="*";
                      }
                    else
                    {
                      array[i][j]="_";
                    } 
                }
                else if (temp==1)
                  {
                      if((j<=min)||(j>=max))
                      {
                        array[i][j]="*";
                      }
                    else
                    {
                      array[i][j]="_";
                    } 
                  }
                  k+=2;
            }
            if ((min>0) && (temp==0))
            {
             min--;max++;
            }
            else
            {
                temp = 1;
            }
            if (temp==1)
            {
                min++;max--;
            }
        }
        
        //printing ouput array
        for(int i=0;i<number-1;i++)
        {
          for(int j=0;j<number;j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }
  }