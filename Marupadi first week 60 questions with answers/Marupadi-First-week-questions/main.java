import java.util.*; 

class main {
  public static void main(String[] args) {
    int numberofmultiples,number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number for which table to be printed ");
    number = sc.nextInt();
    System.out.println("enter the number of multiples");
    numberofmultiples=sc.nextInt();
    System.out.println(numberofmultiples);

    System.out.println("Multiplication table :");
    
    for(int i = 1;i<=numberofmultiples;i++)
      {
        System.out.println(number + "*" + i + " = " + (i*number));
      }
      
      System.out.println("Subtraction table :");
      
     int count = numberofmultiples;
     int i = number;
      
      while(count>0)
      {
          System.out.println(i + "-" + number + " = " + (i-number));
          count--;
          i++;
      }
  }
}