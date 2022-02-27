import java.util.Scanner;

public class JavaStudy07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //system.in은 사용자가 입력한 값을 가져오라는 뜻
        while(sc.hasNextInt()) { //정수를 입력하면 무한히 반복하다가 문자가 입력되면 false가 되어 종료된다.
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }
}
