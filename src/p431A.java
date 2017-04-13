import java.util.Scanner;

/**
 * Created by Kareem on 12-Apr-17.
 */
public class p431A {
    public static void main(String args[])
    {
        int calories=0;
        int [] a=new int[4];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<4 ; i++)
        {
            a[i]=scanner.nextInt();

        }

        scanner.nextLine();
        String s=scanner.nextLine();

        char x='0';
        for(int i=0;i<s.length() ; i++)
        {
            x=s.charAt(i);
            switch (x)
            {
                case '1':
                    calories+=a[0];
                    break;
                case'2':
                    calories+=a[1];
                    break;

                case'3':
                    calories+=a[2];
                    break;

                case '4':
                    calories+=a[3];
                    break;
            }

        }
        System.out.println(calories);

    }

}
