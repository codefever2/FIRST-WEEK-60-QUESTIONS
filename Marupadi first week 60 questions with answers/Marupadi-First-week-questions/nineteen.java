import java.util.*;

class nineteen
  {
    public static void main(String[] args)
    {
      int a=28;  
      a= (a++) + (++a) + (-a) + (a--); // a- is illegal expression 
      System.out.println("output:"+a);
    }
  }