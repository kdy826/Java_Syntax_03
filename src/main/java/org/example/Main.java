package org.example;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);


        int a=0;
        while(true) {
            try {
                System.out.println("숫자:");
                a = sc.nextInt(); // 대기 숫자를 입력할때까지
                sc.nextLine(); //버퍼를 비운다
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자 똑바로 써");


            }

        }


        System.out.printf("입력된 숫자 :%d\n" , a );

    }
}


