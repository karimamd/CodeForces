import java.util.Scanner;

/**
 * Created by Kareem on 07-May-17.
 */
public class p443A {

    public static void  main (String args[])
    {
        int [] avaialbleChars=new int [26];
        Scanner scanner=new Scanner(System.in);
        String letters=scanner.nextLine();
        int i=1;
        while(letters.charAt(i)!='}')
        {
            //System.out.println((int)letters.charAt(i)-97);
            if( Character.isLetter(letters.charAt(i)) )
            {
                avaialbleChars[(int)letters.charAt(i)-97]=1;
            }

            i++;
        }
        int count=0;
        i=0;
        while(i<26)
        {
            if(avaialbleChars[i]==1)
                count++;
            i++;
        }
        System.out.print(count);
    }
}
