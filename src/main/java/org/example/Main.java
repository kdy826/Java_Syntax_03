package org.example;

public class Main {
    public static void main(String[] args) {

//        System.out.println("문제 5번 나이에 맞게 보기를 골라주세요");
//        int age = 36;
//
//        if (age >= 1 && age < 10) {
//            System.out.println("유아 아동");
//        } else if (age >= 10 && age < 20) {
//            System.out.println("10대");
//        } else if (age >= 20 && age < 30) {
//            System.out.println("20대");
//        } else if (age >= 30 && age < 40) {
//            System.out.println("30대");
//        } else {
//            System.out.println("40대 이상");
//        }
//

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

//        int age = 66; // 이 값을 바꿔가면서 실행해보세요.
//
//        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
//        if (age <=18 ){
//            System.out.println("할인대상이 아닙니다");
//        }
//        else if (age >=60){
//            System.out.println("할인대상이 아닙니다");
//        }
//        else {
//            System.out.println("할인대상입니다");
//        }

//        if(age <=19 || age >=60){
//            System.out.println("할인대상입니다");
//        }
//        else{
//            System.out.println("할인대상이 아니랑께~");
//        }
//
//        if (age <= 19 || age >= 60) {
//            System.out.println("할인대상");
//        }
//        else{
//            System.out.println("할인대상이 아닙니다");
//        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.

        // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
//            =======v1========
//
//        System.out.println( " 8 * 1 =" + 8);
//        System.out.println( " 8 * 2 =" +8 * 2);
//        System.out.println( " 8 * 3 ="+ 8 * 3 );
//        System.out.println( " 8 * 4 =" +8 * 4);
//        System.out.println( " 8 * 5 ="+ 8 * 5);
//        System.out.println( " 8 * 6 ="+ 8 * 6);
//        System.out.println( " 8 * 7 ="+ 8 * 7);
//        System.out.println( " 8 * 8 =" +8 * 8);
//        System.out.println( " 8 * 9 =" +8 * 9);


//        ==========v2========
//        int dan = 8;
//
//        System.out.println(dan +" * 1 = 8");
//        System.out.println(dan+ " * 2 = 16");
//        System.out.println(dan +" * 3 = 24");
//        System.out.println(dan +" * 4 = 32");
//        System.out.println(dan +" * 5 = 40");
//        System.out.println(dan +" * 6 = 48");
//        System.out.println(dan +" * 7 = 56");
//        System.out.println(dan +" * 8 = 64");
//        System.out.println(dan +" * 9 = 72");

//           ==========v3==========

*/
//        int dan = 5;
//        System.out.println(dan + " * 1 = " + dan * 1);
//        System.out.println(dan + " * 2 = " + dan * 2);
//        System.out.println(dan + " * 3 = " + dan * 3);
//        System.out.println(dan + " * 4 = " + dan * 4);
//        System.out.println(dan + " * 5 = " + dan * 5);
//        System.out.println(dan + " * 6 = " + dan * 6);
//        System.out.println(dan + " * 7 = " + dan * 7);
//        System.out.println(dan + " * 8 = " + dan * 8);
//        System.out.println(dan + " * 9 = " + dan * 9);
 //         ======================v4==============
//        int dan = 8;
//
//        // 수정가능지역 시작
//        int i = 1;
//
//        System.out.println(dan + " * " + i + " = " + dan * 1);
//        System.out.println(dan + " * " + (++i) + " = " + dan * 2);
//        System.out.println(dan + " * " + (++i) + " = " + dan *3);
//        System.out.println(dan + " * " + (++i) + " = " + dan * 4);
//        System.out.println(dan + " * " + (++i) + " = " + dan * 5);
//        System.out.println(dan + " * " + (++i) + " = " + dan * 6);
//        System.out.println(dan + " * " + (++i) + " = " + dan * 7);
//        System.out.println(dan + " * " + (++i) + " = " + dan * 8);
//        System.out.println(dan + " * " + (++i) + " = " + dan * 9);




    }
}


