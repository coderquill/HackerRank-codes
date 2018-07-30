mport java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        if(a%2==0)
        {
            if(a>=2 && a<=5)
                System.out.println("Not Weird");
            else if (a>=6 && a<=20)
                System.out.println("Weird");
            else if (a>20)
                System.out.println("Not Weird");
            
        }
        else 
            System.out.println("Weird");
    }
    



}

