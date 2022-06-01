import java.util.*;

class alphacountprint
  {
    public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int i=0;String temp;
            while(i<s.length())
            {
                char ch=s.charAt(i);
                if(Character.isLetter(ch)==true)
                {
                  temp="";
                  i++;
                  do
                  {
                    temp=temp+s.charAt(i);
                    i++;
                    if (i>=s.length())
                    {
                       break; 
                    }
                  }while(Character.isDigit(s.charAt(i))==true);
                  int num=Integer.valueOf(temp);
                  for(int j=1;j<=num;j++)
                  {
                  System.out.print(ch);
                  }
                } 
            }
        }
  }