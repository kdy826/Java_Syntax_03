package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        boolean result = Math.isPrimeNumber(1);
//        System.out.println("1은(는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(2);
//        System.out.println("2은(는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(3);
//        System.out.println("3은(는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(4);
//        System.out.println("4은(는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(5);
//        System.out.println("5은(는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(7);
//        System.out.println("7은(는) 소수인가? : " + result);
//
//
//        result = Math.isPrimeNumber(8);
//        System.out.println("8은(는) 소수인가? : " + result);
//
//
//        result = Math.isPrimeNumber(9);
//        System.out.println("9은(는) 소수인가? : " + result);
//
//
//        result = Math.isPrimeNumber(10);
//        System.out.println("10는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(11);
//        System.out.println("11은(는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(12);
//        System.out.println("12은(는) 소수인가? : " + result);
//
//        result = Math.isPrimeNumber(13);
//        System.out.println("13은(는) 소수인가? : " + result);
//
//
//        result = Math.isPrimeNumber(14);
//        System.out.println("14은(는) 소수인가? : " + result);
//
//
//        result = Math.isPrimeNumber(15);
//        System.out.println("15은(는) 소수인가? : " + result);


//        int rs = one_to_n_prime_numbers_count(2);
//        System.out.println("rs : " + rs);
//        // rs : 4
//        rs = one_to_n_prime_numbers_count(3);
//        System.out.println("rs : " + rs);
//
//        rs = one_to_n_prime_numbers_count(5);
//        System.out.println("rs : " + rs);
//
//    }
//    static int one_to_n_prime_numbers_count(int a){
//        int count = 0;
//
//        for(int i = 1 ; i<= a ; i ++){
//            if (Math.isPrimeNumber(i)){
//                System.out.println(i);
//                count ++;
//            }
//        }
//
//        return count;
//    }
//}
//
//class Math {
//    static boolean isPrimeNumber(int a) {
//        if ( a ==1 ){
//            return false;
//        }
//        for(int i = 2; i<a ; i++) {
//            if(a % i == 0) {
//
//                return false;
//            }
//        }
//// return a / 2 == 1 ;
//
//        return true;
    } // 소수 참트루 함수

}


//     void int one_to_n_prime_numbers_count(int i) {
//
//
//        return i;
//      }
// }

// === 매개변수  메소드 시그니처 전역변수
//        //계산기 합();
//        계산기.합(10, 20);
//        계산기.합(30, 40);
//        계산기.합(3); // 매개변수가 한개이면 한개쪽으로감
//        //메소드 오버로딩
/// /        계산기.합(10,true); // 단, 타입이 다르거나 자료형 갯수
/// /        계산기.합(20,20.1); //가 다르면 에러가 뜬다.
/// /        계산기.합(10,40,100);
/// /        계산기.합(10);

// static int a = 20;  //전역변수 변수가 메소드 외부에 있음
//        System.out.println(a);
//
//        int a = 30;  // 지역변수 메소드 안에있음
//
//        System.out.println(a);
//
//        계산기.합(10,20);
//
//        exam();
//
//    }
//    public static void exam(){
//        System.out.println(a); // 전역변수랑 연결되는 a 그러므로 20이 출력됨
//
//    }
//
//}
//
//class 계산기 {
//    static void 합(int cc){ // 메소드 시그니처
//        int a = 10;
//
//
//    }
//    static void 합(int a, int b) { //매개변수
/// /         int a  =50;
//
//         }
//
//}


//        System.out.println(계산기.합(10,20));
//        //return a+b를 했기때문에 값이 초기화됌
//        계산기.합(80,90);
//
//
//    }
//}
//class 계산기 {
//    static int 합(int a , int b) {
//        // void는 return을 안할의무가있고
//        //void를 뺀 나머지는 return 을 할 의무가생김 그래서 return 을 해야한다.
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//
//        System.out.println(a+b);
//       return a + b; // a + b 를 초기화 함
/// /        return; // 리턴하지  않겠다는뜻
//    }
//}

//======1번문제
//        int 결과;
//
//        계산기.합(10, 20);
//
//
//        // 출력 => 결과 : 30
//
//       계산기.합(30, 20);
//
//        // 출력 => 결과 : 50
//
//        계산기.합(30, 70);
//
//        // 출력 => 결과 : 100
//
//        계산기.차(30, 70);
//
//        // 출력 => 결과 : -40
//
//        계산기.곱(3, 7);
//
//        // 출력 => 결과 : 21
//    }
//}
//class 계산기{
//    static void 합(int a , int b){
//        System.out.println("결과 : " + (a+b) );
//    }
//
//    static void 차(int a , int b){
//        System.out.println("결과" + (a - b));
//    }
//    static void 곱(int a , int b){
//        System.out.println("결과" + a* b);
//    }
//
//}
//class 결과{
//
//}


//======28강 2번문제 (미완)
// 예시 시작
//        int c = 20 + Math.더하기(10, 20);
//        System.out.println(c);
//        // 예시 끝
//
//        int 결과1 = Math.oneToSum(3);
//        System.out.println("결과1 : " + 결과1);
//        // 출력 : 결과1 : 6
//
//        int 결과2 = Math.oneToSum(10);
//        System.out.println("결과2 : " + 결과2);
//        // 출력 : 결과2 : 55
//    }
//}
//
//class Math {
//    // static => 본사직원
//    // static은 현재 클래스에 지금당장 존재한다.
//    static int 더하기(int a, int b) {
//        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
//        int c = a + b;
//
//        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
//        // return => 변신
//        return c;
//    }
//
//    static int oneToSum(int c) {
//        int sum=0;
//        for (int i = 0; i < c; i++)
//
//          sum += c ;
//
//
//        return sum;
//    }
//}

//============28강 2번문제 ( 정답)
//int c = 20 + Math.더하기(10, 20);
//        System.out.println(c);
/// / 예시 끝
//
//int 결과1 = Math.one_To_Sum(3);
//        System.out.println("결과1 : " + 결과1);
//// 출력 : 결과1 : 6
//
//int 결과2= Math.one_To_Sum(10);
//        System.out.println("결과2 : " + 결과2);
//// 출력 : 결과2 : 55
//int 결과3= Math.one_To_Sum(7);
//        System.out.println("결과2 : " + 결과3);
//// 출력 : 결과2 : 55
//    }
//            }
//
//class Math {
//    // static => 본사직원
//    // static은 현재 클래스에 지금당장 존재한다.
//    static int 더하기(int a, int b) {
//        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
//        int c = a + b;
//
//        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
//        // return => 변신
//        return c;
//
//    }
//    static int one_To_Sum(int n){
//        int sum = 0;
//
//        for(int i = 0; i <=n; i++){
//            sum+=i;
//        }
//
//        return sum;
//    }
//}


//============28강 3번문제

//int 결과1 = Math.nToMSum(2, 3);
//        System.out.println("결과1 : " + 결과1);
//// 출력 : 결과1 : 5
//
//int 결과2 = Math.nToMSum(5, 10);
//        System.out.println("결과2 : " + 결과2);
//// 출력 : 결과2 : 45
//    }
//            }
//
//class Math {
//    static int nToMSum(int n , int m){
//        int sum  = 0;
//        for(int i = n ; i <= m; i++){
//            sum +=i;
//
//        }
//        return sum;
//    }
//}