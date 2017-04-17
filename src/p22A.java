import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kareem on 17-Apr-17.
 */
public class p22A {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []numbers=new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i]=scanner.nextInt();
        }
        Arrays.sort(numbers);
        int i=0;
        int smallest=numbers[0];
        while(i<n&&smallest==numbers[i])
        {
            i++;
        }
        if(i==n)
            System.out.println("NO");
        else
            System.out.println(numbers[i]);
        /*int []sortedNumbers;
        sortedNumbers=insertionSort(numbers,n);
        System.out.println(sortedNumbers[0]);
        */


    }
   /* private static int [] insertionSort(int []numbers,int n)
    {
        int []sortedNumbers=new int[n];
        int currentElement;
        for(int i=0;i<n;i++)
        {
                currentElement=numbers[i];
                for(int j=0;j<=i;j++)
                {
                    if(j==i)
                    {
                        sortedNumbers[i]=currentElement;
                    }
                    else if(currentElement>sortedNumbers[j])
                    {


                            for(int k=i-1;k>=j;k--)
                            {
                                sortedNumbers[k+1]=sortedNumbers[k];
                            }
                            sortedNumbers[j]=currentElement;

                    }
                }
        }
        return sortedNumbers;
    }*/
}
