package task2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long nod = Math.abs(scanner.nextLong());
        long nok = Math.abs(scanner.nextLong());

        long DK = nod * nok;
        if (nod ==0 || nok % nod != 0 || nok ==0) {
            System.out.println(0);
            return;
        }
        long xy = nok / nod;
  //      System.out.println("xy = " + xy);
        long tempa, tempb;
        int count =0;
        for (int i = 1; i <= xy; i++) {
  //          System.out.println(((func(xy, i))) + " i = " + i);
            long temp = func(xy, i)*nod;
            if (NOD(temp, i*nod) == nod ) {
           //     System.out.println(temp + "  :  " + i);

                count++;
            }

        }
        System.out.println(count);
    }

    public static long func(long z, long x) {
        if (z % x == 0)
        return z/x;
        return 0;
    }

    private static long NOD(long num1,long num2) {
        long min;
        long nod = 0;
        if(num1 > num2)
            min = num2;
        else
            min = num1;

        for (long count = 1; count <= min; count++) {
            if (num1 % count == 0 && num2 % count == 0){
                if (count>nod)
                    nod = count;
            }
        }
        return nod;
    }
    private static long NOK(long num1,long num2) {
        long count;
        long nok = 0;
        if (num1 < num2)
            count = num2;
        else
            count = num1;

        while (nok == 0) {
            if (count % num1 == 0 && count % num2 == 0)
                nok = count;
            count++;
        }
        return nok;
    }
}
