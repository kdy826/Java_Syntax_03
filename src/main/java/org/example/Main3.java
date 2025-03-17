package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a>=90){
        System.out.println("A");
    }else if(a>=80&& a<90){
        System.out.println("B");
    } else if(a>=70&& a<80){
        System.out.println("C");
    } else if(a>=60 && a<70){
        System.out.println("D");
    }else{
        System.out.println("F");
    }


}
}
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    if (a>b ){
//        System.out.println(">");
//    }else if(a<b){
//        System.out.println("<");
//    }else if(a==b){
//        System.out.println("==");
//    }



// ==== 고양이 만들기
//        System.out.println("\\    /\\");
//        System.out.println(" )  ( ')");
//        System.out.println("(  /  )");
//        System.out.println(" \\(__)|");
//=========== 나머지 구하기
//int A = sc.nextInt();
//    int B = sc.nextInt();
//    int C = sc.nextInt();
//
//
//    if(2<=A&& A<=10000 && 2<=B && B<=10000&& 2<=C && C<=10000) {
//
//        System.out.println((A+B)%C);
//        System.out.println(((A%C)+(B%C))%C);
//        System.out.println((A*B)%C);
//        System.out.println(((A%C) * (B%C))%C);
// ===== 강아지 만들기
//        System.out.println("|\\_/|");
//        System.out.println("|q p|   /}");
//        System.out.println("( 0 )\"\"\"\\");
//        System.out.println("|\"^\"`    |");
//        System.out.println("||_/=\\\\__|");

// ===== 비교 조건문
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    if (a>b ){
//        System.out.println(">");
//    }else if(a<b){
//        System.out.println("<");
//    }else if(a==b){
//        System.out.println("==");
//    }

