package org.example;

public class Main2 {
    public static void main(String[] args) {
        // 수정가능지역 시작
       자동차 차 = new 페라리();
       페라리 a페라리 = (페라리)차;

        // 수정가능지역 끝
    }
}
class 자동차 {
    void 달리다() {}
    void 서다() {}
}
class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {}
}