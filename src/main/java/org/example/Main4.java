package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'a';

        System.out.println(c1 == c2); // true

        // String 은 char의 순서있는 조합이다.
        String s1 = "하하";
        String s2 = "하";
        s2 += "하";

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
//  String s ="하";
//  char a ='하';
//
//
//  char cc = 'a';
//  cc = 'b';
//
//  String ss = "abc" + " ";
//
//    }
//}

//        List<Number> l = new ArrayList<>(); // 동적 할당(dynamic allocation)
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        l.add(40);
//        l.add(50);
//
//        l.remove(3);
//        System.out.println(l);
//
//    }


//        int rs = 계산기.나누다(10, 0);
//        System.out.println(rs);
//        System.out.println(123);
//    }
////catch (Exception e){ // exception 은 예외처리 오류중 최상의 오류
//    // 모든오류를 다 넘겨줌
////    }
//
//}
//class 계산기 {
//    static int 나누다(int a, int b) {
////        return a/b;
//        int rs = 0;
//        try {  // 만약 rs = a/b 가 잘못되면 넘어가
//            rs = a / b;
//        } catch (ArithmeticException e) { // e는  변수
//            System.out.println("try 중에 잘못됨");
//
//        }
//        return rs;
//    }

