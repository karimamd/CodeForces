import java.util.Scanner;

/**
 * Created by Kareem on 14-Apr-17.
 */
public class p731A {

    public static void main(String args[])
    {
        String s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        int A1,A2,path1,path2;
        A1='a';
        int rotations=0;
        for(int i=0;i<s.length();i++)
        {
            A2=s.charAt(i);
            path1=Math.abs(A1-A2);
            path2=26-path1;
            path1=Math.min(path1,path2);
            rotations+=path1;
            A1=A2;

        }
        System.out.println(rotations);

    }
}
