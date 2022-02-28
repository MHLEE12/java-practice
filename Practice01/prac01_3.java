package Practice01;
import java.util.Scanner;

public class prac01_3 {
    public static void main(String[] args) {
        /*
        ########################################################################################
        ### Q.3 키보드로 입력받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요. ###
        ########################################################################################
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 : ");
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("짝수다.");
            sc.close();
        } else {
            System.out.println("홀수다.");
            sc.close();
        }
    }
}
