package org.example;

public class Main2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();


        a전사.공격(/* 수정가능지역 시작 */"브라이언" , "칼"/* 수정가능지역 끝 */);
        // 브라이언이(가) 칼(으)로 공격합니다.
        a전사.재공격(); // 브라이언이 칼로 재공격합니다


        a전사.공격(/* 수정가능지역 시작 */"필립" , "창"/* 수정가능지역 끝 */);
        // 필립이(가) 창(으)로 공격합니다.
        a전사.재공격(); // 필립이 창으로 재공격 합니다

        a전사.공격(/* 수정가능지역 시작 */"마크" , "지팡이"/* 수정가능지역 끝 */);
        // 마크(가) 지팡이(으)로 공격합니다.
        a전사.재공격();  //마크가 지팡으로 재공격합니다

    }
}

class 전사{

    String name;
    String weapon;

     void 공격(String 이름 , String 무기){


         System.out.println(이름 + " 이가 " + 무기 + "으로 공격합니다");
         name = 이름;
         weapon = 무기;

     }

    void 재공격(){

        System.out.println(name + " 이가 " + weapon + "으로 공격합니다");
    }

}
