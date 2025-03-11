package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    }
}


// ================자동차 최고속력
//        자동차 a자동차 = new 자동차();
//        자동차 a자동차2 = new 자동차();
//        자동차 a자동차3 = new 자동차();
//
//
//        a자동차.번호 = 1;
//        a자동차.최고속력 = 130;
//        a자동차.달리다();
//
//        a자동차2. 번호 = 2;
//        a자동차2.최고속력 = 150;
//        a자동차2.달리다();
//
//
//    }
//}
//
//class 자동차 {
//    int 속도;
//    int 최고속력;
//    int 번호;
//    void 달리다() {
//        System.out.printf(this.번호 +"번"+"최고속력: %d\n" , this.최고속력 );
//    }
//
//}
//
//student kim = new student();
//
//kim.age = 23;
//kim.name = "chulsu";
//kim.solo = true;
//        kim.person();
//    }
//            }

// ===========학생
//class student{
//
//    String name;
//    int age;
//    boolean solo;
//    void person(){
//        int age = this.age;
//        boolean solo = this.solo;
//        String name = this.name;
//        System.out.printf("나이 : %d\n" ,age); // this.age , age 만 적어도 가능은 하나
//        System.out.printf("이름 :%s\n" , name);// this.age 정도는 적어둘것 생략 가능한 함수
//        System.out.printf("솔로 : %b\n" , solo);
//    }
//
//}
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

// ==============메소드 서브메소드 클래스 서브클래스


//class player {
//    static String 이름;
//    static int 나이;
//}

//        MY a = new MY(); // 메인클래스가 아닌 클래스는 객체로 생성
//        a.or();// 그래야 메소드 호출가능
//
//
//        hi(); // 메인 클래스 안에있는 메소드라 바로 호출가능
//
//
//    }
//
//    static void hi() {  // 서브 메소드 만들때는 static
//
//    }
//}
//
//class MY {
//    void or() {

// =================static 메소드

//        //1
//        자동차 a = new 자동차();
//        a.달리다();
//        a.서다();
//
//        //2
//        new 자동차().달리다();
//        new 자동차().서다();
//
//        //3
//
//
//        자동차.달리다();
//        자동차.서다(); //static 이 없어서 에러
//
//
//
//    }
//}
//
//class 자동차 {
//    //static : 객체화 하지 않고 쓰겠다, 설계도 차원에서 기능 뽑아서 쓰고있어
//
//    int 속력;
//
//    static void 달리다() {
//        System.out.println("으로 달리다");
//    }
//
//    void 서다() {
//        System.out.println("서다");
//    }
//}
