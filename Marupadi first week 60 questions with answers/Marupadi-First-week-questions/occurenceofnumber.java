import java.io.*;
import java.util.*;
class occurenceofnumber
  {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length :");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the array elements:");
      
        HashMap<Integer, Integer> freqcount
            = new HashMap<Integer, Integer>();
 
        for (int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
            
            if (freqcount.containsKey(array[i])) 
            {
                freqcount.put(array[i], freqcount.get(array[i]) + 1);
            }
            else 
            {
                freqcount.put(array[i], 1);
            }
        }
 
        for (Map.Entry entry : freqcount.entrySet()) {
            System.out.println("Element : "+entry.getKey() + "   
  " + "frequency : " +entry.getValue());
        }
        
    }
}