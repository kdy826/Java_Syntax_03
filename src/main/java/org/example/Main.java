package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     int a = 10;

     int[]arr = new int[5];
//     arr[0] = 10;
//     arr[1] = 20;
//     arr[2] = 30;

        for(int b = 0; b< arr.length; b ++){
            arr[b] = (b+1) *10;

        }

//     int sum = arr[0] +arr[1] + arr[2];
     int sum = 0;
     for (int i = 0 ; i< arr.length; i++){
         sum += arr[i];
     }
     int avg = sum / arr.length;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.printf("첫번째 : %d , 두번째 : %d,세번째 : %d, 총합 : %d" ,arr[0] ,arr[1] , arr[2] , arr[0] +arr[1] + arr[2]);
        System.out.println("총합"+ sum);
        System.out.println("평균" + avg);

    }
}


//===================코드업 19문제 해결!!

//Scanner sc = new Scanner(System.in);
//String a = sc.nextLine();
//String A[] = a.split("\\.");
//int b = Integer.parseInt(A[0]);
//int c = Integer.parseInt(A[1]);
//int d = Integer.parseInt(A[2]);
//
//        System.out.println(String.format("%04d.%02d.%02d", b, c, d));
//

// ========================코드업 27문제 해결!
//Scanner sc = new Scanner(System.in);
//String a = sc.nextLine();
//String A[] = a.split("\\.");
//int b = Integer.parseInt(A[0]);
//int c = Integer.parseInt(A[1]);
//int d = Integer.parseInt(A[2]);
//
//        System.out.println(String.format("%02d-%02d-%02d", d, c , b));


// ==========================코드업 28번 문제

//        Scanner sc = new Scanner(System.in);
//        Long a = sc.nextLong();
//
//
//        System.out.println( a);

//====================코드업 29번 문제
//
//Scanner sc = new Scanner(System.in);
//Double a = sc.nextDouble();
//
//        System.out.printf("%.11f", a );

//===================================코드업 30문제
//Scanner sc = new Scanner(System.in);
//Long a = sc.nextLong();
//
//
//        System.out.println( a);