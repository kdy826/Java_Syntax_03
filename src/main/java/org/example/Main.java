package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//    int rows =4; // 변수 성립

//    for (int i = 1; i <= rows; i++){  //for문 변수 i 정의 i에서 rows 개수까지 i는 증강연산
//        for(int k =1; k <= i; k++){ //작은 for문 변수 k를 i까지 k도 i처럼 증강연산
//            System.out.print("* "); // 별 출력
//        }
//        System.out.println();  //  위에줄 k에서 별 출력 줄바꿈
//    }                          //반복문 안에있으니 줄바꿈 출력  k도 증강연산 적용이라
//
        //i는 rows 와 연동되어 네줄까지 바꾸고 k 별도 i와 마찬가지로 4개까지 나타냄


//    int i =1;
//            while(i<=rows){
//                int k = 1;
//                while(k<=i){
//                    System.out.print("* ");
//                    k++;
//                }
//                System.out.println();
//                i++;
//        }

        //        코드가 어떤식으로 진행되는지 설명할수있을정도로 방법 이해할것


//        int n = 13;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n - 1; i >= 1; i--) {
//            for (int k = n; k > i; k--) {
//                System.out.print(" ");
//            }
//             for (int k = 1; k <= (2 * i -1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//     char c = 'a';
//
//        System.out.println(c);
//        System.out.printf("%c \n" , c); // %는 서식지정자
//
//        int a = 97;
//
//        System.out.println(a);
//        System.out.printf("%d\n" , a); //%d 는 서식 지정자 문자를 정수로 해석하겠다는뜻
//        System.out.printf("%c\n" , a); //%c 는 서식 지정자로 정수를 문자로 해석 하겠다는뜻
//        // %f는 문자를 실수로 해석 %s는 문자열로 해석
//
//        int aa = 65 + 3;
//
//        System.out.printf("%c\n" , aa);

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println( "num : "+ num);
    }
    }