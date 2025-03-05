package org.example;

public class Main {
    public static void main(String[] args) {

        int dan = 8;

        int i = 1;  // ~~ 부터

       while ( i <= 100){     // ~~ 까지
           System.out.println(dan + " * " + i + " = " + dan * i);
           i = i + 3; // i 의 값을 1 증가 시킨다. // ~~ 만큼
       }

        System.out.println(i);
        }






//        String s = "8 * 1 = 8\n";
//        s = s + "8 * 2 = 16\n";
//        s += "8 * 3 = 24\n";
//        System.out.println(s);

    }


