import java.util.Scanner;

/**
 * Created by Kareem on 29-Apr-17.
 */
public class p110A {

    public static void main(String args[])
    {
        int count=0;
        long n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextLong();
        long subdigit;
        while(n!=0)
        {
            subdigit=n%10;
            n/=10;
            if(subdigit==4||subdigit==7)
                count++;
        }
        if(!isLucky(count))
        {
            System.out.print("NO");
        }
        else
        {
            System.out.print("YES");
        }
    }
    static boolean isLucky(int n)
    {
        int subdigit;
        while(n!=0)
        {
            subdigit=n%10;
            n/=10;
            if(subdigit!=4 && subdigit!=7)
                return false;
        }
        return true;
    }
}
