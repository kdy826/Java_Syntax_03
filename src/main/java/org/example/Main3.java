package org.example;

class Main3 {
    public static void main(String[] args) {
    }
    }
//        전사3 a전사 = new 전사3();
//
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//
//        a전사.나이++;
//        a전사.자기소개();
//
//        a전사.나이 = 30;
//        a전사.이름 = "진";
//        a전사.자기소개();
//
//        a전사.a무기 = new 활3();
//        a전사.공격();
//        //출력 : 진이 활로 공격합니다.
//
//        a전사.a무기 = new 칼3();
//        a전사.공격();
//        //출력 : 진이 칼로 공격합니다.
//    }
//}
//
//class 전사3 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기3 a무기;
//
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//    }
//    void 공격(){
//        a무기.공격자명 = this.이름;
//        a무기.사용();
//    }
//}
//
//class 무기3 extends 전사3 {
//    String 공격자명;
//    void 사용() {
//
//    }
//}
//
//class 칼3 extends 무기3 {
//
//    void 사용(){
//        System.out.println( 공격자명+ "가 칼2로 공격합니다");
//    }
//}
//
//class 활3 extends 무기3 {
//
//    void 사용(){
//        System.out.println("카니가 활2로 공격합니다");
//    }
//}