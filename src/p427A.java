import java.util.Scanner;

/**
 * Created by Kareem on 13-Apr-17.
 */
public class p427A {
    public static void main(String args[])
    {

        int crimes=0,police=0,input=0,events;
        Scanner scanner=new Scanner(System.in);
        events=scanner.nextInt();
        for(int i=0;i<events;i++)
        {
            input=scanner.nextInt();
            if(input>=0)
            {
                police+=input;
            }
            else
            {
                if(police>0)
                {
                    police--;
                }
                else
                    crimes++;
            }
        }
        System.out.println(crimes);
    }
}
