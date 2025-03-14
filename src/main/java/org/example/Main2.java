package org.example;

public class Main2 {
    public static void main(String[] args) {
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.
        //주말 숙제
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
class 사람인력관리소{
    String 이름;
    int 나이;
    int 숫자;


    void add사람(String 이름 , int 나이){
     this. //this 함수 사용
    }
    static 사람 get사람(int 숫자){
        사람 a사람 = new 사람();
    // 예외처리 적용
        return new 사람();
    }
}

class 사람 extends 사람인력관리소{
    void 자기소개(){
       System.out.println("저는" + 숫자 + "번" +"이름은" + 이름 + 나이+"살입니다.") ;
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