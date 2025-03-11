package org.example;

public class Main2 {
    public static void main(String[] args) {

        //======= 홀짝 2번문제
//
//
//        int rs = Math2.one_to_n_prime_numbers_count(10);
//        System.out.println("rs : " + rs);
//        // rs : 4
//        rs = Math2.one_to_n_prime_numbers_count(13);
//        System.out.println("rs : " + rs);
//        // rs :  6
//        rs = Math2.one_to_n_prime_numbers_count(16);
//        System.out.println("rs : " + rs);
//        // rs :  6
//        rs = Math2.one_to_n_prime_numbers_count(19);
//        System.out.println("rs : " + rs);
//        // rs :  6
//    }
//}
//class Math2{
//    static int one_to_n_prime_numbers_count(int i){
//        int a = 0;
//        if (i % 2 == 0) {
//            System.out.println("짝수입니다");
//
//        } else {
//            System.out.println("홀수입니다");
//        }
//        return i;
//    }
//}




        boolean rs = Math2.one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = Math2.one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // rs :  6
        rs = Math2.one_to_n_prime_numbers_count(16);
        System.out.println("rs : " + rs);
        // rs :  6
        rs = Math2.one_to_n_prime_numbers_count(19);
        System.out.println("rs : " + rs);
        // rs :  6
    }
}
class Math2{
    static boolean one_to_n_prime_numbers_count(int i){

         // i%2 == 0;

        if (i % 2 == 0) {
            System.out.println("짝수입니다");
            return true;

        } else {
            System.out.println("홀수입니다");
            return false;
        }

    }
}