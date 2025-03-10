package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    student kim = new student();

    kim.age = 23;
    kim.name = "chulsu";
    kim.solo = true;
    kim.person();
    }
    }
    class student{

    String name;
    int age;
    boolean solo;
    void person(){
        int age = this.age;
        boolean solo = this.solo;
        String name = this.name;
        System.out.printf("나이 : %d\n" ,age); // this.age , age 만 적어도 가능은 하나
        System.out.printf("이름 :%s\n" , name);// this.age 정도는 적어둘것 생략 가능한 함수
        System.out.printf("솔로 : %b\n" , solo);
        }

    }
        //=====차 객체
//        Scanner sc = new Scanner(System.in);
//
//        car sonata = new car(); //car 모양의 객체에 리모컨을 넣고 연결
//        sonata.name = "쏘나타";
//        sonata.year = 19;
//        sonata.maxSpeed = 150;
//        sonata.color = "주황색";
//
//        car santapae = new car();
//        santapae.name = "싼타페";
//        santapae.year = 10;
//        santapae.maxSpeed = 180;
//        santapae.color = "흰색";
//
//        System.out.println(sonata.name + "," + sonata.year + "," + sonata.maxSpeed + "," + sonata.color);
//        System.out.println(santapae.name + "," + santapae.year + "," + santapae.maxSpeed + "," + santapae.color);
//
//
//        player kim = new player();
//        player.이름 = "kim";
//        player.나이 = 15;
//        kim.나이++;
//        System.out.println(player.나이);
        //class car {
//    String name;
//    String model;
//    int year;
//    String color;
//    int maxSpeed;
//
//
//
//
//
//}

//class player {
//    static String 이름;
//    static int 나이;
//}


// =====사람 , this 불러오는법

//        사람 a사람 = new 사람();
//        a사람.name = "김철수";
//        a사람.age = 13;
//        a사람.introduce();
//
//        a사람.name = "김영희";
//        a사람.age = 34;
//        a사람.introduce();
//
//
//    }
//}
//
//
//class 사람{
//    int age = 22;
//    String name;
//    boolean isMarried;
//        void introduce(){
//            int age = this.age; // 인스턴스 안에있는 인스턴스 변수의 값을 리모컨에 가져옴
//            String name = this.name; //고정된값이 아닌 인스턴스 변수에 값을 불러와서 출력함
//            System.out.println("===자기소개");
//            System.out.printf("이름 : %s\n" , name);
//            System.out.printf("나이 : %d\n" , age);
//    }
//}
//     int ;a = 10;
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
/// / 철수0[0] = 12; -> 데이터의 의미?
/// / 자바에서 기본으로 제공하는 기본 객체타입
/// / 하나의 객체에 여러개의 타입 x
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