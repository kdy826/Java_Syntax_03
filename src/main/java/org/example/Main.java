package org.example;

public class Main {
    public static void main(String[] args) {
        // ========v3
//      int dan = 8;
//      int i = 1000;
//      while(i>=1){
//          System.out.println(dan + " * " + i +"=" + dan * i );
//          i--;
//      }
// =================v3 for.ver
//        int dan = 8;
//        for(int i =1000; i>=-25; i--){
//            System.out.println(dan + " *" + i + "=" + dan * i);
//        }
//============= v4
//        int dan = 8;
//
//      int i = 1000;
//      while(i>=-500){
//          System.out.println(dan + " * " + i +"=" + dan * i );
//          i--;
//      }

        // =================v4 for.ver
//        int dan = 8;
//        for(int i =1000; i>=-500; i--){
//            System.out.println(dan + " *" + i + "=" + dan * i);
//        }

/// ==========v5
//        int i =1;
//        int j =0 ;
//        while (i <= 5) {
//            j = j + i;
//
//            i = i + 1;
//        }

        // =================v5 for.ver

//        int sum = 0;
//        for(int i = 1; i<=5; i++){
//            System.out.println("i의 값 :" + i);
//            sum = sum + i;
//            System.out.println("sum의 값 :" + sum);
//
//        }
//        System.out.println(sum);

//=================v6
//        int i =-100;
//        int j =0;
//        while (i <= 25) {
//            j = j + i;
//
//            i = i + 1;
//        }
//        System.out.println(j);


//        System.out.println("===for===");
//        for (int n = 1; n < 3 ; n++){
//
//            System.out.println(n);
//            n++;
//        }

        // =================v6 for.ver

//        int sum = -100;
//        for(int i = 0; i<=25; i++){
//
//            sum = sum + i;
//
//
//        }
//        System.out.println(sum);


// =============v2
//        int i = -100;
//        while (i <= 25) {
//            System.out.println(i);
//            i++;

// =============v2 for.ver
//        for( int i= -100; i<=25; i++){
//            System.out.println(i);
//        }

//        }
//==============v1
//        int i = 1;
//        while(i <=5){
//            System.out.println(i);
//            i++;
//        }

        //  ====v1 for.ver
//        for(int i=1; i<=5; i++){
//            System.out.println(i);
//        }

//        =======================v7===========
        int i = 1;
        int j = 1;
        while (j <= 10) {
            while (i <= 3) {
                System.out.println(i);
                i++;
            }
            i = 1;
            j++;

        }
        // =========v7 for.ver
//        for(int j = 1; j<=10 ; j ++) {
//            for (int i = -1; i <= 3; i++) {
//                System.out.println(i);
//            }
//        }


    }
}


