package org.example;
import java.util.HashMap;
import java.util.Map;

import java.util.List;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.
        //주말 숙제
        // 사람인력관리소 객체 생성
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        // 첫 번째 사람 추가 (이름: 홍길순, 나이: 33)
        a사람인력관리소.add사람("홍길순", 33);
        // 출력: 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.

        // 두 번째 사람 추가 (이름: 홍길동, 나이: 20)
        a사람인력관리소.add사람("홍길동", 20);
        // 출력: 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.

        // 세 번째 사람 추가 (이름: 임꺽정, 나이: 30)
        a사람인력관리소.add사람("임꺽정", 30);
        // 출력: 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        // 1번 사람의 정보 출력
        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개(); // 출력: 저는 1번, 홍길순, 33살 입니다.

        // 2번 사람의 정보 출력
        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개(); // 출력: 저는 2번, 홍길동, 20살 입니다.

        // 3번 사람의 정보 출력
        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개(); // 출력: 저는 3번, 임꺽정, 30살 입니다.
    }
}
class 사람인력관리소 {
    // 사람을 관리하는 클래스. a처음사람을 포함하여 사람 객체들을 변수로 선언.
    사람 a처음사람;
    사람 사람1; // 첫 번째 사람을 저장하는 변수
    사람 사람2; // 두 번째 사람을 저장하는 변수
    사람 사람3; // 세 번째 사람을 저장하는 변수
    int 사람수 = 0; // 사람 수를 세는 변수

    String 이름; // 이름 변수
    int 나이; // 나이 변수
    int 숫자; // 숫자(몇 번째 사람인지를 나타냄)

    // 사람을 추가하는 메서드
    void add사람(String 이름, int 나이) {
        int 번호 = 사람수+1;
        사람수++; // 사람 수를 1 증가
        사람 a사람 = new 사람(이름, 나이, 사람수); // 새로운 사람 객체 생성
        a사람.번호 = 번호;
        a사람.이름 =이름;
        a사람.나이 =나이;


        if(번호 ==1){
            사람1 = a사람;
        }if(번호 ==2){
            사람2 = a사람;
        }else if(번호 ==3){
            사람3 = a사람;
        }
        // 새로 추가된 사람에 대한 정보를 출력
        System.out.println("나이가 " + 나이 + "살인 " + 사람수 + "번째 사람(" + 이름 + ")이 추가되었습니다.");

        // 첫 번째 사람을 a처음사람에 할당하는 것처럼 보이지만, 실제로는 필요하지 않음
        a처음사람 = a사람; // 현재 추가된 사람을 'a처음사람'에 저장
    }

    // 사람 번호에 맞는 사람을 반환하는 메서드
    사람 get사람(int 번호) {
        if(번호 ==1){
            return 사람1;
        }if(번호 ==2){
            return 사람2;
        }else if(번호 ==3){
            return 사람3;
        }
        return null;
    }
}

class 사람 {
    String 이름; // 이름
    int 나이; // 나이
    int 번호; // 사람의 번호

    // 사람 객체의 생성자 (이름, 나이, 번호를 초기화)
    public 사람(String 이름, int 나이, int 번호) {
        this.이름 = 이름;
        this.나이 = 나이;
        this.번호 = 번호;
    }

    // 자기소개 메서드
    void 자기소개() {
        System.out.println("저는 " + 번호 + "번, " + 이름 + ", " + 나이 + "살 입니다.");
    }
}

//    사람 a사람 = new 사람();
//    a사람.setid(20);
////    a사람.id = 20;
////        System.out.println("번호:" + a사람.id);
//        System.out.println("번호:" + a사람.getid());
//    }
//}
//
//class 사람{  // 게터와 세터 쉽게 만드는법은 우클릭 generate 클릭 게터 세터 생성
//
//    private int id ;
//    //  private int id;    //private 외부접근 제한 상태라 안됨
//    public int getid(){   // getter 게터
//        return id;
//    }
//    public void setid(int id){ // setter 세터
//        this.id = id;