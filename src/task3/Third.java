package task3;


/*В первой строке задано число T (1 ≤ T ≤ 1000) – количество тестов. Каждый тест состоит из двух строк.

В первой строке каждого теста задано число n (2 ≤ n ≤ 106) – количество лежаков.

Во второй строке каждого теста заданы n чисел ai (1 ≤ i ≤ n, 0 ≤ ai ≤ 109) – значения,
которые были поставлены лежакам в соответствие по внешним признакам.

Сумма n по всем тестам не превосходит 106.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        long[][] lehakov = new long[106][1000];


        long t = scanner.nextLong();

        for (int k= 0; k< t; k++) {
              lehakov[k][0] = scanner.nextLong();

            for (int i = 1; i < lehakov[k][0]+1; i++) {
                lehakov[k][i] = scanner.nextLong();
            }

        }

        long min = 2147483647L;
        long temp;

        for (int k= 0; k< t; k++) {

            for (int i = 1; i < lehakov[k][0]; i+=1) {

                temp = lehakov[k][i] ^ lehakov[k][i+1];
        //        System.out.println("temp = " + temp);

                if (temp < min) {
                    min =  temp;
                }

            }
            System.out.println(min);

        }



    }


}

