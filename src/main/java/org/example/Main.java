package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}


// =========== 코드업 19 번 문제 타입
///        Scanner sc = new Scanner(System.in);
//
//
//        String a = sc.next(); //문자형  타입a를 스트링을 입력하게 지정
//
//        String date[] = a.split("\\."); // 문자열 a를 .을 기준으로 분리하여
// 문자열 a에 저장
//        int yy = Integer.parseInt(date[0]);
//        int mm = Integer.parseInt(date[1]);
//        int dd = Integer.parseInt(date[2]);
//
//      //  System.out.println(year+"."+"%02d",month+day);
//        System.out.printf(String.format("%04d-%02d-%02d",yy,mm,dd));
//

// ============= 코드업 20문제 replaceAll함수의 매개변수
//          Scanner sc = new Scanner(System.in);  //스캐너 불러오기
//          String a = sc.next();  // 문자형 타입 a를 스트링으로 입력하게만듬
//
//          a = a.replaceAll("-","");
//          // replaceAll 함수는 대상문자열을 원하는 문자값으로 변환하는 함수이며
//          // 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
//          // 두번째 매개변수는 변환할 문자 값
//
//        System.out.println(a);  //문자형 a 출력

//==================코드업 23문제 실수 하나를 부분별로 출력하기
//Scanner sc = new Scanner(System.in);
//
//String a = sc.next();
//String[] A = a.split("\\.");
//        System.out.println(String.format("%s\n%s",A[0],A[1]));



//Scanner sc = new Scanner(System.in);
//
//String num1 = new String("1234"); //num1에 문자타입 1234 넣음
//
//String num2 = new String("4321"); // num2에 문자 타임 4321을 넣음
//int num3 = sc.nextInt();
//int num = Integer.parseInt(num1); // 문자타입인 num1(1234) 을 정수형 num(1234)로 변환
//int num4 = Integer.parseInt(num2);// 문자타입인 num2(4321) 을 정수형 num4(4321)로 변환
//
//
//        System.out.println(num + num4); //문자타입 숫자들인 1234,4321이 정수형으로 바뀌었기때문에
////결과값은 5555가 나옴
//
//        System.out.println(num+ num3); //마찬가지로 문자타입이 정수가 되었기에
////기존에 정수타입이었던 num3이랑 합이 가능함