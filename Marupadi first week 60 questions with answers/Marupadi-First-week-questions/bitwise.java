import java.util.*;

class bitwise
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the two number:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Bitwise OR : a|b : "+(a|b)); //any of the bit is 1 to be true
      System.out.println("Bitwise AND : a&b : "+(a&b));//both bits should be 1's
      System.out.println("Bitwise XOR : a^b : "+(a^b));//
      System.out.println("Bitwise COMPLEMENT : ~a : "+(~a));//-(a+1) twos complement
      System.out.println("Bitwise LEFT SHIFT : a<<b : "+(a<<b)); //multiplies a by b number of times
      System.out.println("Bitwise RIGHT SHIFT : a>>b : "+(a>>b));//divides a by b number of times
       System.out.println("Bitwise UNSIGNED RIGHT SHIFT : a>>>b : " + (a>>>b));//divides a by b number of times without including sign bit(positive or negative) while shifting
    }
  }