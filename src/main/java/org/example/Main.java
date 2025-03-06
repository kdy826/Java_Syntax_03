package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       String A[] = a.split("\\.");
        int b = Integer.parseInt (A[0]);
        int c = Integer.parseInt (A[1]);
        int d = Integer.parseInt (A[2]);

        System.out.println(String.format("%04d,%02d,%02d",b ,c ,d));





    }
}

//============== 코드업 24문제 단어 한개를 부분별로 나누어서 출력
//Scanner sc = new Scanner(System.in);
//String a = sc.next();
//String[] b = a.split("");
//     for (int i=0 ; i < b.length ;i++){  // 정수 i를 만들어 i가 b의 문자 갯수만큼 반복문
//        System.out.println("'"+ b[i] + "'");  // 양쪽에 '를 붙여 'b.length' 반복
//     }
//

// ==================코드업 23문제 소수점을 .을 기준으로 정수로 부분 출력하기
//Scanner sc = new Scanner(System.in);
//
//String a = sc.next();
//String[] A = a.split("\\.");
//        System.out.println(String.format("%s\n%s",A[0],A[1]));

//==================코드업 25문제 정수입력받아 나누어 출력하기

//        Scanner sc = new Scanner(System.in);
//        String a = sc.next(); //문자타입 a생성
//        char[] b = a.toCharArray(); // b라는 문자열 배열을 만들고 a를 배열안에 집어넣음
//        for (int i = 0; i < b.length; i++) { //정수 i를 b문자열 길이만큼 반복하도록 설정
//            System.out.printf("[" + b[i]); // b안에 글자마다 "["를 붙임
//            for (int j = b.length - 1; j > i; j--) { //2중반복문 정수 j를 문자열b 길이만큼
//                //줄어들도록 설정 -1을 붙인 이유는 첫번째 반복문이 '거짓'이 되려면
//                // b.length의 길이보다 1더 길어야 거짓이 되기 때문
//                System.out.printf("0");      //b배열의 자리수만큼 0생성
//            }
//            System.out.println("]");       // 두번째 반복문에서 0을 만들고 마지막에 "]"로 닫음
//        }

//===================코드업 26문제 시간의 분만 출력하기
//
//Scanner sc = new Scanner(System.in);  //
//String a = sc.next();
//String s[] = a.split(":");
//
//
//        if (s[1].equals("00"))
//        System.out.println("00");
//        else
//                System.out.println(s[1]);

// ======================코드업 12번문제 실수 그대로 출력하기

//Scanner sc = new Scanner(System.in);
//
//Double a = sc.nextDouble();
//       sc.close();
//        System.out.printf("%f" ,  a);

//==================== 코드업 19문제

//Scanner sc = new Scanner(System.in);
//String a = sc.nextLine();
//String A[] = a.split("\\.");
//int b = Integer.parseInt (A[0]);
//int c = Integer.parseInt (A[1]);
//int d = Integer.parseInt (A[2]);
//
//        System.out.println(String.format("%04d,%02d,%02d",b ,c ,d));
//


