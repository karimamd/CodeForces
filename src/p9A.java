import java.util.Scanner;

/**
 * Created by Kareem on 16-Apr-17.
 */
public class p9A {
    public static void main(String args[])
    {
        int w,y,d;
        Scanner  scanner=new Scanner(System.in);
        w=scanner.nextInt();
        y=scanner.nextInt();
        d=6-Math.max(w,y)+1;
        //could make array of allpossible outcomes and make index according to value of d
        switch (d)
        {
            case(1):
                System.out.println("1/6");
                break;
            case(2):
                System.out.println("1/3");
                break;
            case(3):
                System.out.println("1/2");
                break;
            case(4):
                System.out.println("2/3");
                break;
            case(5):
                System.out.println("5/6");
                break;
            case(6):
                System.out.println("1/1");
                break;
        }
        }

}
