package Practice01;

import java.util.Scanner;

public class prac01_1 {
    public static void main(String[] args) {
        /*
        ##############################################################################################
        ### Q.1 키보드로 입력받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요. ###
        ##############################################################################################
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 : ");
        int i = sc.nextInt();
        if (i > 0) {
            System.out.println("양수다.");
            sc.close();
        } else {
            System.out.println("양수가 아니다.");
            sc.close();
        }
    }
}
