import java.util.Scanner;

/**
 * Created by Kareem on 10-Apr-17.
 */
public class p734A {
    public static void main (String args [])
    {
        //must use multiple scanners or call nextLine twice bec each int has \n after it
        Scanner s=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        int n;
        n=s.nextInt();
        String st="";

            st=s2.nextLine();



        int A=0,D=0;
        for(int i=0;i<n;i++)
        {

            if(st.charAt(i)=='A')
            A++;
            else if(st.charAt(i)=='D')
                D++;
        }
        if(A>D)
            System.out.print("Anton");
        else if(D>A)
            System.out.print("Danik");
        else
            System.out.print("Friendship");
    }
}
