//statickeyword in java
import java.util.*;
class count
  {
      //static block
    static
    {
        System.out.println("Static Block invoked before main method");
    }
    
    static int counter = 0;  //static variable gets only one memory and retain its value when an objects changes it 
    int temp = 0 ;//non-static variable will get memory each time when the instance is created  
    count()  
    {
        counter++;
        temp++;
        System.out.print("counter value: "+counter);
        System.out.print("  non-static counter value: "+temp+"\n");
    }
    public static void main(String[] args)
    {
       count c1 = new count();
       count c2 = new count();
       count c3 = new count();
       counter++;
       counter = 2;
      // temp = 2; non-static cannot be accessed by static main method
       System.out.println("final counter value: "+counter);
    }
        //1.main method kept static because , object is not required to call a static method
        //2.The static method can not use non static data member or call non-static method directly.
        //3.this and super cannot be used in static context.
        //4.A static method belongs to the class rather than the object of a class.
        //5.A static method can be invoked without the need for creating an instance of a class.
        //6.A static method can access static data member and can change the value of it.
  }