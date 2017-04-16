import java.util.Scanner;

/**
 * Created by Kareem on 14-Apr-17.
 */
public class p268A {

    public static  void main (String args[])
    {
        int games=0;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int [][]shirts=new int[n][2];
        int j;
        for (j=0;j<n;j++)
        {
            shirts[j][0]=s.nextInt();
            shirts[j][1]=s.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j!=i)
                if(shirts[i][0]==shirts[j][1])
                    games++;
            }
        }
        System.out.println(games);
    }
}
