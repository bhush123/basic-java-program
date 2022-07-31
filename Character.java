import java.util.*;
public class Character 
{
    public static void main(String args[])
    {
       System.out.println("enter the charecter from keybord");

       char ch;
       Scanner sc=new Scanner(System.in);
       ch=sc.next().charAt(0);

       if(ch>='a' && ch<='z')
       {
           System.out.println("Small Alphabet");
       }
       else if(ch>='A' && ch<='Z')
       {
           System.out.println("Capital Alphabet");
       }
       else if(ch>='0' && ch<='9')
       {
           System.out.println("Digit");
       }
        else{
           System.out.println("Special Symbol");
        }


    }    
}
