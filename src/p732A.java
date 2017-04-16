import java.util.Scanner;

/**
 * Created by Kareem on 15-Apr-17.
 */
public class p732A {
    public static void main(String args[])
    {
        int r,k;
        int shovels=1;
        Scanner scanner=new Scanner(System.in);
        k=scanner.nextInt();
        r=scanner.nextInt();
        if(k%10==0||k%10==r)
        {
            shovels=1;
        }
        else
        {
            int remainder=(k*shovels)%10;
            //and not or because we want to loop until ONE of those conditions is NOT true
            while((remainder!=0)&&((remainder)!=r))
            {

                shovels++;
                 remainder=(k*shovels)%10;
                if(shovels==10)
                    break;
            }
        }
        System.out.println(shovels);
    }
}
