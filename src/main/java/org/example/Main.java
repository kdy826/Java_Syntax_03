package org.example;

public class Main {
    public static void main(String[] args) {
// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요. // 조건 : 숫자와 사칙연산 사용 금지
//        int a; // 변수 선언 a
//        a = 5; // a라는 변수에 5라는 값을 넣겠다.
//
//        System.out.println(a);
//        System.out.println(a + 10);
//
//        int b = 10;
//
//        // `+` => 문장과 문자을 합친다.
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//
//        // 여기서 부터
//        int ab = a;
//        int ba = b;
//        a = ba;
//        b = ab;
//
//        // 여기까지 수정 가능
//
//        System.out.println("a : " + a);
//        // 출력 : a : 10
//        System.out.println("b : " + b);
//        // 출력 :  b : 5

//                int x = 10;
//
//                System.out.println("x"); // 출력 : x
//                System.out.println(x); // 출력 : 10
//                System.out.println("x" + x); // 출력 : x10
//                System.out.println("x : " + x); // 출력 : x : 10
//                System.out.println("x : " + x * 10); // 출력 : x : 100
//                System.out.println("x : " + x + 10); // 출력 : x : 1010
//                System.out.println("x : " + (x + 10)); // 출력 : x : 20
//           int age = 115;
//           System.out.println("당신의 나이" + age);
//
//           if(20 > age) {
//               System.out.println("미성년자");
//           }
//        if(20 <= age) {
//            System.out.println("성인");
//        }
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참1");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓1");
        }

        if ( a > 10 ) {
            System.out.println("거짓2");
        }

        if ( a >= 10 ) {
            System.out.println("참2");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참3");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if ( c ) {
            System.out.println("거짓3");
        }

        if ( c == false ) {
            System.out.println("참4");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참5");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓4");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참6");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
            System.out.println("거짓5");
        }

        if ( 10 != 10 || 10 < 2 ) {
            System.out.println("거짓6");
        }
            }
        }

