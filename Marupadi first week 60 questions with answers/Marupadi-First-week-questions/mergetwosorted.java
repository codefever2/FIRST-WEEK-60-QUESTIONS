import java.util.*;

class mergetwosorted
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first and second array length:");
      int length1=sc.nextInt();
      int length2=sc.nextInt();
      int[] array1 = new int[length1];
      int[] array2 = new int[length2];
      int[] output = new int[100];
      System.out.println("Enter the first array elements :");
      for(int i=0;i<length1;i++)
        {
          array1[i]=sc.nextInt();
        }
      System.out.println("Enter the second array elements :");
      for(int i=0;i<length2;i++)
        {
          array2[i]=sc.nextInt();
        }
        
        int count=0,k=0,i=0,j=0;
        
        while((i<length1)||(j<length2))
        {
            if(array1[i]==array2[j])
            {
                output[k] = array1[i];
                if(i<length1-1)
                {
                    i++;
                }
                if(j<length2-1)
                {
                    j++;
                }
                count++;
            }
            else if(array1[i]>array2[j])
            {
                output[k]=array2[j];
                count++;
                 if(j<length2-1)
                {
                    j++;
                }
                 else if (j==length2-1)
                {
                  k++;
                    for(int u=i;u<length1;u++)
                    {
                        output[k]=array1[u];
                        k++;count++;
                    }
                    break;
                }
            }
            else if (array1[i]<array2[j])
            {
                output[k]=array1[i];
                count++;
                if(i<length1-1)
                {
                    i++;
                }
                else if(i==length1-1)
                {
                  k++;
                    for(int u=j;u<length2;u++)
                    {
                        output[k]=array2[u];
                        k++;count++;
                    }
              break;
                }
            }
            k++;
        }
        System.out.println("Final output:");
        for(i=0;i<count;i++)
        {
          System.out.println(output[i]);
        }
    }
  }