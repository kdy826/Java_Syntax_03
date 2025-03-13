package org.example;

public class Main4 {
    public static void main(String[] args) {
        사람 a사람 = new 김철수();


        System.out.println("===사람정보");
        System.out.printf("이름: %s\n", a사람.이름);
        System.out.printf("나이: %d\n", a사람.나이);


        사람 b사람 = new 사람();

        b사람.이름 = "이영희";
        System.out.println("====사람정보");
        System.out.printf("이름: %s\n", b사람.이름);
        System.out.printf("나이: %d\n", b사람.나이);

        전사 a = new  전사();
    }


}
class 전사{

}

class 사람 { //생성자는 클래스타입과 같은이름을  가져감
    String 이름;
    int 나이;

//     void 나이를 _22_살_로설정(){ //수동
//          this.나이 = 22;
//    }
    사람(){  //생성자 자동
          System.out.println("사람 나이 생성자 실행됨");
          this.나이 = 22;
    }
    사람(String 이름){  //생성자 자동
        System.out.println("사람 이름 생성자 실행됨");
        this.이름 = 이름;
    }

}
class 김철수 extends 사람{
   김철수(){
       System.out.println("김철수 생성됨");
       this.이름 = " 김철수";
   }
}


//     인간 a사람 = new 인간();
//     a사람.나이 = 22;
//     a사람.왼팔 = new 팔(); // 클래스 팔 생성
//     a사람.왼팔.길이 = 10;  //a사람으로부터 인스턴스변수 왼팔에서
//                            // 팔객체 길이까지 두번이동
//
//    }
//
//}
//class 인간{
//    int 나이;
//    팔 왼팔;  //인스턴스 변수에는 팔의 리모콘 왼팔을 넣는다.
//}
//class 팔{
//   int 길이;
//}