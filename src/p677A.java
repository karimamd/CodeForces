/**
 * Created by Kareem on 10-Apr-17.
 */
import java.util.Scanner;
public class p677A {
    public static void main(String args[])
    {
        int n,h;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        h=s.nextInt();
        int [] heights=new int [n];
        int width=0;
        for(int i=0;i<n;i++)
        {
            heights[i]=s.nextInt();
            width+=Math.ceil(1.0*heights[i]/h);
        }
        System.out.println(width);

    }
}
