import java.util.*;

class eighteen
  {
    public static void main(String[] args)
    {
      int a=1;  //if x not initialised ,error occurs
      int b=1;
      System.out.println(++a-(b--));
      System.out.println(a%b++);
      System.out.println(a*=b+5);
      int x = 69>>>2; //unsigned right shift operator
      //The unsigned right shift operator '>>>' do not use the sign bit to fill the trailing positions. It always fills the trailing positions by 0s.
      System.out.println(x);
    }
  }