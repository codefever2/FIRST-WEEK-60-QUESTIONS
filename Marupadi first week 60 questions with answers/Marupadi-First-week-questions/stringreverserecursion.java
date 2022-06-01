import java.util.*;

class stringreverserecurse
  {
    public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        s=" "+s;
        String output="", temp="",next="";
        int count=s.length()-1;
        while(count>=0)
          {
              char ch =s.charAt(count) ;
            if (Character.isWhitespace(ch)==true)
            {
              int number=temp.length()-1;
              next="";
              while(number>=0)
                {
                   next = next + temp.charAt(number);
                   number--;
                }
                output=output+next+" ";
                temp="";
            }
            else
            {
                temp=temp+s.charAt(count);
            }
            count--;
          }
        System.out.println(output);
      }
  }