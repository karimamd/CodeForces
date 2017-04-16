import java.util.Scanner;

/**
 * Created by Kareem on 15-Apr-17.
 */
public class p228A {
    //solution settled at checking at every input if there is ONE input similar to it
    //even if there are multiple we will check for only one if it exists then add 1
    //in this way we will count all number of recurred elements
    public static void main(String args[])
    {
        int [] colors=new int[4];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            colors[i]=scanner.nextInt();
        }
        //bad answer but works for current problem

        int count[]={0,0,0};

        for(int i=0;i<3;i++)
        {
            int j=i+1;
            while(j<3&&colors[i]!=colors[j])
            {
                j++;
            }

               if(colors[i]==colors[j])
               {
                   count[i]++;
               }

        }
        System.out.println(count[0]+count[1]+count[2]);

    }
}
