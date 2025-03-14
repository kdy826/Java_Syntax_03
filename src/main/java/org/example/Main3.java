package org.example;

import java.util.ArrayList;

class Main3 {
    public static void main(String[] args) {
    }
}
//오브젝트 클래스 + toString
//    사람 a사람 =new 사람("김철수",22);
//    사람 a사람2 =new 사람("김수",22);
//        System.out.println(a사람);
//        System.out.println(a사람2);
//        System.out.printf("이름 : %s , 나이 : %d" ,a사람.name , a사람.age );
//
//    }
//}
//class 사람 extends Object { // 오브젝트 클래스의 상속을 받았음
//    String name;
//    int age;
//
//    public String toString(){
//        return "사람 [이름 +" + name + " 나이" + age+"]";
//    }
//
//    사람(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
// === 자바 String 문장 String new 문장은 다르다
//        Person p1 = new Person(13);
//        Person p2 = new Person(13);
//
//        System.out.println(p1);
//        System.out.println(p2);
//
//        System.out.println("p1 == p2 : " + (p1 == p2)); // 리모컨끼리 비교, 당연히 false
//        System.out.println("p1.equals(p2) : " + p1.equals(p2));
//        // f -> 어떤 내용이 같을 때 같다는 취급을 할건지에 대한 명시 x
//        // 객체끼리 비교, Person 클래스에 equals 메서드를 오버라이드 하지 않아서 false
//        // 즉, 객체 비교를 하려면 해당 클래스에 equals 메서드를 오버라이드 해야함
//
//        String s1 = "하하"; // 문장 객체 생성됨
//        String s2 = "하하"; // 객체의 리모컨만 리턴, 이유 : 메모리 절약
//
//        System.out.println(s1);
//        System.out.println(s2);
//
//        System.out.println("s1 == s2 : " + (s1 == s2));
//        System.out.println("s1.equals(s2) : " + s1.equals(s2));
//
//        String s3 = new String("하하"); // 재활용 x
//        String s4 = new String("하하"); // 재활용 x
//
//        System.out.println("s3 : " + s3);
//        System.out.println("s4 : " + s4);
//
//        System.out.println("s3 == s4 : " + (s3 == s4));
//        System.out.println("s3.equals(s4) : " + s3.equals(s4));
//
//    }
//}
//
//class Person {
//    private int age;
//
//    public Person(int age) {
//        this.age = age;
//    }
//
//}


// ====== 자바 한글
//        System.out.println(isHanguel(' '));
//        System.out.println(isHanguel('안'));
//        System.out.println(isHanguel('녕'));
//        System.out.println(isHanguel('하'));
//        System.out.println(isHanguel('세'));
//        System.out.println(isHanguel('요'));
//        System.out.println(isHanguel('.'));
//    }
//
//    static boolean isHanguel(char c) {
//        return c >= '가' && c <= '힣';
//    }
//}