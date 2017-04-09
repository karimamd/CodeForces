package com.company;
import java.util.Scanner;
// 38 minutes total

/**
 * Created by Kareem on 09-Apr-17.
 */
public class p789A {
    public static void main(String args[])
    {
        int n,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        int []amounts=new int [n];
        int trips=0;
        System.out.println("");
        for(int i=0;i<n;i++)
        {
            amounts[i]=s.nextInt();
            //add number of pockets needed to move each type
            //multiply by 1.0  to avoid integer division for a successful ceiling
            trips+=Math.ceil(1.0*amounts[i]/k);

        }
        //2 pockets
        trips=(int)Math.ceil(1.0*trips/2);
        System.out.println(trips);

    }
}
