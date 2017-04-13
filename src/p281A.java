import java.util.Scanner;

/**
 * Created by Kareem on 13-Apr-17.
 */
public class p281A {
    public static void main (String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s;
        s=scanner.nextLine();
        s=Character.toUpperCase(s.charAt(0))+s.substring(1);
        System.out.println(s);

    }
}
