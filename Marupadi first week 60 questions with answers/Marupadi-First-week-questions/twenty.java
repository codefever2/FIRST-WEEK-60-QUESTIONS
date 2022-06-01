import java.util.*;

class twenty
  {
    public static void main(String[] args)
    {
      int x=0;  //if x not initialised ,error occurs
      x=(x++) * 2 + 3 * (-x);
      System.out.println("output:"+x);
    }
  }