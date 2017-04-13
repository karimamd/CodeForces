import java.util.Scanner;

/**
 * Created by Kareem on 12-Apr-17.
 */
public class p266A {


    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n;
        int r=0,b=0,g=0;
        String s;
        n=scanner.nextInt();
        //using this to remove \n that is usually after ints scanning
        scanner.nextLine();
        s=scanner.nextLine();

        char past=s.charAt(0);
        int removed=0;
        for(int i=1;i<n;i++)
        {
            if(past==s.charAt(i))
            {
                removed++;
            }
            past=s.charAt(i);

        }
        System.out.println(removed);


    }
}
//another longer solution was to count occurences of each letter then find out if max > sum of 2 others
//byh a value >=2 then remove difference till difference between them =1

        /*for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=="R")
            {
                r++;
            }
            else if(s.charAt(i)=="B")
            {
                b++;
            }
            else if(s.charAt(i)=="G")
            {
                g++;
            }
         }
*/

