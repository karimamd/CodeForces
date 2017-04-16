import java.util.Scanner;

/**
 * Created by Kareem on 16-Apr-17.
 */
public class p129A {
    public static void main(String args[])
    {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int [] quanitity=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            quanitity[i]=scanner.nextInt();
            sum+=quanitity[i];
        }
        if (sum%2==0)
        {
            sum=0;
            for(int i=0;i<n;i++)
            {
                if(quanitity[i]%2==0)
                    sum+=1;
            }
        }
        else
        {
            sum=0;
            for(int i=0;i<n;i++)
            {
                if(quanitity[i]%2!=0)
                    sum+=1;
            }
        }
        System.out.println(sum);
    }

}
