package org.example;

class Main3 {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // 여기선 자동형변환 허용
         i = (int)d; // 여기선 자동형변환 불가능

        System.out.println(i);
    }
}