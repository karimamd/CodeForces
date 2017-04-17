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
        //Arrays.sort(numbers);
        numbers=insertionSort(numbers,n);
        //printArray(numbers,n);

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






    }
    private static int [] insertionSort(int []numbers,int n)
    {
        int []sortedNumbers=new int[n];
        int currentElement;
        for(int i=0;i<n;i++)
        {
                currentElement=numbers[i];

                for(int j=0;j<=i;j++)
                {
                    //if 1st element or all past elements are smaller:
                    if(j==i)
                    {
                        //put current element in the same place but in new array
                        sortedNumbers[i]=currentElement;
                    }
                    //else if the current element is smaller than the pointed on element
                    //in the sorted array:
                    else if(currentElement<sortedNumbers[j])
                    {

                            //point by k at last element in the sorted array
                            for(int k=i-1;k>=j;k--)
                            {
                                //and start shifting elements from the end till reach current index j
                                sortedNumbers[k+1]=sortedNumbers[k];
                            }
                            //and put current element in current index j
                            sortedNumbers[j]=currentElement;
                            //this break when wasn't there messed up everything
                            break;
                    }
                }
        }
        return sortedNumbers;
    }
    private static void printArray(int [] numbers,int n)
    {
        for (int i=0;i<n;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }

}
