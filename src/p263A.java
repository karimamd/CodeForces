import java.util.Scanner;

/**
 * Created by Kareem on 11-Apr-17.
 */
public class p263A {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=0,i=0,j=0;
        for (i=0;i<5;i++)
        {
            for (j=0;j<5;j++)
            {
                x=s.nextInt();
                if(x==1)
                    break;
            }
            if(x==1)
                break;
        }
        int moves=Math.abs(2-j)+Math.abs(2-i);
        System.out.println(moves);
    }
}
