import java.util.*;
class characters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch = sc.next().charAt(0);

        while(ch<='Z')
        {
            System.out.print(ch);
            ch++;
        }
        
    }
}