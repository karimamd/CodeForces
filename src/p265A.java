import java.util.Scanner;

/**
 * Created by Kareem on 16-Apr-17.
 */
public class p265A {

    public static void main (String args[])
    {
        String s,t;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        t=scanner.nextLine();
        int position=0;
        char positionChar=s.charAt(position);
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)==positionChar)
            {
                if(position<s.length())
                {
                    position++;
                    positionChar=s.charAt(position);

                }
                            }
        }
        System.out.println(position+1);
    }
}
