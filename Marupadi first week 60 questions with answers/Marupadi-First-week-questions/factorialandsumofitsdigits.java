import java.util.*;

class factorialandsumofitsdigits
  {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to find factorial:");
       int number=sc.nextInt();
       int factorial=1;
       while(number>1)
       {
           factorial=factorial*number;
           number--;
       }
       System.out.println("Factorial value : "+factorial);
       int sumofdigits=0;
       
       while(factorial!=0)
       {
           int mod=factorial%10;
           factorial=factorial/10;
           sumofdigits=sumofdigits+mod;
       }
        System.out.println("sum of the digits: "+sumofdigits);
   }
  }