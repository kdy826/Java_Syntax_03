package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        car sonata = new car();
        sonata.year = 19;
        sonata.maxSpeed = 150;
        sonata.color = "주황색";


        System.out.println(sonata.year +"," + sonata.maxSpeed + ","+ sonata.color);


    }
}
class car{
    String model;
    int year ;
    String color;
    int maxSpeed;


}
//     int a = 10;
//
//     int[] arr = new int[5];
//
//     int[][]arr2 = new int[2][3];
//
//     arr2[0][0] = 1;
//     //..
//     arr2[0][2] = 3;

//Scanner sc = new Scanner(System.in);
//
//int[] 철수0 = new int[3];
//// 철수0[0] = 12; -> 데이터의 의미?
//// 자바에서 기본으로 제공하는 기본 객체타입
//// 하나의 객체에 여러개의 타입 x
//
//IntArr intArr = new IntArr();
//// 클래스가 정의되어있지않으면 클래스를 직접만든다.
//
//
//
//
//철수 a = new 철수();
////사용자 정의 객체를 만들고싶어 -> 위의 이유 때문에
////사용자 정의 객체는 여러개의 타입 사용가능 자유도
//a.이름 =" 김철수";
//a.나이 = 23;
//a.키 = 165.3;
//
//        }
//
//
//        }
//class 철수{    //설계도가 없을때는 설계도를 직접 만든다.
//
//    String 이름;
//    int 나이;
//    double 키;
//
//}
//
//
//class IntArr{
//
//}