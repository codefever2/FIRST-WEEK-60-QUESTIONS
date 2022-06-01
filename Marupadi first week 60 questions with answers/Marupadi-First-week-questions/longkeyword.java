//To use integer value beyond integer range , long datatype is used

import java.util.*;
class longkeyword
{
  public static void main(String[] args)
  {
    System.out.println("INTEGER DATATYPE RANGE :");
    System.out.println("Minimum value: "+Integer.MIN_VALUE);
    System.out.println("Maximum value: "+Integer.MAX_VALUE+"\n");
    
    System.out.println("LONG TYPE RANGE:");
    System.out.println("Minimum value: "+Long.MIN_VALUE);
    System.out.println("Maximum value: "+Long.MAX_VALUE+"\n");
    
     Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number to understand long keyword:");
    long numberlong = sc.nextLong(); //(64 bit)
    System.out.println("long : "+numberlong);
    
     //int cannot handle more than its range(32bit )
  }
}