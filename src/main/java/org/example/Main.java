package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//    무기 a무기 = new 칼(); // 원래는 서로 같은 클래스로 생성해야하지만 상속으로 연결하면 가능함
//    double d = 1;
//        System.out.println(d);
//    int i = (int)1.2;
//        System.out.println(i);
//
//        a무기.공격(); //부모 클래스에 메소드 틀이 없어서 에러
//    }
//    }

//interface class 무기 추상 메소드만 받고있는 추상 클래스
//interface 클래스는 자식클래스한테 extends 가아닌 implements 로 해야함
// implements는 다중상속이 가능함 ex : class 칼 implements 무기, 무기2{ }
//    abstract class 무기{    // abstract 클래스는 body {} 중괄호를 자르는 제한 클래스
//       abstract void 공격();// 메소드만 허용하고 코딩을 막음 - 구현하지마
//
//       abstract void 방어(); // 단 부모클래스가 abstract를 쓰면 자식 클래스는 반드시 오버라이딩 해야함
//    }

//   class 무기{    // 부모 클래스에 메소드 틀이 없으면 아들 클래스 메소드 또한 출력안됨
//    void 공격(){
//    }
//}
//
//    class 칼 extends 무기{
//
//       void 공격(){
//           System.out.println("칼공격");  // 부모 메소드에 아무것도 안적혀있어도 재정의로 출력
//       }
//       void 방어(){
//
//       }
//
//    }
        오리 a오리 = new 오리();
        a오리.날다();

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();

        고무오리2 a고무오리2 = new 고무오리2();
        a고무오리2.날다();

    }
}

class 오리{
    static void 날다(){
        System.out.println("오리가 날아요~");
    }
}

class 청둥오리 extends 오리{

}
class 흰오리 extends 오리{

}
class

고무오리 extends 오리{
    static void 날다(){  // 오버라이딩 -> 재정의
        System.out.println("고무는 무거워서 못날아~");
    }
}

class 고무오리2 extends 고무오리{


}


