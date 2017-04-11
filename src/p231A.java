import java.util.Scanner;

/**
 * Created by Kareem on 11-Apr-17.
 */
public class p231A {

    public static void main(String args [])
    {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int count=0;
        int p,v,t;
        for(int i=0;i<n;i++)
        {
            p=s.nextInt();
            v=s.nextInt();
            t=s.nextInt();
            p=p+v+t;
            if(p>=2)
            {
                count++;
            }

        }
        System.out.print(count);

    }



}
